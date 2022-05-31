package com.Encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		
		AccountDetails objAccountDetails = new AccountDetails();
		
		objAccountDetails.printMessage();
		
		objAccountDetails.setStrName(); //Setting randomly in method itself
		objAccountDetails.getStrName();
		
		objAccountDetails.setStrEmail("Vstl@gmail.com");
		System.out.println("Email : "+objAccountDetails.getStrEmail());
		
		objAccountDetails.setStrAccNo();
		objAccountDetails.getStrAccNo(); //Generating randomly in setter
		
		objAccountDetails.setIntBalance(12500);
		System.out.println("Account Balance is : "+objAccountDetails.getIntBalance());

	}

}
