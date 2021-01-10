package com.example.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.redis.producer.CustomerInfoPublisher;

@SpringBootApplication
public class SpringDataRedisPubSubExampleApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerInfoPublisher redisPublisher;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataRedisPubSubExampleApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		redisPublisher.publish();
		redisPublisher.publish();
		redisPublisher.publish();
		Thread.sleep(50);
		redisPublisher.publish();
		redisPublisher.publish();
	}
}
