package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("cfg.xml");
	Project p=(Project)ac.getBean(Project.class,"pobj");
	System.out.println(p);
}
}
