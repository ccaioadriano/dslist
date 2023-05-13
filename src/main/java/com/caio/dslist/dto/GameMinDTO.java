package com.caio.dslist.dto;

import com.caio.dslist.entities.Game;
import com.caio.dslist.projections.GameMinProjection;

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

	public GameMinDTO(GameMinProjection gameProjection) {
		this.id = gameProjection.getId();
		this.title = gameProjection.getTitle();
		this.year = gameProjection.getGameYear();
		this.imgUrl = gameProjection.getImgUrl();
		this.shortDescription = gameProjection.getShortDescription();
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
