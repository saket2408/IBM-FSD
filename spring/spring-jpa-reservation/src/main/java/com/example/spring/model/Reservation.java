package com.example.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String passengerFirstName;
	private String passengerLastName;
	private String passengerEmail;
	private String flightNumber;
	private String flightType;
	@OneToOne
	private Passenger passenger;

	public Reservation() {
		super();
	}

	public Reservation(String passengerFirstName, String passengerLastName, String passengerEmail, String flightNumber,
			String flightType) {
		super();
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
		this.passengerEmail = passengerEmail;
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.passenger = new Passenger(passengerFirstName, passengerLastName, passengerEmail);
		this.passenger.getFlights().add(new Flight(flightNumber, flightType));
	}

	public Reservation(String passengerFirstName, String passengerLastName, String passengerEmail, String flightNumber,
			String flightType, Passenger passenger) {
		super();
		this.passengerFirstName = passengerFirstName;
		this.passengerLastName = passengerLastName;
		this.passengerEmail = passengerEmail;
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.passenger = passenger;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String getPassengerFirstName() {
		return passengerFirstName;
	}

	public void setPassengerFirstName(String passengerFirstName) {
		this.passengerFirstName = passengerFirstName;
	}

	public String getPassengerLastName() {
		return passengerLastName;
	}

	public void setPassengerLastName(String passsengerLastName) {
		this.passengerLastName = passsengerLastName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightType() {
		return flightType;
	}

	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}

}
