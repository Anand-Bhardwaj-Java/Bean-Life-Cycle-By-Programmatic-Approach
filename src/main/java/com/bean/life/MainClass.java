package com.bean.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext  context=new ClassPathXmlApplicationContext("beans.xml");
		Motor motor = context.getBean(Motor.class);
		motor.work();
		ConfigurableApplicationContext context2=(ConfigurableApplicationContext)context;
	
		context2.registerShutdownHook();
	}
}
