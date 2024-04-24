package com.app.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		BeanFactory factory = context;
		Medico med = (Medico) factory.getBean("opera");
		med.operar();
		
		
	}
}
