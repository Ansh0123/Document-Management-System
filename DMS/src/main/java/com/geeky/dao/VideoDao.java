package com.geeky.dao;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import com.geeky.model.Video;

public interface VideoDao {
	
	String addVideo(String title, MultipartFile file) throws IOException;

	Video getVideo(String id);
}
