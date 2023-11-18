package com.devsuperior.dslist.entities.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;

	public GameListDTO() {
	}

	public GameListDTO(GameList entitys) {
		id = entitys.getId();
		name = entitys.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
