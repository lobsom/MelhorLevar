/**
 * 
 */
package com.gomesmr.melhorlevar.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gomesmr.melhorlevar.domain.model.Produto;


/**
 * @author Marcelo Gomes
 *
 */
@Repository
public interface ProdutoRepository extends JpaRepository <Produto, Long>{
	

}
