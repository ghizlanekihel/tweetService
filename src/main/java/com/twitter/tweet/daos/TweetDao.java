package com.twitter.tweet.daos;

import com.twitter.tweet.entities.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TweetDao extends JpaRepository<Tweet,Long> {


    Optional<Tweet> findById(Long id);
}
