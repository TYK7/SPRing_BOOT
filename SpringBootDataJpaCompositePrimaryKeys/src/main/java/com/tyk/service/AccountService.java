package com.tyk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyk.entity.Account;
import com.tyk.entity.AccountPk;
import com.tyk.repository.AccountRepository;

import lombok.AllArgsConstructor;

@Service
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	
	public void saveAccData()
	{
		AccountPk accpk= new AccountPk();
		accpk.setAccId(843143);
		accpk.setAccNumber(89781189468L);
		accpk.setAccType("Savings");
		
		Account acc= new Account();
		
		acc.setAccHoldName("VenuGopal");
		acc.setMinBalance(700.0);
		acc.setAccBranch("Vathsavai");
		acc.setAccountPk(accpk);
		
		accountRepository.save(acc);
	}
	
	
	public void getAccData()
	{
		AccountPk acpk = new AccountPk();
		acpk.setAccId(843143);
		acpk.setAccNumber(89781189468l);
		acpk.setAccType("Savings");
		
		
		Optional<Account> byId = accountRepository.findById(acpk);
		if(byId.isPresent())
		{
			System.out.println(byId.get());
		}
		
	}
	

}
 