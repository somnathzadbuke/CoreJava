package com;

public class Test {

	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(Exception e) {
		System.out.println("Exception");
	}

	public void foo(NullPointerException ne) {
		System.out.println("NullPointerException");
	}

	public static void main(String[] args) {
		new Test().foo(null);
	}

}