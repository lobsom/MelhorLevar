package com.gomesmr.melhorlevar.domain.model.cosmos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Cest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	public int id;
	public String code;
	public String description;
	public int parent_id;

	/**
	 * @param id
	 * @param code
	 * @param description
	 * @param parent_id
	 */
	public Cest(int id, String code, String description, int parent_id) {
		super();
		this.id = id;
		this.code = code;
		this.description = description;
		this.parent_id = parent_id;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the parent_id
	 */
	public int getParent_id() {
		return parent_id;
	}

	/**
	 * @param parent_id the parent_id to set
	 */
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

}