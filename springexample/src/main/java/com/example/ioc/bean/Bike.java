package com.example.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

	@Override
	public void move() {
		System.out.println("Bike is moving..");

	}

}
