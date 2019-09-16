package com.example.demo.data;

public class Image {

	private Long imageId;
	private String url;
	private String description;
	public Image() {
		super();
	}
	public Image(Long imageId, String url, String description) {
		super();
		this.imageId = imageId;
		this.url = url;
		this.description = description;
	}
	public Long getImageId() {
		return imageId;
	}
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
