package com.tyk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tyk.entity.Account;
import com.tyk.entity.AccountPk;
@Repository
public interface AccountRepository extends JpaRepository<Account, AccountPk> {

}
