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
	
	public String updateAccount(Long id, String firstName, String lastName) {
		// TODO Auto-generated method stub
		return repo.updateAccount(id, firstName, lastName);
	}

	public String deleteAccount(Long id) {
		// TODO Auto-generated method stub
		return repo.deleteAccount(id);
	}
	
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
	}


}
