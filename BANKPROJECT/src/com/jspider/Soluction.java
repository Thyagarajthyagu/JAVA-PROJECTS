package com.jspider;

import java.util.Scanner;

public class Soluction {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		Bank bank=new Bankimpl(3000);//upcasting -> abstract
		while(true){
			System.out.println("1:Deposite\n2: withdraw \n3: Getbalance \n4 :Exit");
			System.out.println("Enter the choice");
			int choice=scan.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter Amount To BE Deposited");
				int amountToDeposite=scan.nextInt();
				bank.deposite(amountToDeposite);//bank.deposite(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter Amount To BE Withdrawn");
				int amounttowithdrawn=scan.nextInt();
				bank.withdraw(amounttowithdrawn);//bank.withdrawn(scan.nextInt());
				break;			
			case 3:
				System.out.println("AVAILABLE BALANCE : RS."+ bank.getbalance());
				break;

			default:
				System.out.println(bank.displayerrormassage());
			}
		}
	}
}
