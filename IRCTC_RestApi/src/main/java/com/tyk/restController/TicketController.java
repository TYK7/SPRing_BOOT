package com.tyk.restController;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyk.entity.Ticket;
import com.tyk.entity.UserDatails;
import com.tyk.service.PassengerService;

@RestController
public class TicketController {
	
	@Autowired
	private PassengerService service;
	
	
	
	@PostMapping( value="/bookTicket",produces = {"application/xml","application/json"},consumes = {"application/xml","application/json"})
	public ResponseEntity<Ticket> addPassengerDat(@RequestBody UserDatails userDatails)
	{
		System.out.println(userDatails);
		String msg = 
				service.toStore(userDatails);
		Ticket ticket= new Ticket();
		ticket.setTicketId(new Random().nextInt());
		ticket.setTicketStatus("Booked");
		ticket.setDetails(userDatails);
		service.save(ticket);
		
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
		
		
	}

}
