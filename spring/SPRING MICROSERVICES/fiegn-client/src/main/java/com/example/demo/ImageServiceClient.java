package com.example.demo;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "image-service")
public interface ImageServiceClient {

	@GetMapping("/images")
	public List<?> getImages();
}
