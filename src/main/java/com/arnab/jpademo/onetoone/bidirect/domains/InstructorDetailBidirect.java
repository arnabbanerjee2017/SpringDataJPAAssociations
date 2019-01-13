package com.arnab.jpademo.onetoone.bidirect.domains;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetailBidirect {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "youtube_channel")
	private String youtubeChannel;
	
	private String hobby;
	
	@OneToOne(mappedBy = "instructorDetail", cascade = CascadeType.ALL)
	private InstructorBidirect instructor;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYoutubeChannel() {
		return youtubeChannel;
	}

	public void setYoutubeChannel(String youtubeChannel) {
		this.youtubeChannel = youtubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public InstructorBidirect getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorBidirect instructor) {
		this.instructor = instructor;
	}	
	
}
