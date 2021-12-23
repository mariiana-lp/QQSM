package com.ab.springboot.backend.millonario.service.Question;

import java.util.List;

import com.ab.springboot.backend.millonario.model.Question;

public interface QuestionService {
	
	public Question findById(Integer id);
	
	public List<Question> findByIdLevel(Integer idLevel);

}
