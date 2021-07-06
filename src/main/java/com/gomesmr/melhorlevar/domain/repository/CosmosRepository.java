/**
 * 
 */
package com.gomesmr.melhorlevar.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gomesmr.melhorlevar.domain.model.Cosmos;

/**
 * @author Marcelo Gomes
 *
 */
@Repository
public interface CosmosRepository extends JpaRepository <Cosmos, Long> {

}
