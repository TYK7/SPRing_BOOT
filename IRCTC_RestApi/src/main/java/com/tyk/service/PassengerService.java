package com.tyk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.entity.Ticket;
import com.tyk.entity.UserDatails;
import com.tyk.repository.TicketMaintance;
import com.tyk.repository.UserMaintainence;

@Service
public class PassengerService {
	@Autowired
	private TicketMaintance maintance;
	@Autowired
	private UserMaintainence us;
	
	
	@SuppressWarnings("unused")
	public String toStore(UserDatails details)
	{
		UserDatails userDatails = maintance.save(details);
		return "Your Ticket Booking Proccessing";
	}
	
	public void save(Ticket tick)
	{
		us.save(tick);
	}
	
   

}
