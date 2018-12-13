package com.spring.aop.customannotaion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ram
 * 
 *         http://www.2bloggers.com/2012/05/spring-aop-with-custom-annotation.
 *         html
 * 
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNullAndNotEmpty {
	
}
