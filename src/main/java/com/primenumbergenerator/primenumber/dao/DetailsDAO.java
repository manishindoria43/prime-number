package com.primenumbergenerator.primenumber.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.primenumbergenerator.primenumber.entity.Details;

public interface DetailsDAO extends JpaRepository<Details,Integer>{

}
