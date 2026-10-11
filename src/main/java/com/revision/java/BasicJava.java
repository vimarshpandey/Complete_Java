package com.revision.java;

public class BasicJava {
	public static void main(String[] args) {
		System.out.println("Revision");	//This will print Revision
		
		int num = 125;
		byte n = 123;
		
		float a = 12.56f;
		double b = 34.543;
		
		char c = 'k';
		
		boolean d = false;
		
		n = (byte) num; //Type Casting
		
		int x = 12, y = 10;
		
		int r1 = x + y;
		int r2 = x - y;
		int r3 = x * y;
		int r4 = x / y;
		int r5 = x % y;
		
		if(x >= y && a < b) {
			System.out.println("Something");
		} else if(num > n || a < b) {
			System.out.println("Nothing");
		} else {
			System.out.println("Done");
		}
		
		int i = 0;
		while(i < 4) {
			System.out.println(i);
			i++;
		}
		
		int z = 0;
		do {
			System.out.println(z);
			z++;
		} while(z < 4);
		
		for(int q = 0; q < 4; q++) {
			System.out.println(q);
		}
	}
}
