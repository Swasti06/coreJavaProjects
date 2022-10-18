package com.bank;

public class DebitCardCustomer extends DebitCard{
	DebitCard d=new DebitCard();
	Cards cust=new Cards();
	
	d.setDeblim(10000);
	c.setCredlim(20000);
	cust.setName("Swasti");
	cust.setPhone(1234);

	
	int debitLimit=d.getDeblim();
	int creditLimit=c.getCredlim();
	String custName=cust.getName();
	int custPhone=cust.getphone();
	
	System.out.println(debitLimit);
	System.out.println(creditLimit);
	System.out.println(custName);
	System.out.println(custPhone);

}
