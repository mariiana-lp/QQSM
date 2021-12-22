package com.ab.springboot.backend.millonario.dao;

import org.springframework.data.repository.CrudRepository;
import com.ab.springboot.backend.millonario.model.Player;

public interface PlayerDao extends CrudRepository<Player, Integer>{

}
