package com.ab.springboot.backend.millonario.dao;

import org.springframework.data.repository.CrudRepository;
import com.ab.springboot.backend.millonario.model.Options;

public interface  OptionDao extends CrudRepository<Options, Integer> {

}

