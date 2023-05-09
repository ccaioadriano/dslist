package com.caio.dslist.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caio.dslist.dto.GameMinDTO;
import com.caio.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAllGames() {
		
		List<GameMinDTO> gamesDTO = new ArrayList<>();
		
		gamesDTO = gameService.findAllGamesDTO();
		
		return gamesDTO;
	}
}