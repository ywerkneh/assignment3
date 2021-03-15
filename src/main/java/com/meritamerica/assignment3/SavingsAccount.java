package com.meritamerica.assignment3;

import java.text.*;

public class SavingsAccount extends BankAccount{
	
	//Create appropriate constructors
	public SavingsAccount(double openingBalance) {
		super(openingBalance, 0.01);
	}
	public SavingsAccount(long accountNumber, double balance, 
			double interestRate, java.util.Date accountOpenedOn){ //REQUIRED
		super(accountNumber, balance, interestRate, accountOpenedOn);
	}
	
	static SavingsAccount readFromString(String accountData) throws ParseException{
		String[] parts = accountData.split(",\\s*");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		
		if(accountData.length() > 0 && parts.length == 4) {
			return new SavingsAccount(Long.parseLong(parts[0]), 
					Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), dateFormatter.parse(parts[3]));
		}else {
			throw new NumberFormatException();
		}
	}
}
