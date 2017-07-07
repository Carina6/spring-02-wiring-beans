package com.carina.spring.chapter2.DI.model;


public class PersonBean {
	
	public PersonBean() {
		System.out.println("PersonBean is realized!");
	}

	public void init(){
		System.out.println("I'm PersonBean init().");
	}
	
	public void sayHello(){
		System.out.println("I'm PersonBean.");
	}
	
	public void destroy(){
		System.out.println("I'm PersonBean destroy().");
	}

}
