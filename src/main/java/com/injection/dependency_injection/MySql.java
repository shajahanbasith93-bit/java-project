package com.injection.dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MySql {

	//field injection
//	@Autowired
	private PostgreSql post; // field (Aggregation) // less code ,but testing hard
//	
	MySql(){
		System.out.println("Mysql object is created");
	}
	
	//1 contsructor injection : @Autowired automatially put
//	@Autowired
//	MySql(PostgreSql post){
//		this.post = post;
//		System.out.println("Mysql object is created");
//	}
	//setter - for set value to postgre
	@Autowired
	public void setMysql(PostgreSql post) {
		this.post = post;
	}
	
	
}
