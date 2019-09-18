package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SentenceController {

	@Autowired
	WordService wordService;
	
	@GetMapping("/sentence")
	public List<String> getSentence(){
		List<String> list = new ArrayList<String>();
		list.add(wordService.getSubject() +" "+wordService.getVerb()+" "+wordService.getArticle()+" "+ wordService.getAdjective()+" "+ wordService.getNoun());
		list.add(wordService.getSubject() +" "+wordService.getVerb()+" "+wordService.getArticle()+" "+ wordService.getAdjective()+" "+ wordService.getNoun());
		list.add(wordService.getSubject() +" "+wordService.getVerb()+" "+wordService.getArticle()+" "+ wordService.getAdjective()+" "+ wordService.getNoun());
		list.add(wordService.getSubject() +" "+wordService.getVerb()+" "+wordService.getArticle()+" "+ wordService.getAdjective()+" "+ wordService.getNoun());
		list.add(wordService.getSubject() +" "+wordService.getVerb()+" "+wordService.getArticle()+" "+ wordService.getAdjective()+" "+ wordService.getNoun());
		list.add(wordService.getSubject() +" "+wordService.getVerb()+" "+wordService.getArticle()+" "+ wordService.getAdjective()+" "+ wordService.getNoun());
		return list;
	}
}
