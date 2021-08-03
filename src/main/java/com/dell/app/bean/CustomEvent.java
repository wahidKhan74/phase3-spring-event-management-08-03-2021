package com.dell.app.bean;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {
	
	public CustomEvent(Object source){
		super(source);
	}
	
	public String toString() {
		return "--- This is a Custom Event ! ----";
	}
	
}
