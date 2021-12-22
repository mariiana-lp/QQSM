package com.ab.springboot.backend.millonario.service.Player;

import java.util.List;

import com.ab.springboot.backend.millonario.model.Player;

public interface PlayerService {
	
	public Player save(Player player);
	
	public void update(Integer score, Integer id);
	
	public Player findById(Integer id);
	
	public List<Player> findAll();
}
