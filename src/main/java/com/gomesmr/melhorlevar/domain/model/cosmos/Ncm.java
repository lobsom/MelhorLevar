package com.gomesmr.melhorlevar.domain.model.cosmos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Ncm {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	public int id;
	public String code;
	public String description;
	public String full_description;
	/**
	 * @param code
	 * @param description
	 * @param full_description
	 */
	public Ncm(String code, String description, String full_description) {
		super();
		this.code = code;
		this.description = description;
		this.full_description = full_description;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the full_description
	 */
	public String getFull_description() {
		return full_description;
	}
	/**
	 * @param full_description the full_description to set
	 */
	public void setFull_description(String full_description) {
		this.full_description = full_description;
	}
	
	
}