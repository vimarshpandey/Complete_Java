package com.revision.java;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = new String("Anand");	//Immutable
		System.out.println(name);
		System.out.println(name.hashCode());
		
		String s1 = "Vimarsh";
		String s2 = "Vimarsh";
		
		System.out.println(s1 == s2);
		
		StringBuffer str = new StringBuffer("Anand ");	//Mutable
		str.append("Kumar");
		System.out.println(str);
		
		String a = str.toString();	//Converting StringBuffer to String
	}
}
