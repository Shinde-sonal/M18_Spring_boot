package com.cg.dep;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c = new ClassPathXmlApplicationContext("beans.xml");
		Student s2 = c.getBean("s2",Student.class);
		s2.display();
	}

}
