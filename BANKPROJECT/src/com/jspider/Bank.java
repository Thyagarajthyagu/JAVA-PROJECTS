package com.jspider;

public interface Bank {
	void deposite(int amount);
	void withdraw(int amount);
	int getbalance();
	String displayerrormassage();


}
// all the above methods are automatically public and abstract