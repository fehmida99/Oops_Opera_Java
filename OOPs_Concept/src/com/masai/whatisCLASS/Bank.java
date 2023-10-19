package com.masai.whatisCLASS;

public class Bank {
private float amount ;

//method to removing funds from a bank account
void withdrawal(float amount) {
	this.amount-=amount;
}

//method shows that money has been received
void credit(float amount) {
	this.amount+=amount;
}


//to get the money 
float getAmount() {
	return amount;
	
}

public static void main(String[] args) {
	
	
	Bank bb = new Bank();
	System.out.println("Initial amount : "+bb.getAmount());
	
	bb.credit(5000);
	System.out.println("Amount after credit : "+bb.getAmount());
	
	
	bb.withdrawal(1000);
	System.out.println("Amount after debit : "+bb.getAmount());
}








}
