package com.tyk.binding;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class PassenerInfo {
	
	private String firstName;
	
	private String lastName;
	
	private String from;
	private String to;
	
	private String journeyDate;
	private String flightId;

}
