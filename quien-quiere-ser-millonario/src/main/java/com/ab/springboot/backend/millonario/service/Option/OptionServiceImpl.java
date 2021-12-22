package com.ab.springboot.backend.millonario.service.Option;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ab.springboot.backend.millonario.dao.OptionDao;
import com.ab.springboot.backend.millonario.model.Options;


@Service
public class OptionServiceImpl implements OptionService {
	
	@Autowired
	private OptionDao optionDao;
	
	@Override
	@Transactional(readOnly = true)
	public Options findById(Integer id) {
		// TODO Auto-generated method stub
		return optionDao.findById(id).orElse(null);
	}

}
