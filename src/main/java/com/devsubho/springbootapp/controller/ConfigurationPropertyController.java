package com.devsubho.springbootapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsubho.springbootapp.property.Property;
import com.devsubho.springbootapp.property.ComplexProperty;

@RestController
@RequestMapping("/confProperty")
public class ConfigurationPropertyController {

	@Autowired
	private ComplexProperty complexProperty;

	@GetMapping
	public List<Property> fetchConfigurationProperties() {
		return complexProperty.getProperty();
	}
}