package com.testwebservice.git_demo;

public class App {
	public void addData(String data) {
		if (data.equals(Constants.DATA_NAME)) {
			System.out.println("Success");
		}
	}
	
	public void addedMethod(){
		System.out.println("new method");
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
