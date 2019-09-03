package comm.example;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "INTERNATIONAL CD")
public class InternationalCD extends CD {
	@Column(name = "languages")
	private String languages;
	@Column(name = "region")
	private int region;

	public InternationalCD() {
		super();
	}

	public InternationalCD(String title, String artist, Date purchaseDate, double cost, String languagues, int region) {
		super(title, artist, purchaseDate, cost);
		this.languages = languagues;
		this.region = region;
	}

}
