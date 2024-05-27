package com.estate.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estate.entities.Apartment;
import com.estate.entities.Booking;
import com.estate.entities.Customer;
import com.estate.entities.Owner;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByCustomer(Customer customer);
	List<Booking> findByApartmentAndStatus(Apartment apartment,String status);
	Booking findByCustomerAndStatus(Customer customer,String status);
	List<Booking> findByOwnerAndStatus(Owner owner,String status);
	
}
