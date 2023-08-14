package com.example.ioc.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements MessageService {

	@Override
	public void sendMessage() {
		System.out.println("Email SERVICE Acitivated.");

	}

}
