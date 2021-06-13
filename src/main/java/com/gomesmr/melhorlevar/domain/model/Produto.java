/**
 * 
 */
package com.gomesmr.melhorlevar.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Marcelo Gomes
 *
 */
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;
	private String descricao;
	private String marca;
	private Double preco;
	private Integer	quantidade;
	private String unidade;
	private Integer pack;
	private Long gtin;
	
	@Deprecated Produto() {}

	/**
	 * Construtor de produtos
	 * @param descricao
	 * @param marca
	 * @param preco
	 * @param quantidade
	 * @param unidade
	 * @param pack
	 * 
	 */
	public Produto(Long id, String descricao, String marca, Double preco, Integer quantidade, String unidade, Integer pack, Long gtin) {
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.pack = pack;
		this.gtin = gtin;
	}
	
	public Double razao() {
		return preco/(quantidade*pack);
	}

	/**
	 * @param ean
	 */
	public Produto(Long id) {
		this.id = id;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
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
	private void setDescricao(String descricao) {
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
	private void setMarca(String marca) {
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
	private void setPreco(Double preco) {
		this.preco = preco;
	}

	/**
	 * @return the quantidade
	 */
	public Integer getQuantidade() {
		return quantidade;
	}

	/**
	 * @param quantidade the quantidade to set
	 */
	private void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	/**
	 * @return the unidade
	 */
	public String getUnidade() {
		return unidade;
	}

	/**
	 * @param unidade the unidade to set
	 */
	private void setUnidade(String unidade) {
		this.unidade = unidade;
	}

	/**
	 * @return the pack
	 */
	public Integer getPack() {
		return pack;
	}

	/**
	 * @param pack the pack to set
	 */
	private void setPack(Integer pack) {
		this.pack = pack;
	}

	/**
	 * @return the ean
	 */
	public Long getGtin() {
		return gtin;
	}

	/**
	 * @param ean the ean to set
	 */
	private void setGtin(Long gtin) {
		this.gtin = gtin;
	}

	
	
}
