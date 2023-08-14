package com.example.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.ioc.bean.Car;
import com.example.ioc.bean.Traveler;
import com.example.ioc.bean.Vehicle;

@Configuration
public class AppConfig {
//	@Bean
//	public Vehicle car() {
//		return new Car();
//	}
//	@Bean
//	public Traveler traveler() {
//		return new Traveler(car());//DI
//	}
}
