package com.carina.spring.chapter2.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.carina.spring.chapter2.DI.model.PersonBean;
import com.carina.spring.chapter2.DI.model.PersonBean2;
import com.carina.spring.chapter2.DI.model.PersonBean3;

import junit.framework.TestCase;

public class DItest extends TestCase {
	
	//以XML方式注入Bean
	public void testXmlDI(){
		System.out.println("xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Context.xml");
		System.out.println("---------以XML方式注入Bean-----------");
		
		//原型注入，每调用getBean()都返回一个新的对象
		PersonBean pb = context.getBean(PersonBean.class);
		pb.sayHello();
		PersonBean pbp = context.getBean(PersonBean.class);
		System.out.println("pb:"+(pb==pbp));
		
		//默认注入，单列模式，返回同一个对象
		PersonBean2 pb2 = context.getBean(PersonBean2.class);
		pb2.sayHello();
		PersonBean2 pb2p = context.getBean(PersonBean2.class);
		System.out.println("pb2:"+(pb2==pb2p));
		
		context.close();
		System.out.println("-------------------");
		
	}
	

	//以java方式 注入Bean
	@SuppressWarnings("resource")
	public void testJavaPublicDI(){
		System.out.println("java");
		ApplicationContext context = new AnnotationConfigApplicationContext("com.carina.spring.chapter2.DI.config");
		System.out.println("---------以java方式 显式的注入Bean-----------");
		PersonBean pb = context.getBean(PersonBean.class);
		pb.sayHello();
		PersonBean2 pb2 = context.getBean(PersonBean2.class);
		pb2.sayHello();

		System.out.println("---------以java方式 隐式的注入Bean-----------");
		PersonBean3 pb3 = context.getBean(PersonBean3.class);
		pb3.sayHello();
		System.out.println("-------------------");
	}

}
