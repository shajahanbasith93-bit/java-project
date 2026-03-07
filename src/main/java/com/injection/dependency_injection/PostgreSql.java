package com.injection.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class PostgreSql {

	PostgreSql(){
		System.out.println("PostgreSql object is created");
	}
}
