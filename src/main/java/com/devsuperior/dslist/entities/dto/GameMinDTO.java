package com.devsuperior.dslist.entities.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	public GameMinDTO(Game entityes) {
		id = entityes.getId();
		title = entityes.getTitle();
		year = entityes.getYear();
		imgUrl = entityes.getImgUrl();
		shortDescription = entityes.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
}
