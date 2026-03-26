package com.javaintro;

public class Methods {
	
	static void method1() {
		Methods m1 = new Methods();
		m1.method2();
		System.out.println("method1 called!!");
		
	}
	void method2() {
		System.out.println("method2 called!!");
	}

	public static void main(String[] args) {
		System.out.println("main method2 !!");
		method1();
		
		System.out.println("main method 2!!");
	}

}