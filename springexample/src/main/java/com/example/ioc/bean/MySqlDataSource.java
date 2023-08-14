package com.example.ioc.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MySqlDataSource implements DataSource {

	@Override
	public String[] getNames() {
		String[] mailids= {"nirmal@gmail.com"};
		return mailids;
	}

}
