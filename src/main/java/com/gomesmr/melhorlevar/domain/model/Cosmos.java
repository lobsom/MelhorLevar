/**
 * 
 */
package com.gomesmr.melhorlevar.domain.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gomesmr.melhorlevar.domain.model.cosmos.Brand;
import com.gomesmr.melhorlevar.domain.model.cosmos.Cest;
import com.gomesmr.melhorlevar.domain.model.cosmos.Gtin;
import com.gomesmr.melhorlevar.domain.model.cosmos.Ncm;

/**
 * @author Marcelo Gomes
 *
 */
@Entity
public class Cosmos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private String description;
	private long gtin;
	private String thumbnail;
	private double width;
	private double height;
	private double length;
	private double net_weight;
	private double gross_weight;
	private Date created_at;
	private Date updated_at;
	private String price;
	private double avg_price;
	private double max_price;
	private double min_price;
	private String origin;
	private String barcode_image;
	// private List<Gtin> gtins;
	// private Brand brand;
	// private Ncm ncm;
	// private Cest cest;

	/**
	 * @param id
	 * @param description
	 * @param gtin
	 * @param thumbnail
	 * @param width
	 * @param height
	 * @param length
	 * @param net_weight
	 * @param gross_weight
	 * @param created_at
	 * @param updated_at
	 * @param price
	 * @param avg_price
	 * @param max_price
	 * @param min_price
	 * @param origin
	 * @param barcode_image
	 */
	public Cosmos(Long id, String description, long gtin, String thumbnail, double width, double height, double length,
			double net_weight, double gross_weight, Date created_at, Date updated_at, String price, double avg_price,
			double max_price, double min_price, String origin, String barcode_image) {
		super();
		this.id = id;
		this.description = description;
		this.gtin = gtin;
		this.thumbnail = thumbnail;
		this.width = width;
		this.height = height;
		this.length = length;
		this.net_weight = net_weight;
		this.gross_weight = gross_weight;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.price = price;
		this.avg_price = avg_price;
		this.max_price = max_price;
		this.min_price = min_price;
		this.origin = origin;
		this.barcode_image = barcode_image;
	}

	/**
	 * 
	 */
	@Deprecated
	public Cosmos() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the gtin
	 */
	public long getGtin() {
		return gtin;
	}

	/**
	 * @param gtin the gtin to set
	 */
	public void setGtin(long gtin) {
		this.gtin = gtin;
	}

	/**
	 * @return the thumbnail
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	/**
	 * @param thumbnail the thumbnail to set
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(double width) {
		this.width = width;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the net_weight
	 */
	public double getNet_weight() {
		return net_weight;
	}

	/**
	 * @param net_weight the net_weight to set
	 */
	public void setNet_weight(double net_weight) {
		this.net_weight = net_weight;
	}

	/**
	 * @return the gross_weight
	 */
	public double getGross_weight() {
		return gross_weight;
	}

	/**
	 * @param gross_weight the gross_weight to set
	 */
	public void setGross_weight(double gross_weight) {
		this.gross_weight = gross_weight;
	}

	/**
	 * @return the created_at
	 */
	public Date getCreated_at() {
		return created_at;
	}

	/**
	 * @param created_at the created_at to set
	 */
	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	/**
	 * @return the updated_at
	 */
	public Date getUpdated_at() {
		return updated_at;
	}

	/**
	 * @param updated_at the updated_at to set
	 */
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}

	/**
	 * @return the avg_price
	 */
	public double getAvg_price() {
		return avg_price;
	}

	/**
	 * @param avg_price the avg_price to set
	 */
	public void setAvg_price(double avg_price) {
		this.avg_price = avg_price;
	}

	/**
	 * @return the max_price
	 */
	public double getMax_price() {
		return max_price;
	}

	/**
	 * @param max_price the max_price to set
	 */
	public void setMax_price(double max_price) {
		this.max_price = max_price;
	}

	/**
	 * @return the min_price
	 */
	public double getMin_price() {
		return min_price;
	}

	/**
	 * @param min_price the min_price to set
	 */
	public void setMin_price(double min_price) {
		this.min_price = min_price;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * @return the barcode_image
	 */
	public String getBarcode_image() {
		return barcode_image;
	}

	/**
	 * @param barcode_image the barcode_image to set
	 */
	public void setBarcode_image(String barcode_image) {
		this.barcode_image = barcode_image;
	}

}
