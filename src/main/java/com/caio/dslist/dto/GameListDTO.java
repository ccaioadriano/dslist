package com.caio.dslist.dto;

import com.caio.dslist.entities.GameList;

public class GameListDTO {
	private Long id;

	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO (GameList entityGameList) {
		this.id = entityGameList.getId();
		this.name = entityGameList.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
