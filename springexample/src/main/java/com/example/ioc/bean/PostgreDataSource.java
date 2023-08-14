package com.example.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class PostgreDataSource implements DataSource {

	@Override
	public String[] getNames() {
		String[] mailids= {"shreyash@gmail.com"};
		return mailids;
	}

}
