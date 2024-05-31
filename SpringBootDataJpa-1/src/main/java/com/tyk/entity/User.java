package com.tyk.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="UserDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private Integer userId;
	@Column(name="userName")
	private String name;
	
	@Column(name="userAge")
	private Integer age;
	
	@Column(name="userGender")
	private String gender;
	
	@Column(name="userCountry")
	private String country;

	

}
