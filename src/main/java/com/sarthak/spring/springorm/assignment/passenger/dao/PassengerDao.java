package com.sarthak.spring.springorm.assignment.passenger.dao;

import java.util.List;
import com.sarthak.spring.springorm.assignment.passenger.entity.Passenger;

public interface PassengerDao {

	int create(Passenger passenger);

	void update(Passenger passenger);

	void delete(Passenger passenger);

	Passenger find(int id);

	List<Passenger> findAll();

}
