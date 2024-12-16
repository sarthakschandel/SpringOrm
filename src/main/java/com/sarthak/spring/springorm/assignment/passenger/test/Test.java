package com.sarthak.spring.springorm.assignment.passenger.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sarthak.spring.springorm.assignment.passenger.dao.PassengerDao;
import com.sarthak.spring.springorm.assignment.passenger.entity.Passenger;


public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/sarthak/spring/springorm/assignment/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
		
		Passenger passenger = new Passenger();
		passenger.setId(10);
		passenger.setFirstName("John");
		passenger.setLastName("Doe");
		
		//passengerDao.create(passenger);
		//Hibernate: insert into Passenger (firstname, lastname, id) values (?, ?, ?)
	
		
		
		
	}

}
