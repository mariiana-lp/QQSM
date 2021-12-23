package com.ab.springboot.backend.millonario.dao;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.ab.springboot.backend.millonario.model.Options;


public interface  OptionDao extends Repository<Options, Integer> {
	List<Options> findByIdQuestion(Integer idQuestion);
	Options findById(Integer id);

}

