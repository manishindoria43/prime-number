package com.primenumbergenerator.primenumber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.primenumbergenerator.primenumber.service.DetailsService;

@RestController
public class DetailsController {
	@Autowired
	private DetailsService detailsService;
	

	@PostMapping("/add1")
	public List<Integer> processprime(@RequestParam Integer n1,@RequestParam Integer n2,@RequestParam Integer p){
		return detailsService.processPrime(n1, n2, p);
		
	}
	
		
	
	
}
