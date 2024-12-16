package com.sarthak.spring.springorm.assignment.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sarthak.spring.springorm.assignment.passenger.dao.PassengerDao;
import com.sarthak.spring.springorm.assignment.passenger.entity.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {
	
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	@Transactional
	public int create(Passenger passenger) {
		Integer result = (Integer) hibernateTemplate.save(passenger);
		return 0;
	}

	@Override
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Override
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

	@Override
	public Passenger find(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class,id);
		return passenger;
	}

	@Override
	public List<Passenger> findAll() {
		List<Passenger> passengers = hibernateTemplate.loadAll(Passenger.class);
		return passengers;
	}

}
