package com.example.demo.data;

import java.util.List;

public class Gallery {

	private Long galleryId;
	private List<Object> images;
	
	public Gallery() {
		super();
	}

	public Gallery(Long galleryId, List<Object> images) {
		super();
		this.galleryId = galleryId;
		this.images = images;
	}

	public Long getGalleryId() {
		return galleryId;
	}

	public void setGalleryId(Long galleryId) {
		this.galleryId = galleryId;
	}

	public List<Object> getImages() {
		return images;
	}

	public void setImages(List<Object> images) {
		this.images = images;
	}
	

	
}
