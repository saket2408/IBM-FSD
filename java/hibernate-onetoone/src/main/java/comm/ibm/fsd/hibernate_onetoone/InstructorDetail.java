package comm.ibm.fsd.hibernate_onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "instructor_details")
@Data
@NoArgsConstructor
public class InstructorDetail {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="youtube_channel")
	private String youtubeChannel;
	@Column(name="channel_detail")
	private String channelDetails;
	
	
	public InstructorDetail() {
		super();
	}


	public InstructorDetail(String youtubeChannel, String channelDetails) {
		super();
		this.youtubeChannel = youtubeChannel;
		this.channelDetails = channelDetails;
	}
	

}
