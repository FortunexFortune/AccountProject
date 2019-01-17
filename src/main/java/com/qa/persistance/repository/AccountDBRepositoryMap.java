package com.qa.persistance.repository;

import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.HashMap;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import javax.transaction.Transactional;

import com.qa.persistance.domain.Account;
import com.qa.util.JSONUtil;

@Transactional(SUPPORTS)
@Alternative
public class AccountDBRepositoryMap implements AccountRepository {
	
	
	@Inject
	private JSONUtil util;
	@Inject
	private HashMap<Long, Account> accounts;
	

	public String getAllAccounts() {
		 return util.getJSONForObject(accounts);
	}

	
	public String createAccount(String account) {
		Account newAccount = util.getObjectForJSON(account, Account.class);
		
		if(newAccount.getAccountNumber() == 666) {
			return "{\"message\": \"You can not insert an account with such an ID, You devil\"}";
		}
		
		else {
			accounts.put( newAccount.getAccountNumber(),newAccount);
			return "{\"message\": \"account sucessfully created\"}";
		}
	}
	
	
	public String updateAccount(Long id, String firstName, String lastName) {
		Account accountInDB = accounts.get(id);
		accountInDB.setFirstName(firstName);
		accountInDB.setLastName(lastName);		
		// TODO Auto-generated method stub
		return "{\"message\": \"has been sucessfully updated\"}";
	}
	

	public String deleteAccount(Long id) {
		accounts.remove(id);
		return "{\"message\": \"account sucessfully deleted\"}";
	}
	

}
