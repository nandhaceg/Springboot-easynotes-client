package com.example.easynotesclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client")
public class easynotesController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping(value = "/call-easynotes", method = RequestMethod.GET)
	public String notes() {
		String url = "http://notesapp/notesapi/notes";
		return restTemplate.getForObject(url, String.class);
	}
	
	@RequestMapping(value = "/zuul")
  	public String available() {
    	return "Zuul in Action";
	}
}
