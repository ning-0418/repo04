package com.offcn;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class App01 {
    public static void main(String[] args) {
//        //1.获取jedis连接
//        Jedis jedis = new Jedis("192.168.204.28",6379);
//        //2.使用jedis连接操作redis数据库
//        jedis.set("name","张三");
//
//        String name = jedis.get("name");
//
//        System.out.println(name);
//        //关闭jedis连接
//        jedis.close();

        JedisPool jedisPool = new JedisPool("192.168.204.28",6379);
        Jedis jedis = jedisPool.getResource();
        jedis.set("name","张三");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();

    }
}
