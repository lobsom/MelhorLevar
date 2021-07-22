package com.gomesmr.melhorlevar.api.dto;


public class ProdutoResponse {
	private Long id;
	private String descricao;
	private String marca;
	private Double preco;
	private Integer	quantidade;
	private String unidade;
	private Integer pack;
	private Long gtin;
	/**
	 * @param id
	 * @param descricao
	 * @param marca
	 * @param preco
	 * @param quantidade
	 * @param unidade
	 * @param pack
	 * @param gtin
	 */
	public ProdutoResponse(Long id, String descricao, String marca, Double preco, Integer quantidade, String unidade,
			Integer pack, Long gtin) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.marca = marca;
		this.preco = preco;
		this.quantidade = quantidade;
		this.unidade = unidade;
		this.pack = pack;
		this.gtin = gtin;
	}

}
