package com.ab.springboot.backend.millonario.service.Question;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ab.springboot.backend.millonario.dao.QuestionDao;
import com.ab.springboot.backend.millonario.model.Question;


@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionDao questionDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Question> findByIdLevel(Integer idLevel) {
		// TODO Auto-generated method stub
		return questionDao.findByIdLevel(idLevel);
	}

	@Override
	@Transactional(readOnly = true)
	public Question findById(Integer id) {
		// TODO Auto-generated method stub
		return (Question) questionDao.findById(id);
	}



}
