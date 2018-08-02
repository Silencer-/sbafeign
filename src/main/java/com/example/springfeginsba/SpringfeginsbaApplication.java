package com.example.springfeginsba;

import com.example.springfeginsba.client.SimpleFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringfeginsbaApplication {
	@Autowired
	private SimpleFeignClient simpleFeignClient;

	public static void main(String[] args) {
		SpringApplication.run(SpringfeginsbaApplication.class, args);
	}
}
