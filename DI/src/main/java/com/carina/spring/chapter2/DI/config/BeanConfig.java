package com.carina.spring.chapter2.DI.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.carina.spring.chapter2.DI.model.PersonBean;

@Configuration
//@ComponentScan(basePackages={"com.carina.spring.vedioTest.DI.service","com.carina.spring.vedioTest.DI"})
public class BeanConfig {
	@Bean
	public PersonBean personBean(){
		return new PersonBean();
	}

}
