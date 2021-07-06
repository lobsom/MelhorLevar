package com.gomesmr.melhorlevar.domain.model.cosmos;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class CommercialUnit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	public int id;
	public String type_packaging;
	public int quantity_packaging;
	public int ballast;
	public int layer;
	/**
	 * @param type_packaging
	 * @param quantity_packaging
	 * @param ballast
	 * @param layer
	 */
	public CommercialUnit(String type_packaging, int quantity_packaging, int ballast, int layer) {
		super();
		this.type_packaging = type_packaging;
		this.quantity_packaging = quantity_packaging;
		this.ballast = ballast;
		this.layer = layer;
	}
	/**
	 * @return the type_packaging
	 */
	public String getType_packaging() {
		return type_packaging;
	}
	/**
	 * @param type_packaging the type_packaging to set
	 */
	public void setType_packaging(String type_packaging) {
		this.type_packaging = type_packaging;
	}
	/**
	 * @return the quantity_packaging
	 */
	public int getQuantity_packaging() {
		return quantity_packaging;
	}
	/**
	 * @param quantity_packaging the quantity_packaging to set
	 */
	public void setQuantity_packaging(int quantity_packaging) {
		this.quantity_packaging = quantity_packaging;
	}
	/**
	 * @return the ballast
	 */
	public int getBallast() {
		return ballast;
	}
	/**
	 * @param ballast the ballast to set
	 */
	public void setBallast(int ballast) {
		this.ballast = ballast;
	}
	/**
	 * @return the layer
	 */
	public int getLayer() {
		return layer;
	}
	/**
	 * @param layer the layer to set
	 */
	public void setLayer(int layer) {
		this.layer = layer;
	}
	
	
}
