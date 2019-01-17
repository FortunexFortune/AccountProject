package com.qa.business.service;

public interface AccountService {
	
	String getAllAccounts();
	String createAccount(String account);
	String updateAccount(Long accountNumber, String firstName, String lastName);
	String deleteAccount(Long accountNumber);
	

}
