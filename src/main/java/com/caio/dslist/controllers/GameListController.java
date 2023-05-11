package com.caio.dslist.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.dslist.dto.GameListDTO;
import com.caio.dslist.dto.GameMinDTO;
import com.caio.dslist.services.GameListService;
import com.caio.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findLists() {
		
		List<GameListDTO> gameListsDTO = new ArrayList<>();
		
		gameListsDTO = gameListService.findAllGameListDTO();
		
		return gameListsDTO;
	}
	
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findGamesByList(@PathVariable Long listId) {

		
		List<GameMinDTO> gamesMinDTO = new ArrayList<>();
		
		gamesMinDTO = gameService.findGamesByList(listId);
		
		return gamesMinDTO;
	}
	
	
		
}
