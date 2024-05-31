
package com.becoder.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import java.util.*;

@Entity
public class continental{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column(length =2000)
	private String title;

	@Column(length = 10000)
	private String description;

	
	@Column(length = 100000, columnDefinition = "int default 0")
	private int likes;

	public continental()
	 {
		 this.likes=0;
	 }
	 public continental(int id,String title,String description,int likes)
	 {
		 
		  this.id=id;
		  this.title=title;
		  this.description=description;
		  this.likes=likes;
	    	 }

	
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

	

	@Override
	public String toString() {
		return "continental [id=" + id + ", title=" + title + ", description=" + description +"]";
		
	}

}
