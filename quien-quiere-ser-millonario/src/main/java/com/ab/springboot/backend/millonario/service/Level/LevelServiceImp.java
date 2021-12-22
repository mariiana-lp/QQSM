package com.ab.springboot.backend.millonario.service.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ab.springboot.backend.millonario.dao.LevelDao;
import com.ab.springboot.backend.millonario.model.Level;


@Service
public class LevelServiceImp implements LevelService{
	
	@Autowired
	private LevelDao levelDao;

	@Override
	@Transactional(readOnly = true)
	public Level findById(Integer id) {
		// TODO Auto-generated method stub
		return levelDao.findById(id).orElse(null);
	}

		
}
