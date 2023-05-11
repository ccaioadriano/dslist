package com.caio.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.caio.dslist.dto.GameListDTO;
import com.caio.dslist.entities.GameList;
import com.caio.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	GameListRepository gameListRepository;

	@Transactional(readOnly = true)
	public List<GameListDTO> findAllGameListDTO() {

		List<GameList> listGames = gameListRepository.findAll();

		// TRANSFORMA A LISTA DE GAMES(ENTITY) EM UMA LISTA DE GAMES DTO
		List<GameListDTO> listGamesDTO = listGames.stream().map(list -> new GameListDTO(list)).toList();

		return listGamesDTO;
	}
	
	public GameListDTO findListById(Long listId) {
		GameList gameList = gameListRepository.findById(listId).get();
		
		GameListDTO gameListDTO = new GameListDTO(gameList);
		
		return gameListDTO;
	}
}
