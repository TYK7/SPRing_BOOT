package com.tyk.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ACCOUNT_DETAILS")
public class Account {
	
	@Column(name="ACCOUNT_HOLDER_NAME")
	private String accHoldName;
	
	@Column(name="MIN_BALANCE")
	private Double minBalance;
	
	@Column(name="ACC_BRANCH")
	private String accBranch;
	
	@EmbeddedId
	private AccountPk accountPk;

}
