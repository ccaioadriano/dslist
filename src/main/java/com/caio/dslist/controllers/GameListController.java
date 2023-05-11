package com.caio.dslist.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.dslist.dto.GameListDTO;
import com.caio.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> lists() {
		
		List<GameListDTO> gameListsDTO = new ArrayList<>();
		
		gameListsDTO = gameListService.findAllGameListDTO();
		
		return gameListsDTO;
	}
		
}
