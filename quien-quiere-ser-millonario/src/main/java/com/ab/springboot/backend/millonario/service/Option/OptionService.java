package com.ab.springboot.backend.millonario.service.Option;

import java.util.List;

import com.ab.springboot.backend.millonario.model.Options;


public interface OptionService {

	public Options findById(Integer id);
	
	public List<Options> findByIdOptions(Integer idQuestions);
}
