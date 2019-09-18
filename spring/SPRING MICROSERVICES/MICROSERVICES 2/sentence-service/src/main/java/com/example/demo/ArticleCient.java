package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="article")
public interface ArticleCient {

	@GetMapping("/")
	Word getWord();
}
