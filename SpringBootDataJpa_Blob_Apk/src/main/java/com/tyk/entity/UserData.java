package com.tyk.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name="USER_INFORMATION")
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Integer userId;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="USER_MAIL")
	private String userEmail;
	
	@Column(name="USER_IMAGE")
	@Lob
	private byte[] userPhoto;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE_TIME",updatable =false)
	private LocalDateTime createdDate;
	@UpdateTimestamp
	@Column(name="UPDATED_DATE_TIME",insertable = false)
	private LocalDateTime updateDate;
	

}
