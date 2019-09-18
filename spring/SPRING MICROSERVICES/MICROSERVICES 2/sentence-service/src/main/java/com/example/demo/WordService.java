package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordService {

	@Autowired VerbClient verbClient;
	@Autowired SubjectClient subjectClient;
	@Autowired ArticleCient articleClient;
	@Autowired AdjectiveClient adjectiveClient;
	@Autowired NounClient nounClient;
	
	

	@HystrixCommand(fallbackMethod="getFallbackSubject")
	public String getSubject() {
		return subjectClient.getWord().getWord();
	}
	
	
	public String getVerb() {
		return verbClient.getWord().getWord();
	}
	
	public String getArticle() {
		return articleClient.getWord().getWord();
	}
	
	
	@HystrixCommand(fallbackMethod="getFallbackAdjective")
	public String getAdjective() {
		return adjectiveClient.getWord().getWord();
	}
	
	
	@HystrixCommand(fallbackMethod="getFallbackNoun")
	public String getNoun() {
		return nounClient.getWord().getWord();
	}	

	public String getFallbackSubject() {
		return new String("Someone");
	}
	
	public String getFallbackAdjective() {
		return new String("");
	}
	
	public String getFallbackNoun() {
		return new String("something");
	}
}
