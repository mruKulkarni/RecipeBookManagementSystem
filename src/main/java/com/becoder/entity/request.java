


package com.becoder.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class request{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length =2000)
	private String title;


	


	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	

	@Override
	public String toString() {
		return "request [id=" + id + ", title=" + title + "]";
		
	}

}
