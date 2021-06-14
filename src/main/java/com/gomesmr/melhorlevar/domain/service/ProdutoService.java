/**
 * 
 */
package com.gomesmr.melhorlevar.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	public Produto criar(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	
}
