package com.geeky.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.geeky.model.Photo;

public interface SmallFileService {
	
	String addPhoto(String title, MultipartFile file) throws IOException;

	Photo getPhoto(String id);

}
