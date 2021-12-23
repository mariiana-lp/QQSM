package com.ab.springboot.backend.millonario.dao;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.ab.springboot.backend.millonario.model.Question;

public interface QuestionDao extends Repository<Question, Integer>{
	List<Question> findByIdLevel(Integer idLevel);
	Question findById(Integer id);
}
