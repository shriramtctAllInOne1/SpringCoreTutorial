package com.spring.ioc.injection;

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
       ApplicationContext appContext = new ClassPathXmlApplicationContext("Injection.xml");
      // ConstructorInjection obj=(ConstructorInjection)appContext.getBean("cinjection");
       ConstructorInjection obj=(ConstructorInjection)appContext.getBean("sinjection");

       System.out.println(obj.toString());
    }

}
