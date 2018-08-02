package com.example.springfeginsba.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "simple-feign-client")
public interface SimpleFeignClient {
}
