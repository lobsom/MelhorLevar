/**
 * 
 */
package com.gomesmr.melhorlevar.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.gomesmr.melhorlevar.api.dto.ProdutoResponse;

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
	public Produto(String descricao, String marca, Double preco, Integer quantidade, String unidade, Integer pack, Long gtin) {
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.pack = pack;
		this.gtin = gtin;
	}
	
	/**
	 * Razão: cálculo que permite a comparação dos produtos (a kind of)</br>
	 * Na verdade a razão seria um valor menor, igual ou maior que 1
	 * @return Double - Valor utilizado na construção da razão
	 */
	public Double razao() {
		return preco/(quantidade*pack);
	}
	
	/**
	 * Retorna uma instância do Produto com somente os campos que serão exibidos ao usuário
	 * @return ProdutoResponse
	 */
	public ProdutoResponse resposta() {
		return new ProdutoResponse(this.id, this.descricao, this.marca, this.preco, this.gtin);
		}

	/**
	 * Construtor a partir do gtin
	 * @param gtin
	 */
	public Produto(Long gtin) {
		this.id = gtin;
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
