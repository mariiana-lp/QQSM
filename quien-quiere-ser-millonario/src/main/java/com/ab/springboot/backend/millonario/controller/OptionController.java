package com.ab.springboot.backend.millonario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ab.springboot.backend.millonario.model.Options;
import com.ab.springboot.backend.millonario.service.Option.OptionService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class OptionController {

	@Autowired
	private OptionService optionService;
	
	@GetMapping("/option/{id}")
	public Options show(@PathVariable Integer id) {
		return optionService.findById(id);
	}
}
