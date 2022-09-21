package com.primenumbergenerator.primenumber.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primenumbergenerator.primenumber.dao.DetailsDAO;
import com.primenumbergenerator.primenumber.entity.Details;


@Service
public class DetailsService {
	
	@Autowired
	private DetailsDAO dao;
	@Autowired
	private PrimeGeneratorService primedao;
	
	

	public List<Integer> processPrime(Integer n1,Integer n2,Integer p) {
		long m=System.nanoTime();
		ArrayList<Integer> al=(ArrayList<Integer>) primedao.prime(n1, n2, p);
		long n=System.nanoTime();
		Details details=new Details();
		details.setN1(n1);
		details.setN2(n2);
		details.setP(p);
		details.setN_o_p(al.size());
		
		
		details.setTime(n-m);	

		
		dao.save(details);
		
		return al;
		
	}

	}
	
	


