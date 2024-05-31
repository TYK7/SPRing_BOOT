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

@Data
@Entity
@Table(name="STUDENT_DETAILS")
public class Student {
	
	@Id
	@Column(name="Student_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer stuId;
	
	@Column(name="Student_Name")
	private String stdName;
	
	@Column(name="Student_Clg_Name")
	private String stdClgName;
	
	@Column(name="Student_Branch")
	private String stdBranch;
	
	@CreationTimestamp
	@Column(name="Create_Date",updatable = false)
	private LocalDateTime createDate;
	
	@UpdateTimestamp
	@Column(name="Updated_Date",insertable = false)
	private LocalDateTime updateDate;
	
	

}
