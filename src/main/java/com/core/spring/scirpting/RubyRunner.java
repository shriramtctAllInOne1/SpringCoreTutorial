package com.core.spring.scirpting;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RubyRunner {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext(
            new String[]{"applicationContext-ruby.xml"});
    BeanFactory factory = (BeanFactory) context;

    Messenger m = (Messenger) factory.getBean("messageService");
    System.out.println(m.getMessage());
  }
}
