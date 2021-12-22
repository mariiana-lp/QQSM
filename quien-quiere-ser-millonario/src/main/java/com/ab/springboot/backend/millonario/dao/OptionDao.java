package com.ab.springboot.backend.millonario.dao;

import org.springframework.data.repository.CrudRepository;
import com.ab.springboot.backend.millonario.model.Option;

public interface  OptionDao extends CrudRepository<Option, Integer> {

}

