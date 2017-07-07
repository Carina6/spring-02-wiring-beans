package com.carina.spring.chapter2.DI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.carina.spring.chapter2.DI.model.PersonBean2;

@Configuration
public class BeanConfig2 {
	@Bean
	public PersonBean2 personBean2(){
		return new PersonBean2();
	}
}
