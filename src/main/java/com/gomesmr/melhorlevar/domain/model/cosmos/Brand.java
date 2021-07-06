package com.gomesmr.melhorlevar.domain.model.cosmos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	public int id;
	public String name;
	public String picture;
	/**
	 * @param name
	 * @param picture
	 */
	public Brand(String name, String picture) {
		super();
		this.name = name;
		this.picture = picture;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	
}
