package com.tyk.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Data
@Table(name="CRICKET_ACADEMY_PLAYER_INFO")
public class CricketAcademy {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer playerId;
	
	private String playerFullName;
	
	private String playerFatherName;
	
	private Double playerHeight;
	
	private String playerRole;
	
	private String playerBatting;
	
	private String playerBowling;
	
	private String playerDateOfBirth;
	
	private String playerAddress;
	
	private Integer playerTshirtNo;
	
	private String playerPhoneNum;
	
	private String playerEmail;
	
	private String playerPassword;
	
	
	@CreationTimestamp
	@Column(name="PlayerJoinedDate",updatable = false)
	private LocalDateTime playerJoinedDate;
	
	
	@UpdateTimestamp
	@Column(name="PlayerDataUpdatedDate",insertable = false)
	private LocalDateTime playerDataUpdatedDate;
	
	
	
	

}
