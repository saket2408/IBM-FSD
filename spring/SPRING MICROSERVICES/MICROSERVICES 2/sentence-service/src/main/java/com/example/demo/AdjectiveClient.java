package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="adjective")
public interface AdjectiveClient {

	@GetMapping("/")
	Word getWord();
}
