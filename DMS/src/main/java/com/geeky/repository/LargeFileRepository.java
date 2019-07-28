package com.geeky.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.geeky.model.Video;

public interface LargeFileRepository extends MongoRepository<Video, String> {

}
