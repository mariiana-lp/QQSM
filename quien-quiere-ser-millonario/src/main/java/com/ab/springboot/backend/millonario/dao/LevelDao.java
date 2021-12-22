package com.ab.springboot.backend.millonario.dao;

import org.springframework.data.repository.CrudRepository;
import com.ab.springboot.backend.millonario.model.Level;

public interface LevelDao extends CrudRepository<Level, Integer>{

}
