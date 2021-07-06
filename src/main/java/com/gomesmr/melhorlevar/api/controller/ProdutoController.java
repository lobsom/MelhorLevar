/**
 * 
 */
package com.gomesmr.melhorlevar.api.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gomesmr.melhorlevar.api.dto.ProdutoResponse;
import com.gomesmr.melhorlevar.domain.model.Produto;
import com.gomesmr.melhorlevar.domain.repository.ProdutoRepository;
import com.gomesmr.melhorlevar.domain.service.ProdutoService;
/**
 * @author Marcelo Gomes
 *
 */

@RestController
@RequestMapping("/melhorlevar")
public class ProdutoController {
	private final ProdutoRepository produtoRepository;
	private final ProdutoService produtoService;
	
	@Autowired
	ProdutoController(ProdutoRepository produtoRepository, ProdutoService produtoService){
		this.produtoRepository = produtoRepository;
		this.produtoService = produtoService;
	}
	
	/**
	 * 
	 * @param produto
	 * @return produto gravado no BD
	 */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produto entradaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@GetMapping("/{idP1}/{idP2}")
	private ResponseEntity<Produto> verificarVantagem (@PathVariable Long idP1, @PathVariable Long idP2) {
		Produto produto = produtoService.melhorLevar(idP1, idP2);
	
			return ResponseEntity.ok(produto);
			
	}
	
	
	/**
	 * 
	 * @return Lista de Produtos gravados no sistema
	 */
	@GetMapping
	public List<Produto> listar() {

		return produtoRepository.findAll().stream()
			    .map(e -> new Produto(e.getId(), e.getDescricao(), e.getMarca(), e.getPreco(), e.getQuantidade(), e.getUnidade(), e.getPack(), e.getGtin()))
			    .collect(Collectors.toList());

	}
	
/**
	private String descricao;
	private String marca;
	private Double preco;
	private Integer	quantidade;
	private String unidade;
	private Integer pack;
*/
}
