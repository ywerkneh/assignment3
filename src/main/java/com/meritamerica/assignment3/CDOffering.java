package com.meritamerica.assignment3;

public class CDOffering {
	private int term;
	private double interestRate;
	
	public CDOffering(int term, double interestRate) {
		this.term = term;
		this.interestRate = interestRate;
	}
	static CDOffering readFromString(String cdOfferingDataString){
		String [] parts = cdOfferingDataString.split(",\\s*");
		
		if(cdOfferingDataString.length() > 0 && parts.length == 2) {
			return new CDOffering(Integer.parseInt(parts[0]), Double.parseDouble(parts[1]));
		} else {
			throw new NumberFormatException();
		}
	}
	int getTerm(){
		return this.term;
	}
	double getInterestRate() {
		return this.interestRate;
	}
	String writeToString() {
		return getTerm() + "," + getInterestRate();
	}
	/* Description
	 * Term
	 * Interest Rate
	 */
}
