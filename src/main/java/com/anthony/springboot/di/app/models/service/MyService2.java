package com.anthony.springboot.di.app.models.service;

import org.springframework.stereotype.Component;


//@Component("service2")
public class MyService2 implements IService{

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante dos...";
	}
}
