package com.tyk.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Data
@Entity
@Table(name="EMP_ADDRESS")
public class EmpAddress {
	@Column(name="EMP_ID")
	private Integer empId;
	
	@Id
	@Column(name="EMP_ADD_ID")
	private Integer addId;
	
	@Column(name="EMP_STATE")
	private String state;
	
	@Column(name="EMP_CITY")
	private String city;

	@Column(name="EMP_COUNTRY")
	private String country;
	@CreationTimestamp
	@Column(name="CREATED_DATE_TIME",updatable = false)
	private LocalDateTime localDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE_TIME",insertable = false)
	private LocalDateTime updateDate;
	
	
	

}
