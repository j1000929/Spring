package org.study.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.study.spring.Student;

public class AppTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		Student stu = (Student) context.getBean("student");
		
		System.out.println(stu);
		stu.setName("문재인");
		
		Student stu2 = (Student)context.getBean("student");
		System.out.println(stu2);
	}

}
