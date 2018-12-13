package com.spring.apo.declarepatternex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("AOP_DeclareParents_Ex.xml");
        StudentAdditionalDetailsImpl studentAdditionalDetails = (StudentAdditionalDetailsImpl) context.getBean("studentAdditionalDetails");
        ((StudentImpl) studentAdditionalDetails).showDetails();
        studentAdditionalDetails.showAdditionalDetails();
    }
}
	

