/**
 * 
 */
package com.gomesmr.melhorlevar.domain.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gomesmr.melhorlevar.api.dto.ProdutoResponse;
import com.gomesmr.melhorlevar.domain.model.Produto;
import com.gomesmr.melhorlevar.domain.repository.ProdutoRepository;

/**
 * @author Marcelo Gomes
 *
 */
@Service
public class ProdutoService {
	private final ProdutoRepository produtoRepository;
	
	@Autowired
	ProdutoService(ProdutoRepository produtoRepository){
		this.produtoRepository = produtoRepository;
	}
	
	public Produto melhorLevar(Long idP1, Long idP2) {
		Produto p1 = produtoRepository.findById(idP1).get();
		Produto p2 = produtoRepository.findById(idP2).get();
		
		if (p1.razao() < p2.razao())
			return p1;
		else if (p1.razao() > p2.razao())
			return p2;
		else return null;
	}

	public Produto novoProduto(Produto produto) {
		return produtoRepository.save(produto);
	}

	public List<ProdutoResponse> listarProdutos() {
		return produtoRepository.findAll().stream()
			    .map(e -> new ProdutoResponse(e.getId(), e.getDescricao(), e.getMarca(), e.getPreco(), e.getQuantidade(), e.getUnidade(), e.getPack(), e.getGtin()))
			    .collect(Collectors.toList());
	}
}
