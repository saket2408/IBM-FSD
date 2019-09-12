package com.example.model;

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
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String amount;
	private String description;

	@ManyToMany
	@JoinTable(name = "ingredient_reciepe", joinColumns = @JoinColumn(name = "ingredient_id"), inverseJoinColumns = @JoinColumn(name = "reciepe_id"))
	Set<Reciepe> reciepes = new HashSet<Reciepe>();

	public Ingredient(String amount,String description) {
		super();
		this.amount = amount;
		this.description =  description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Ingredient() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public Set<Reciepe> getReciepes() {
		return reciepes;
	}

	public void setReciepes(Set<Reciepe> reciepes) {
		this.reciepes = reciepes;
	}

}
