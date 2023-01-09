package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TweetData")
public class Tweet {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;

	  private String author;

	  private String content;

	  public Tweet(String author, String content) {
	    this.author = author;
	    this.content = content;
	  }

	  public Tweet() {
	  }

	  public String getAuthor() {
	    return author;
	  }

	  public void setAuthor(String author) {
	    this.author = author;
	  }

	  public Long getId() {
	    return id;
	  }

	  public void setId(Long id) {
	    this.id = id;
	  }

	  public String getContent() {
	    return content;
	  }

	  public void setContent(String content) {
	    this.content = content;
	  }
}
