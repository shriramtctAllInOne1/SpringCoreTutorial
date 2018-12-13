package com.core.spring.beanpostprocessor;

import org.springframework.beans.BeansException;  
import org.springframework.beans.factory.config.BeanPostProcessor;  
  
public class InitCapitalPostProcessor implements BeanPostProcessor{  
  
    public Object postProcessAfterInitialization(Object bean, String beanName)  
            throws BeansException {  
        System.out.println("AfterInitialization : " + beanName);  
          return bean;  // you can return any other object as well  
    }  
  
    public Object postProcessBeforeInitialization(Object bean, String beanName)  
            throws BeansException {  
          
          System.out.println("BeforeInitialization : " + beanName);  
          return bean;  // you can return any other object as well  
    }  
  
}  

