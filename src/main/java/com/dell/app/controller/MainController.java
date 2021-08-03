package com.dell.app.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dell.app.bean.CustomEventPublisher;

@Controller
public class MainController {
	
	@RequestMapping(value="/customevent",method = RequestMethod.GET)
	public String customEventMapper(ModelMap map) {
		
		//application context
		ApplicationContext context = new ClassPathXmlApplicationContext("main-servlet.xml");
		// get CustomEventPublisher bean
		CustomEventPublisher publisher = context.getBean("customEventPublisher",CustomEventPublisher.class);
		// trigger publish
		publisher.publish();
		
		return "custom-event";
	}

}
