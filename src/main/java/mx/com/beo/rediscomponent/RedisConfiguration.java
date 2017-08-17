package mx.com.beo.rediscomponent;


import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisConfiguration {

    private String host;
    private Integer port;


    public RedisConfiguration()
    {
        if(System.getenv("HOST_REDIS") != null && System.getenv("PUERTO_REDIS") != null)
        {
            this.host= System.getenv("HOST_REDIS");
            this.port= Integer.valueOf(System.getenv("PUERTO_REDIS"));
        }
        else
        {
            host="localhost";
            port= 6379;
        }
        jedisPool= new JedisPool(jedisPoolConfig,host,port);
    }

    public final JedisPoolConfig jedisPoolConfig = buildPoolConfig();
    private JedisPool jedisPool;

    private JedisPoolConfig buildPoolConfig() {
        final JedisPoolConfig poolConfig = new JedisPoolConfig();
        poolConfig.setMaxTotal(128);
        poolConfig.setMaxIdle(128);
        poolConfig.setMinIdle(16);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(true);
        poolConfig.setTestWhileIdle(true);
        poolConfig.setNumTestsPerEvictionRun(3);
        poolConfig.setBlockWhenExhausted(true);
        return poolConfig;
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }
}
