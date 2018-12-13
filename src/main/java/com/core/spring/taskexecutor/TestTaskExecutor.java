package com.core.spring.taskexecutor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.task.TaskExecutor;

public class TestTaskExecutor {
	
	public TestTaskExecutor()
		{
		}
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("TaskExecutorBean.xml");
		
		System.out.println("Started...");
		
		TaskExecutor tE = (TaskExecutor) ctx.getBean("TaskExecutor");
		tE.execute(new DisplayTime());
	}
}
