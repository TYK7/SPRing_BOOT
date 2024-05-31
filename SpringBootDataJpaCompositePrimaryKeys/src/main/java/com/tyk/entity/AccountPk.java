package com.tyk.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

import lombok.Data;

@Data
@Embeddable
public class AccountPk implements Serializable {
	
	private Integer accId;
	private Long accNumber;
	private String accType;

}
