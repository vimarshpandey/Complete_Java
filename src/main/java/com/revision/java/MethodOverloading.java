package com.revision.java;

class Transaction {
	int num = 127000;	//Instance variable
	
	public String pay() {
		return "Paying " + num + " through card";
	}
	
	public String pay(int n) {	//n is local variable
		return "Paying " + n + " through card";
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		Transaction obj = new Transaction();	//obj is reference variable
		System.out.println(obj.pay());
		System.out.println(obj.pay(25000));
	}
}
