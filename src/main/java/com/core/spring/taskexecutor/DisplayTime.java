package com.core.spring.taskexecutor;

import java.util.Date;

class DisplayTime implements Runnable {
	public void run() {
		System.out.println(new Date());
	}
}