package com.primenumbergenerator.primenumber.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="User_details")
public class Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="start_no")
	private int n1;
	@Column(name="end_no")
	private int n2;
	@Column(name="algo_no")
	private int p;
	@CreationTimestamp
	private Date timestamp;
	@Column(name="no_of_primes")
	private int n_o_p;
	@Column(name="time_elapsed_nano")
	private long time;
	
	public Details(int id, int n1, int n2, int p, Date timestamp,int n_o_p,long time) {
		super();
		this.id = id;
		this.n1 = n1;
		this.n2 = n2;
		this.p = p;
		this.timestamp = timestamp;
		this.n_o_p = n_o_p;
		this.time = time;
		
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	public int getP() {
		return p;
	}
	public void setP(int p) {
		this.p = p;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public int getN_o_p() {
		return n_o_p;
	}


	public void setN_o_p(int n_o_p) {
		this.n_o_p = n_o_p;
	}


	public long getTime() {
		return time;
	}


	public void setTime(long time) {
		this.time = time;
	}


	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	}


