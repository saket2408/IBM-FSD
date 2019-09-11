package com.example.spring.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String flightNumber;
	private String flightType;
	@ManyToMany
	@JoinTable(name = "flight_passenger", joinColumns = @JoinColumn(name = "flight_id"), inverseJoinColumns = @JoinColumn(name = "passenger_id"))
	private Set<Passenger> passengers = new HashSet<Passenger>();

	public Flight() {
		super();
	}

	public Flight(String flightNumber, String flightType) {
		super();
		this.flightNumber = flightNumber;
		this.flightType = flightType;
	}

	public Flight(String flightNumber, String flightType, Set<Passenger> passengers) {
		super();
		this.flightNumber = flightNumber;
		this.flightType = flightType;
		this.passengers = passengers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Set<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}

}
