package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * @author Ram
 *
 */
public class MainApp {
    /**
     * @param args
     */
    @SuppressWarnings("resource")
    public static void main(String [] args)
    {
       ApplicationContext appContext = new ClassPathXmlApplicationContext("Bean.xml");
       SpringHelloWrold objSpringHelloWorld=(SpringHelloWrold)appContext.getBean("helloWorld");
       System.out.println(objSpringHelloWorld.getVarString());
    }

}
