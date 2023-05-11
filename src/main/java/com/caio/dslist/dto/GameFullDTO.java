package com.caio.dslist.dto;

import java.util.Objects;

import org.springframework.beans.BeanUtils;

import com.caio.dslist.entities.Game;

public class GameFullDTO {

	private Long id;
	private String title;

	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;

	private String longDescription;

	public GameFullDTO() {

	}
	
	//CONSTRUTOR QUE RECEBE UMA ENTITY E PASSA PARA DTO COPIANDO TODOS OS ATRIBUTOS DA CLASSE
	public GameFullDTO(Game entityGame) {
		BeanUtils.copyProperties(entityGame, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameFullDTO other = (GameFullDTO) obj;
		return Objects.equals(id, other.id);
	}

}
