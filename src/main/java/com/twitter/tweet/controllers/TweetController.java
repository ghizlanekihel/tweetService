package com.twitter.tweet.controllers;

import com.twitter.tweet.entities.Tweet;
import com.twitter.tweet.services.TweetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/tweets")
@RestController
@Slf4j
public class TweetController {
    @Autowired
    private TweetService tweetService;

    @PostMapping("/")
    public Tweet saveTweet(@RequestBody Tweet tweet){
        log.info("Inside saveTweet method od tweetContoller");
        return tweetService.saveTweet(tweet);
    }

    @GetMapping("/{id}")
    public Optional<Tweet> findTweetById(@PathVariable("id") Long id){
        log.info("Inside findTweetById method od tweetContoller");
        return tweetService.findTweetById(id);
    }
}
