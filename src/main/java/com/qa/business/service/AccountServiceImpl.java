package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistance.repository.AccountRepository;
import com.qa.util.JSONUtil;


public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountRepository repo;
	private JSONUtil util;

	
	public String getAllAccounts() {
		// TODO Auto-generated method stub
		return repo.getAllAccounts();
	}

	public String createAccount(String account) {
		// TODO Auto-generated method stub
		return repo.createAccount(account);
	}
	
	public String updateAccount(Long accountNumber, String firstName, String lastName) {
		// TODO Auto-generated method stub
		return repo.updateAccount(accountNumber, firstName, lastName);
	}

	public String deleteAccount(Long accountNumber) {
		// TODO Auto-generated method stub
		return repo.deleteAccount(accountNumber);
	}
	
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}


}
