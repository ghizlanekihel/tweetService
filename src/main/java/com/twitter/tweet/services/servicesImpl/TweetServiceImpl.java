package com.twitter.tweet.services.servicesImpl;

import com.twitter.tweet.daos.TweetDao;
import com.twitter.tweet.entities.Tweet;
import com.twitter.tweet.services.TweetService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class TweetServiceImpl implements TweetService {
    @Autowired
    TweetDao tweetDao;

    @Override
    public Tweet saveTweet(Tweet tweet) {
        log.info("Inside saveTweet of TweetService");
        return tweetDao.save(tweet);
    }

    @Override
    public Optional<Tweet> findTweetById(Long id) {
        log.info("Inside findTweetById of TweetService");
        return tweetDao.findById(id);
    }
}
