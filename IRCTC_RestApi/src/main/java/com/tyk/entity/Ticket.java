package com.tyk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
@Entity
@XmlRootElement
public class Ticket {
	
	@Id
	private Integer ticketId;
	
	private String ticketStatus;
	@Autowired
	@OneToOne
	private UserDatails details;
	
	

}
