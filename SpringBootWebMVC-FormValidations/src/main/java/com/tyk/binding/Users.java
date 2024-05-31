package com.tyk.binding;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Users {
	@Size(min=3,max=15,message="*The min characters and max characterss are 3 and 15")
	@NotEmpty(message = "*UserName Is Mandatary")
	private String userName;
	
	@NotEmpty(message = "*UserPassword Is Mandatary")
	private String userPassword;
	
	@NotEmpty(message = "*UserMail Is Mandatary")
	@Email(message = "*Enter Proper Mail Id")
	private String userMail;
	@Size(min=10,message = "*PhNo should have atleast 10 digits")
	@NotEmpty(message = "*UserPhoneNum Is Mandatary")
	private String userPhoneNum;
	
	@NotNull(message = "*UserAge Is Mandatary")
	@Min(value = 21,message = "*Age Should be 21 and above")
	@Max(value = 60,message="* Age Should be Below 60 and above 21")
	private Integer userAge;
	
	

}
