package mx.com.beo.rediscomponent;

import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class Main {
	
	
public static void main(String[] args) {
		
		RedisOperations redisOperations = new RedisOperations();
//		redisOperations.insertElementsInList("rey", "rey");
//		redisOperations.insertElementsInList("rey", "ivan");
//		redisOperations.insertElementsInList("rey", "ivan 2");
//		redisOperations.insertElementsInList("rey", "ivan 3");
//		redisOperations.insertElementsInList("rey", "ivan 4");
//		redisOperations.insertElementsInList("rey", "ivan 5");
//		redisOperations.insertElementsInList("rey", "ivan 6");
//		redisOperations.insertElementsInList("rey", "ivan 7");
//		redisOperations.insertElementsInList("rey", "ivan 8");
		
		List<String> lista= redisOperations.getAllElementsInList("123");
		
		for(String dato:lista){
			System.out.println(dato);
		}
		
		
//		 RedisOperations operations=new RedisOperations();
//		 long l=operations.expireList("123", 50);
//		 System.out.println("expira la lista   "+l);
	}

}
