package com.geeky.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.geeky.dao.LargeFileDao;
import com.geeky.model.Video;

@Service
public class LargeFileServiceImpl implements LargeFileService{

	@Autowired 
	private LargeFileDao videoDao;
	
	@Override
	public String addVideo(String title, MultipartFile file) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Video getVideo(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
