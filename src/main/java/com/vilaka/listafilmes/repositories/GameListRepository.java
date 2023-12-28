package com.vilaka.listafilmes.repositories;

import com.vilaka.listafilmes.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
