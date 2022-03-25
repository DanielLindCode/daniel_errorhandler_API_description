package com.example.demo;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class calculatorController implements ErrorController {
	
	calculatorService calc = new calculatorService();
	
	@CrossOrigin
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String root() {
		return calc.description();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/calc", method = RequestMethod.GET)
	public String calc(String n1, String n2, String op) {
		return calc.calculator(n1, n2, op);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/error", method = RequestMethod.GET)
	public String errorHander() {
		return "The entered URL is not correct for this API! " + "\r\n " + calc.description();
	}
}
