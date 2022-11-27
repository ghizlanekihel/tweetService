package com.twitter.tweet.services;

import com.twitter.tweet.entities.Tweet;

import java.util.Optional;


public interface TweetService {

    Tweet saveTweet(Tweet tweet);

    Optional<Tweet> findTweetById(Long id);
}
