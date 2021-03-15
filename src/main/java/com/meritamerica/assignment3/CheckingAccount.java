package com.meritamerica.assignment3;

import java.text.*;

public class CheckingAccount extends BankAccount {

	//Create appropriate constructors
	public CheckingAccount(double openingBalance) {
		super(openingBalance, 0.0001);
		
	}
	public CheckingAccount(long accountNumber, double balance, 
			double interestRate, java.util.Date accountOpenedOn){
		super(accountNumber, balance, interestRate, accountOpenedOn);
	}
	
	static CheckingAccount readFromString(String accountData) throws ParseException{
		String[] parts = accountData.split(",\\s*");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		
		if(accountData.length() > 0 && parts.length == 4) {
			return new CheckingAccount(Long.parseLong(parts[0]), 
					Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), dateFormatter.parse(parts[3]));
		}else {
			throw new NumberFormatException();
		}
	}
}
