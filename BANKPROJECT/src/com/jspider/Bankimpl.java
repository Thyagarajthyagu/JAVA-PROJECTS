package com.jspider;

public class Bankimpl implements Bank {
	private int balance;
	Bankimpl(int balance){
		this.balance=balance;	
	}
	@Override
	public void deposite(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance=balance+amount;
		System.out.println("Amount Deposited Successfully");	
	}
	@Override
	public void withdraw(int amount) {
		if(amount<=balance){
			System.out.println("Withdraw amount."+amount);
			balance=balance-amount;		System.out.println("Amount Withdraw Sucessfullu! ");
		}
		else{
			try{
				throw new InsufficientbalanceException("Insufficientbalance");	
			}
			catch(InsufficientbalanceException e){
				System.out.println(e.getMessage());		
			}
		}
	}
	@Override
	public int getbalance() {
		return balance;
	}
	@Override
	public String displayerrormassage() {
		return "Invalied Choice, Kindly Enter VAlied Choice!!";
	}
}
