package com.geeky.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photos")
public class Photo {
	@Id
	private String id;
	private String PhotoTitle;
	private Binary photo;

	public Photo() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPhotoTitle() {
		return PhotoTitle;
	}

	public void setPhotoTitle(String photoTitle) {
		PhotoTitle = photoTitle;
	}

	public Binary getPhoto() {
		return photo;
	}

	public void setPhoto(Binary photo) {
		this.photo = photo;
	}

}
