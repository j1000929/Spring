package org.study.spring;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

	@Test
	public void testGetBeans() {//test메소드는  public void이어야 하고, 메소드 이름에 test를 붙인다.
		ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
		Student stu = (Student) context.getBean("student");
		
		System.out.println(stu);
		stu.setName("문재인");
		
		Student stu2 = (Student)context.getBean("student");
		System.out.println(stu2);
	}

}
