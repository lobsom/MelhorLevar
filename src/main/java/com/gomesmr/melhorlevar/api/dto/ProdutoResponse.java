package com.gomesmr.melhorlevar.api.dto;

public class ProdutoResponse {
	private Long id;
	private String descricao;
	private String marca;
	private Double preco;
	private Long gtin;
	/**
	 * @param id
	 * @param descricao
	 * @param marca
	 * @param preco
	 * @param gtin
	 */
	public ProdutoResponse(Long id, String descricao, String marca, Double preco, Long gtin) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.gtin = gtin;
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
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the preco
	 */
	public Double getPreco() {
		return preco;
	}
	/**
	 * @param preco the preco to set
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	/**
	 * @return the gtin
	 */
	public Long getGtin() {
		return gtin;
	}
	/**
	 * @param gtin the gtin to set
	 */
	public void setGtin(Long gtin) {
		this.gtin = gtin;
	}
	
	
}
