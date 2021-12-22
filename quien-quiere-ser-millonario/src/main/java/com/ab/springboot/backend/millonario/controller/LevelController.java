package com.ab.springboot.backend.millonario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ab.springboot.backend.millonario.model.Level;
import com.ab.springboot.backend.millonario.service.Level.LevelService;


@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class LevelController {
	
	@Autowired
	private LevelService levelService;
	
	@GetMapping("/level/{id}")
	public Level show(@PathVariable Integer id) {
		return levelService.findById(id);
	}

}
