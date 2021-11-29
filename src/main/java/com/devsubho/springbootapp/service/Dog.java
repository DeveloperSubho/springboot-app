package com.devsubho.springbootapp.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Dog implements Animal {

	@Override
	public String characteristics() {
		// TODO Auto-generated method stub
		return "Bark";
	}
}
