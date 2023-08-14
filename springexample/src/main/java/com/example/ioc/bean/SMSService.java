package com.example.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class SMSService implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("SMS SERVICE Acitivated.");

	}

}
