package com.geeky.model;

import java.io.InputStream;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "videos")
public class Video {
	@Id
	private String id;
	private String VideoTitle;
	private InputStream video;

	public Video() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVideoTitle() {
		return VideoTitle;
	}

	public void setVideoTitle(String videoTitle) {
		VideoTitle = videoTitle;
	}

	public InputStream getVideo() {
		return video;
	}

	public void setVideo(InputStream video) {
		this.video = video;
	}

}
