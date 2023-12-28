package com.vilaka.listafilmes.dto;

import com.vilaka.listafilmes.entities.GameList;

public class GameListDto {

    private Long id;
    private String name;

    public GameListDto(){}

    public GameListDto(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
