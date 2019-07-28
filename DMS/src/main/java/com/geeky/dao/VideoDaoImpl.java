package com.geeky.dao;

import java.io.IOException;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsOperations;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.geeky.model.Video;
import com.geeky.repository.VideoRepository;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.gridfs.GridFSFile;

@Repository
public class VideoDaoImpl implements VideoDao {

	@Autowired
	VideoRepository videoRepo;

	@Autowired
	private GridFsTemplate gridFsTemplate;

	@Autowired
	private GridFsOperations operations;

	@Override
	public String addVideo(String title, MultipartFile file) throws IOException {
		DBObject metaData = new BasicDBObject();
		metaData.put("type", "video");
		metaData.put("title", title);
		ObjectId id = gridFsTemplate.store(file.getInputStream(), file.getName(), file.getContentType(), metaData);
		return id.toString();
	}

	@Override
	public Video getVideo(String id) {
		/*String file = (GridFSFile) gridFsTemplate.find(new Query(Criteria.where("_id").is(id)));
		Video video = new Video();
		video.setVideoTitle(file.getMetaData().get("title").toString());
		video.setVideo(operations.getResources(file).getInputStream());
		return video;*/
		return null;
	}

}
