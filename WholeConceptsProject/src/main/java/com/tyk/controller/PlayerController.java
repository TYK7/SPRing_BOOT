package com.tyk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tyk.entity.CricketAcademy;
import com.tyk.service.PlayerService;

@Controller
public class PlayerController {
	@Autowired
	private PlayerService ps;
	
	@GetMapping("/")
	public String getPlayerRegForm(Model model)
	{
		
		CricketAcademy player= new CricketAcademy();
		model.addAttribute("player", player);
		return "PlayerRegistrationForm";
	}
	
	@PostMapping("/player")
	public String getPlayer(Model model ,CricketAcademy academy)
	{
		
		Integer playerSave = ps.playerSave(academy);
		if(playerSave>0)
		{
			model.addAttribute("player", academy);
			return "Login";
		}
		else
		{
			model.addAttribute("msg", "Submission Failed Try Again");
			return "PlayerRegistrationForm";
		}
		
	}

}
