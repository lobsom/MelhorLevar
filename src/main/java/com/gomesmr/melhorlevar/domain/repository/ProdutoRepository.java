/**
 * 
 */
package com.gomesmr.melhorlevar.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gomesmr.melhorlevar.domain.model.Produto;


/**
 * @author Marcelo Gomes
 *
 */
public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	

}
