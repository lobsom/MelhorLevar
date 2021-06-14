/**
 * 
 */
package com.gomesmr.melhorlevar.api.dto;

import com.gomesmr.melhorlevar.domain.model.Produto;

/**
 * @author Marcelo Gomes
 *
 */
public class ProdutoRequest {
	private String descricao;
	private String marca;
	private Double preco;
	private Integer	quantidade;
	private String unidade;
	private Integer pack;
	private Long gtin;
	
	public Produto criarNovoProduto() {
		return new Produto(this.descricao, this.marca, this.preco, this.quantidade, this.unidade, this.pack, this.gtin);
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
	 * @return the quantidade
	 */
	public Integer getQuantidade() {
		return quantidade;
	}
	/**
	 * @param quantidade the quantidade to set
	 */
	public void setQuantidade(Integer quantidade) {
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
	public void setUnidade(String unidade) {
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
	public void setPack(Integer pack) {
		this.pack = pack;
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
