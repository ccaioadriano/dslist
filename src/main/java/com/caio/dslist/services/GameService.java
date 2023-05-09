package com.caio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caio.dslist.dto.GameMinDTO;
import com.caio.dslist.entities.Game;
import com.caio.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository gameRepository;

	
	public List<GameMinDTO> findAllGamesDTO() {

		List<Game> games = gameRepository.findAll();

		// TRANSFORMA A LISTA DE GAMES(ENTITY) EM UMA LISTA DE GAMES DTO
		List<GameMinDTO> gamesDTO = games.stream().map(game -> new GameMinDTO(game)).toList();

		return gamesDTO;
	}
}
