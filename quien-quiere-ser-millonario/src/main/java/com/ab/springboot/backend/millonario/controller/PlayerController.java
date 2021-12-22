package com.ab.springboot.backend.millonario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.springboot.backend.millonario.model.Player;
import com.ab.springboot.backend.millonario.service.Player.PlayerService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/player")
	public Player save(@RequestBody Player player) {
		return playerService.save(player);
	}
	
	@GetMapping("/players")
	public List<Player> findAll() {
		return playerService.findAll();
	}
	
	@GetMapping("/player/{id}")
	public Player show(@PathVariable Integer id) {
		return playerService.findById(id);
	}
	
	@PutMapping("/{id}")
	public void update(@PathVariable Integer id, @RequestBody Player player) {
		playerService.update(player.getScore(), id);
	}
	
}
