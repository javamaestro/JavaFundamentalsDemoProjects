package com.first.app.hello;

public class HelloApp{
	
	public static void main(String args[]) {
		
		HelloApp hello = new HelloApp();
		
		int sum = hello.sumOfTwoNumbers(10, 20);
		
		System.out.println("Sum of 2 numbers : "+ sum);
		
		hello.welcome();
		
	}
	
	public int sumOfTwoNumbers(int val1,int val2) {
		int sum = val1 + val2;
		return sum;
	}
	
	private void welcome() {
		System.out.println("Welcome to Kid-co");
	}
}
