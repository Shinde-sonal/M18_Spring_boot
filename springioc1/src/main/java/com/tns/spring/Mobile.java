package com.tns.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Airtel a=new Airtel();
//		a.calling();
//		a.data();
		
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Sim s = c.getBean("sim",Sim.class);
//		Jio j=new Jio();
		s.calling();
		s.data();
	}

}
