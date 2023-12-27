package com.vilaka.listafilmes.services;

import com.vilaka.listafilmes.dto.GameMinDto;
import com.vilaka.listafilmes.entities.Game;
import com.vilaka.listafilmes.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
        List<Game> result =  gameRepository.findAll();
        return result.stream().map(GameMinDto::new).toList();
    }
 }
