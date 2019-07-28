package com.geeky.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.geeky.dao.PhotoDao;
import com.geeky.model.Photo;

@Service
public class PhotoServiceImpl implements PhotoService {

	@Autowired
	private PhotoDao photoDao; 
	
	@Override
	public String addPhoto(String title, MultipartFile file) throws IOException {
		return photoDao.addPhoto(title, file);
	}

	@Override
	public Photo getPhoto(String id) {
		return photoDao.getPhoto(id);
	}

}
