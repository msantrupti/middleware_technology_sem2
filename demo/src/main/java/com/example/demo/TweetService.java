package com.example.demo;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TweetService {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	  private TweetRepository tweetRepository;

	  public TweetService(TweetRepository tweetRepository) {
	    this.tweetRepository = tweetRepository;
	  }

	  public void addTweet(long id, Tweet tweet){
	    if(tweet.getContent().toLowerCase().matches(".*elon has bad ideas.*")){
	      logger.info("Tweet rejected");
	      throw new IllegalStateException("Tweet has been rejected. Elon is a genius");
	    }else {
	      logger.info("Tweet approved");
	      tweetRepository.save(tweet);
	    }
	  }

	  public List<Tweet> getAllTweets(){
	    return tweetRepository.findAll();
	  }


	public void updateTweet(long id, Tweet tweet) {
		
		tweetRepository.save(tweet);
		
	}

	public void deleteTweet(long id) {
		tweetRepository.deleteById(id);
		
	}
}
