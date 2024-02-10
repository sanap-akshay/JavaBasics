package com.java;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcome welcome = new Welcome();
		 String msg = welcome.msg();
		 System.out.println(msg);
		 System.out.println();
		 System.out.println("\"HelloWorld\"");
		 System.out.println("\"hwwh\"");

	}

}

class Welcome {
	
	String msg() {
		return "Welcome to Java";
	}
	
	String welcomeMsg() {
		return "!@#$%^&*";
	}
}

