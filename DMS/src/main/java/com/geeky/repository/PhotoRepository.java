package com.geeky.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.geeky.model.Photo;

public interface PhotoRepository extends MongoRepository<Photo, String> {

}
