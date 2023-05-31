package com.anthony.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Primary
//@Component("serviciosimple")
public class MyService implements IService{

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante simple...";
	}
}
