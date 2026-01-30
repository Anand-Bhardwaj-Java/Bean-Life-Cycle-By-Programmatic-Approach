package com.bean.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motor implements InitializingBean, DisposableBean {
	public Motor() {
		System.out.println("Motor constructor..");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Motor start....");
	}

	public void work() {
		System.out.println("Motor pulling water...");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("motor stop....");
	}
}
