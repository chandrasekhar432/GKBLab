package com.GKBLab.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.GKBLab")
public class Config {
	
	
	@Bean
	public EntityManagerFactory getEMF() {
		return Persistence.createEntityManagerFactory("chandu");
	}

}
