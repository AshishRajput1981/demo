package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.testInterface.TestInterface;

@RestController
@RequestMapping("/demo")
public class DemoController {
	/*
	 * @Autowired TestInterface testInterface;
	 */
	
	@GetMapping("/home")
	
	public String test()
	{
		return "working";
	}

}
