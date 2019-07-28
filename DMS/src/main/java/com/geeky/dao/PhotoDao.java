package com.geeky.dao;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.geeky.model.Photo;

public interface PhotoDao {
	
	String addPhoto(String title, MultipartFile file) throws IOException;

	Photo getPhoto(String id);
}
