package org.giveu.mjf;

import redis.clients.jedis.Jedis;

public class JedisTest {
	
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.48.133",6379);
		jedis.set("name", "xiaoming");
		System.out.println("name"+jedis.get("name"));
	}

}
