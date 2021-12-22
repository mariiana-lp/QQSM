package com.ab.springboot.backend.millonario.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ab.springboot.backend.millonario.model.Question;
import com.ab.springboot.backend.millonario.service.Question.QuestionService;

@RestController
@CrossOrigin(origins={"*"})
@RequestMapping("/api")
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@GetMapping("/question/{id}")
	public Question show(@PathVariable Integer id) {
		return questionService.findById(id);
	}


}
