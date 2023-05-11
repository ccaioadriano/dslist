package com.caio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caio.dslist.dto.GameFullDTO;
import com.caio.dslist.dto.GameMinDTO;
import com.caio.dslist.entities.Game;
import com.caio.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAllGamesDTO() {

		List<Game> games = gameRepository.findAll();

		// TRANSFORMA A LISTA DE GAMES(ENTITY) EM UMA LISTA DE GAMES DTO
		List<GameMinDTO> gamesDTO = games.stream().map(game -> new GameMinDTO(game)).toList();

		return gamesDTO;
	}
	
	@Transactional(readOnly = true)
	public GameFullDTO findByGameId(Long gameId) {
		Game gameById = gameRepository.findById(gameId).get();
		
		GameFullDTO gameDTO = new GameFullDTO(gameById);

		return gameDTO;
	}
}
