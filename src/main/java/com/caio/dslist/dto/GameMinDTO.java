package com.caio.dslist.dto;

import com.caio.dslist.entities.Game;

public class GameMinDTO {

	private Long id;
	private String title;

	private Integer year;
	private String imgUrl;

	private String shortDescription;
	
	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Game entityGame) {
		this.id = entityGame.getId();
		this.title = entityGame.getTitle();
		this.year = entityGame.getYear();
		this.imgUrl = entityGame.getImgUrl();
		this.shortDescription = entityGame.getShortDescription();
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
