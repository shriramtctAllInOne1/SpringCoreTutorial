package com.spring.aop.customannotaion;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class BeanMethodValidator implements MethodInterceptor {
	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		List<String> errors = new ArrayList<String>();
		NotNullAndNotEmpty annotations = (NotNullAndNotEmpty) methodInvocation.getMethod()
		        .getAnnotation(NotNullAndNotEmpty.class);
		if (annotations != null) {
			for (Object argument : methodInvocation.getArguments()) {
				Field[] fields = argument.getClass().getDeclaredFields();
				for (Field field : fields) {
					field.setAccessible(true);
					try {
						if (field.get(argument) == null) {
							errors.add(field.getName() + " is null or empty");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		try {
			// if no error found execute the original method
			if (errors.isEmpty()) {
				Object result = methodInvocation.proceed();
				return result;
			} else {
				System.out.println("error :" + errors);
				return null;
			}
			
		} catch (IllegalArgumentException e) {
			
			throw e;
		}
	}
}
