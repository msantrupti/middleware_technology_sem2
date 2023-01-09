package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TweetController {
	private TweetService tweetService;

	  public TweetController(TweetService tweetService) {
	    this.tweetService = tweetService;
	  }

	  @GetMapping("/tweet")
	  public List<Tweet> getAllTweets(){
	    return tweetService.getAllTweets();
	  }

	  @PostMapping("/tweet/{id}")
	  public void addTweet(@PathVariable long id,@RequestBody Tweet tweet){
	    tweetService.addTweet(id, tweet);
	  }
	  
	 @RequestMapping(method=RequestMethod.PUT, value = "/tweet/{id}")
	 public void updateTweet(@PathVariable long id, @RequestBody Tweet tweet) {
		 tweetService.updateTweet(id, tweet);
	 }
	 
	 @RequestMapping(method=RequestMethod.DELETE, value = "/tweet/{id}")
	 public void deleteTweet(@PathVariable long id) {
		 tweetService.deleteTweet(id);
	 }
}
