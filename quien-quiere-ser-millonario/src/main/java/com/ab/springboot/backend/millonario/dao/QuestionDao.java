package com.ab.springboot.backend.millonario.dao;

import org.springframework.data.repository.CrudRepository;
import com.ab.springboot.backend.millonario.model.Question;

public interface QuestionDao extends CrudRepository<Question, Integer>{

}
