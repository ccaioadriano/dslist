package com.caio.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
