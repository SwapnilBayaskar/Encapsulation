package com.Encapsulation;

import java.util.Random;

public class AccountDetails {
	
	private String strName;
	private String strEmail;;
	private String strAccNo;
	private int intBalance;
	
	public void printMessage() {
		System.out.println("----Account Details----");
	}
	
	public String getStrName() {
		
		System.out.println("Name of the Account Holder : "+strName);
		return strName;
	}	
	public void setStrName() {
		
		String strNameArray[] = {"Swapnil","Akash","Vijay","Shreyas","Ramesh","Sachin","Santosh"};
		
		strName = strNameArray[new Random().nextInt(strNameArray.length)];
		this.strName = strName;
	}
	
	public String getStrEmail() {
		return strEmail;
	}
	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}
	
	
	public String getStrAccNo() {
		
		System.out.println("Account No : "+strAccNo);
		return strAccNo;
	}
	
	public void setStrAccNo() {
		
		String strChars = "0123456789";
		Random objRandom = new Random();
		StringBuilder strBuilder = new StringBuilder(14);
		
		for(int intCount=0; intCount<14; intCount++) {
			strBuilder.append(strChars.charAt(objRandom.nextInt(strChars.length())));
		}
		strAccNo = strBuilder.toString();
		this.strAccNo = strAccNo;
	}
	
	
	public int getIntBalance() {
		return intBalance;
	}
	
	public void setIntBalance(int intBalance) {
		this.intBalance = intBalance;
	}
	
	

}
