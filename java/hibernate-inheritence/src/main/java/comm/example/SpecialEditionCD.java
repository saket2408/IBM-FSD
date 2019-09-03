package comm.example;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "SPECIAL EDITION CD")
public class SpecialEditionCD extends CD {
	String newFeatures;

	public SpecialEditionCD() {
			}

	public SpecialEditionCD(String title, String artist, Date purchaseDate, double cost, String newFeatures) {
		super(title, artist, purchaseDate, cost);
		this.newFeatures = newFeatures;
		
	}

}
