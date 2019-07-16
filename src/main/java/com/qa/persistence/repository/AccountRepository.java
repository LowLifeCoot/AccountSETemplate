package com.qa.persistence.repository;

public interface AccountRepository {

	final String SUCCESSFULLY_ADDED_ACCOUNT = "Created sucsesfully";

	String getAllAccounts();

	String createAccount(String account);

	String deleteAccount(int accountNumber);

	String updateAccount(int accountNumber, String account);

}
