package com.example.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Entity
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Lob
	private String reciepeNote;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="reciepe_id")
	private Reciepe reciepe;

	public Note() {
		super();
	}

	public Note(String reciepeNote, Reciepe reciepe) {
		super();
		this.reciepeNote = reciepeNote;
		this.reciepe = reciepe;
	}

	public Note(String reciepeNote) {
		super();
		this.reciepeNote = reciepeNote;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReciepeNote() {
		return reciepeNote;
	}

	public void setReciepeNote(String reciepeNote) {
		this.reciepeNote = reciepeNote;
	}

	public Reciepe getReciepe() {
		return reciepe;
	}

	public void setReciepe(Reciepe reciepe) {
		this.reciepe = reciepe;
	}

}
