package com.core.spring.beanpostprocessor;

import org.springframework.context.support.AbstractApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
  
 
  
public class BeanPostProcessorExampleMain{  
  
    public static void main(String[] args) {  
  
        AbstractApplicationContext appContext = new ClassPathXmlApplicationContext("postprocessorBean.xml");  
        Country countryObj = (Country) appContext.getBean("country");  
        System.out.println("Country Name: "+countryObj.getCountryName());  
        appContext.registerShutdownHook();  
    }  
} 

