package com.tyk.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class TicketInfo {
	
	private String name;
	
	private String from;
	
	private String to;
	
	private String flightId;
	
	private String journeyDate;
	
	private String bookingStatus;
	 private Double ticketPrice;
	 

}
