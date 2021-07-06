package com.gomesmr.melhorlevar.domain.model.cosmos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gomesmr.melhorlevar.domain.model.cosmos.CommercialUnit;

public class Gtin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	public int id;
	public Object gtin;
	public CommercialUnit commercial_unit;
	/**
	 * @param gtin
	 * @param commercial_unit
	 */
	public Gtin(Object gtin, CommercialUnit commercial_unit) {
		super();
		this.gtin = gtin;
		this.commercial_unit = commercial_unit;
	}
	/**
	 * @return the gtin
	 */
	public Object getGtin() {
		return gtin;
	}
	/**
	 * @param gtin the gtin to set
	 */
	public void setGtin(Object gtin) {
		this.gtin = gtin;
	}
	/**
	 * @return the commercial_unit
	 */
	public CommercialUnit getCommercial_unit() {
		return commercial_unit;
	}
	/**
	 * @param commercial_unit the commercial_unit to set
	 */
	public void setCommercial_unit(CommercialUnit commercial_unit) {
		this.commercial_unit = commercial_unit;
	}
	
	
}