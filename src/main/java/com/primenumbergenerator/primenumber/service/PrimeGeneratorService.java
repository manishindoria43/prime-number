package com.primenumbergenerator.primenumber.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PrimeGeneratorService {
	
	
	
	public List<Integer> prime(Integer n1,Integer n2,Integer p){
		ArrayList<Integer> al= new ArrayList<Integer>();
		int i,j;
	
	if(p==1)
	{
	for
	(i=n1;i<=n2;i++)
	{
	for(j=2;j<=i;j++)
	{
	if(i%j==0)
	break;
	}
	if(i==j) {
	System.out.println(j);
	al.add(j);
	}
	}
	}
	
	


	else if(p==2)
	{		
	 i=n1;
		while(n1<n2){
			boolean flag=false;
			
			for(i=2;i<=n1/2;++i){
				//condition for non-prime number
				if(n1%i==0){
					flag=true;
					break;
			}
		}
		
		if(!flag && n1!=0 && n1!=1) {
			System.out.println(n1);
		al.add(n1);
		}
			++n1;
			
		}
	}
	else if(p==3)
	{
	int l=n1;
	al=new ArrayList<Integer>();
	while(l<=n2)
	{
		int ch=0;
		int m=2;
		while(m<l)
		{
			if(l%m==0)
			{
				ch++;
				break;
			}
			m++;
		}
		if(ch==0 && l!=1) {
			System.out.println(l+" ");
		al.add(l);
		}
		l++;
	}

	
	}

	else
	{
		System.out.print("Wrong Input");
	}

	al.size();
	return al;
	}
	}