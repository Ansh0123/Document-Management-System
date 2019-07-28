package com.geeky.dao;

import java.io.IOException;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.geeky.model.Photo;
import com.geeky.repository.SmallFileRepository;

@Repository
public class SmallFileDaoImpl implements SmallFileDao {

	@Autowired
	private SmallFileRepository photoRepo;
	
	@Override
	public String addPhoto(String title, MultipartFile file) throws IOException {
		Photo image = new Photo();
		image.setPhotoTitle(title);
		image.setPhoto(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		image = photoRepo.insert(image);
		return image.getId();
	}

	@Override
	public Photo getPhoto(String id) {
		return photoRepo.findById(id).get();
	}

}
