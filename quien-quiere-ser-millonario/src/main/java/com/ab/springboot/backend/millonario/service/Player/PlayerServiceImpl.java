package com.ab.springboot.backend.millonario.service.Player;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ab.springboot.backend.millonario.dao.PlayerDao;
import com.ab.springboot.backend.millonario.model.Player;

@Service
public class PlayerServiceImpl implements PlayerService{

	@Autowired
	private PlayerDao playerDao;
	
	@Override
	@Transactional(readOnly = false)
	public Player save(Player player) {
		// TODO Auto-generated method stub
		return playerDao.save(player);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return (List<Player>) playerDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Player findById(Integer id) {
		// TODO Auto-generated method stub
		return playerDao.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = false)
	public void update(Integer score, Integer id) {
		// TODO Auto-generated method stub
		Player player = playerDao.findById(id).orElse(null);
		player.setScore(score);
		playerDao.save(player);
	}





}
