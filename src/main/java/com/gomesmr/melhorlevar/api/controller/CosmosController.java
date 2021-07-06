/**
 * 
 */
package com.gomesmr.melhorlevar.api.controller;

import java.io.IOException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.gomesmr.melhorlevar.domain.service.CosmosService;

/**
 * @author Marcelo Gomes
 *
 */
@RestController
@RequestMapping("/cosmos")
public class CosmosController {
	private final CosmosService cosmosService;

	/**
	 * @param cosmoService
	 */
	public CosmosController(CosmosService cosmosService) {
		this.cosmosService = cosmosService;
	}
	
	@PostMapping("{gtin}")
	public void salvarJsonCosmos(@PathVariable ("gtin") Long gtin) 
			throws JacksonException, JsonMappingException, IOException {
		cosmosService.consultaCosmosGtin(gtin);
		
	}
	
	

}
