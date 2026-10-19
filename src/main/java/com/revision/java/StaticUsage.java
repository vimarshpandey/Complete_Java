package com.revision.java;

class Mobile {
	String brand;
	int price;
	static String type;		//same for all object
	
	static {
		type = "Phone";
		System.out.println("Inside static block");
	}
	
	public void show() {
		System.out.println(brand + " : " + price + " : " + type);	//in non-static method we can use static variable
	}
	
	public static void show1(Mobile obj) {
		System.out.println(obj.brand + " : " + obj.price + " : " + type); //inside static method we cannot use non static variable directly
	}
}

public class StaticUsage {
	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 80000;
		//Mobile.type = "Smartphone";		//static variable should be called or used with class name
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 55000;
		
		obj1.show();
		obj2.show();
		
		Mobile.show1(obj2);
	}

}
