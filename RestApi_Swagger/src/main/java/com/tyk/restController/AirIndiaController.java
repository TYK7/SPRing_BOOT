package com.tyk.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tyk.binding.PassenerInfo;
import com.tyk.binding.TicketInfo;

@RestController
public class AirIndiaController {
	@PostMapping(value = "/bookFlightTicket",consumes = {"application/xml","application/json"},produces = {"application/xml","application/json"})
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassenerInfo info)
	{
		
		System.err.println(info);
		// logic to book a ticket
		
		// Send Ticket Info
		
		TicketInfo t= new TicketInfo();
		t.setName(info.getFirstName()+" "+info.getLastName());
		t.setFlightId(info.getFirstName());
		t.setFrom(info.getFrom());
		t.setTo(info.getTo()); 
		t.setJourneyDate(info.getJourneyDate());
		t.setBookingStatus("Booked");
		t.setTicketPrice(2839.9);
          
		return new ResponseEntity<TicketInfo>(t,HttpStatus.CREATED);
	}

}
