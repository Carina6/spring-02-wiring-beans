package com.carina.spring.chapter2.DI.model;

import org.springframework.stereotype.Component;

@Component
public class PersonBean3 {
	
	public void sayHello(){
		System.out.println("I'm PersonBean3.");
	}

}
