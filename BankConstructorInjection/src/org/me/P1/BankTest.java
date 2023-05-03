package org.me.P1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankTest {
	private static ApplicationContext ctx;
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("AppCtx.xml");
		
		Teacher t1 = (Teacher)ctx.getBean("Teacher");
		
		t1.display();

	}

}
