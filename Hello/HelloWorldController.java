package com.SchoolLibDemo.restservices.Hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// Controller
@RestController
public class HelloWorldController {

	//Simple method
	//URI - /helloworld2
	//GET 
	//@RequestMapping(method = RequestMethod.GET, path = "/helloworld2")
	@GetMapping("/helloworld")
	public String helloWorld()
	{
		
		return "Hello World";
	}
	
	@GetMapping("/helloworld-bean")
	public BookDetails helloWorldBean()
	{
		return new BookDetails("Josh", "Hanz", "Palo Alto");
	}
	
}
