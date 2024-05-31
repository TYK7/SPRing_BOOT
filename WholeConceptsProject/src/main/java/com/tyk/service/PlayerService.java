package com.tyk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.entity.CricketAcademy;
import com.tyk.repository.PlayerRepository;

@Service
public class PlayerService {
	@Autowired
	private PlayerRepository p;
	
	public Integer playerSave(CricketAcademy academy)
	{
		CricketAcademy save = p.save(academy);
		
		return save.getPlayerId();
	}

}
