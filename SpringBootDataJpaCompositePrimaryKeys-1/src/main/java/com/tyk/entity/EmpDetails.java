package com.tyk.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.zaxxer.hikari.util.ClockSource.Factory;

import lombok.Data;

@Data
@Entity
@Table(name="EMP_DETAILSE")
public class EmpDetails {
	@Id
	@Column(name="EMP_ID")
	private Integer empId;

	@Column(name="EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SALARY")
	private Double salary;
	
	@Column(name="EMP_DEPARTMENT")
	private String department;
	
	@CreationTimestamp
	@Column(name="CREATED_DATE_TIME",updatable = false)
	private LocalDateTime localDate;
	
	@UpdateTimestamp
	@Column(name="UPDATED_DATE_TIME",insertable = false)
	private LocalDateTime updateDate;

}
