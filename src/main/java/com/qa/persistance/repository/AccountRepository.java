package com.qa.persistance.repository;

public interface AccountRepository {
	
	String getAllAccounts();
	String createAccount(String account);
	String updateAccount(Long accountNumber, String firstName, String lastName);
	String deleteAccount(Long accountNumber);

}
