package com.example.ioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.ioc.bean.DataSource;
import com.example.ioc.bean.MessageService;
import com.example.ioc.bean.SMSService;
import com.example.ioc.bean.Traveler;

@SpringBootApplication
public class SpringexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(SpringexampleApplication.class, args);
		//Traveler t =context.getBean(Traveler.class);		
		//t.startJourney();
		
	//	MessageService ms= context.getBean(MessageService.class);
	//	ms.sendMessage();
		
		DataSource bean = context.getBean(DataSource.class);
		String[] names = bean.getNames();
		for(String name:names) {
			System.out.println(name);
		}
	}

}

