package com.devsubho.springbootapp.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Primary
@Service
public class Cat implements Animal {

	@Override
	public String characteristics() {
		// TODO Auto-generated method stub
		return "Meow";
	}

}
