package com.estate.dtos;

import com.estate.entities.Apartment;

public class ApartmentResponseDTO extends Apartment {
	private long bookings;

	public long getBookings() {
		return bookings;
	}

	public void setBookings(long bookings) {
		this.bookings = bookings;
	}
	
	
}
