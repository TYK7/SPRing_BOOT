package com.tyk.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Entity
@Data
@XmlRootElement
public class UserDatails {
    @Id
	private String irctcId;

	private String fromLocation;

	private String toLocation;

	private String classType;

	private String quota;

	private String userName;

	private Integer userAge;

	private String userGender;

	private String nationality;

	private String berthPreference;

	private String depatureDate;

	private String startingDate;
	
	private Double ticketPrice;
	
	private String trainName;
	
	private Integer trainNumber;

}
