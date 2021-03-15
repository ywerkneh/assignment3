package com.meritamerica.assignment3;

import java.text.*;

public class BankAccount {
	protected double balance;
	protected double interestRate;
	protected long accountNumber;
	protected java.util.Date startDate;
	
	BankAccount(){} //Default constructor
	BankAccount(double balance, double interestRate) { //REQUIRED
		this.balance = balance;
		this.interestRate = interestRate;
	}
	BankAccount(double balance, double interestRate, java.util.Date accountOpenedOn){ //REQUIRED
		this.balance = balance;
		this.interestRate = interestRate;
		this.startDate = accountOpenedOn;
	}
	BankAccount(long accountNumber, double balance, 
				double interestRate, java.util.Date accountOpenedOn){ //REQUIRED
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.interestRate = interestRate;
		this.startDate = accountOpenedOn;
	}
	public long getAccountNumber() {
		return this.accountNumber;
	}
	public double getBalance() {
		return this.balance;
	}
	public double getInterestRate() {
		return this.interestRate;
	}
	java.util.Date getOpenedOn(){
		return this.startDate;
	}
	static BankAccount readFromString(String accountData) throws ParseException{
		String[] parts = accountData.split(",\\s*");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		
		if(accountData.length() > 0 && parts.length == 4) {
			return new BankAccount(Long.parseLong(parts[0]), 
					Double.parseDouble(parts[1]), Double.parseDouble(parts[2]), dateFormatter.parse(parts[3]));
		}else {
			throw new NumberFormatException();
		}
	}
	boolean withdraw(double amount) {
		if(amount < 0 || amount > getBalance()) {
			System.out.println("Cannot withdraw.");
			return false;
		}
		this.balance -= amount;
		return true;
	}
	boolean deposit(double amount) {
		if(amount < 0) {
			System.out.println("Cannot deposit.");
			return false;
		}
		this.balance += amount;
		return true;
	}
	public double futureValue(int year) {
		return getBalance() * Math.pow(1 + getInterestRate(), year);
	}
	String writeToString() {
		DecimalFormat interestFormat = new DecimalFormat("#.####");
		DecimalFormat noDecimalPlaces = new DecimalFormat("#");
		SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
		return getAccountNumber() + "," + noDecimalPlaces.format(getBalance()) + "," 
				+ interestFormat.format(getInterestRate()) + "," 
				+ dateFormatter.format(getOpenedOn());
	}
}
