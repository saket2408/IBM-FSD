package com.example.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
public class Reciepe {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Long cookTime;
	private String difficulty;
	@Lob
	private String description;
	private Long prepTime;
	private Long serving;
	private String source;
	private String url;

	@OneToOne(mappedBy = "reciepe",cascade = CascadeType.ALL)
	private Note note;

	@ManyToMany(mappedBy = "reciepes")
	private Set<Ingredient> ingredients = new HashSet<Ingredient>();

	public Reciepe() {
		super();
	}

	public Reciepe(String name, Long cookTime, String difficulty, String description, Long prepTime, Long serving,
			String source, String url) {
		super();
		this.name = name;
		this.cookTime = cookTime;
		this.difficulty = difficulty;
		this.description = description;
		this.prepTime = prepTime;
		this.serving = serving;
		this.source = source;
		this.url = url;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCookTime() {
		return cookTime;
	}

	public void setCookTime(Long cookTime) {
		this.cookTime = cookTime;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getPrepTime() {
		return prepTime;
	}

	public void setPrepTime(Long prepTime) {
		this.prepTime = prepTime;
	}

	public Long getServing() {
		return serving;
	}

	public void setServing(Long serving) {
		this.serving = serving;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Note getNote() {
		return note;
	}

	public void setNote(Note note) {
		this.note = note;
	}

	public Set<Ingredient> getIngredients() {
		return ingredients;
	}

	public void setIngredients(Set<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

}
