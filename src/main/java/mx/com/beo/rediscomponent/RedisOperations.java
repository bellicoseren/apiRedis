package mx.com.beo.rediscomponent;

import redis.clients.jedis.Jedis;
import java.util.List;
import java.util.Set;

public class RedisOperations
{

    private static final RedisConfiguration redisConfiguration= new RedisConfiguration();

    public void insertElementInList(String listName, String element)
    {

        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            jedisConnection.lpush(listName, element);
        }

    }

    public void insertElementsInList(String listName, String... element)
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            jedisConnection.lpush(listName, element);
        }

    }

    public void removeElementsInList(String listName, String value)
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            jedisConnection.lrem(listName,0,value);
        }

    }


    public List<String> getAllElementsInList(String listName)
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            return jedisConnection.lrange(listName, 0, jedisConnection.llen(listName));
        }
    }

    public void setKeyValue(String key, String value)
    {

        try (  Jedis jedisConnection = redisConfiguration.getJedisPool().getResource() )
        {

            jedisConnection.set(key,value);
        }
    }

    public void deleteKey(String key)
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            jedisConnection.del(key);
        }
    }


    public String getKeyValue(String key)
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            return jedisConnection.get(key);
        }
    }


    public Set<String> getKeysNames()
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            return jedisConnection.keys(".*");
        }
    }


    public String getLastElementInList(String nameList)
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            return jedisConnection.lpop(nameList);
        }
    }

    public void deleteList(String nameList)
    {
        try (Jedis jedisConnection = redisConfiguration.getJedisPool().getResource()) {
            Long len= jedisConnection.llen(nameList);
            for(int i= 0; i < len; i++)
            {
                jedisConnection.lpop(nameList);
            }
        }
    }
}
