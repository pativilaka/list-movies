package com.vilaka.listafilmes.repositories;

import com.vilaka.listafilmes.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
