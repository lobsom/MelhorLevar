/**
 * 
 */
package com.gomesmr.melhorlevar.domain.service;

import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.gomesmr.melhorlevar.domain.model.Cosmos;
import com.gomesmr.melhorlevar.domain.repository.CosmosRepository;

/**
 * @author Marcelo Gomes
 *
 */
@Service
public class CosmosService {
	private final CosmosRepository cosmosRepository;
	private final WebClient webClient;

	/**
	 * @param cosmoRepository
	 * @param webClient
	 */
	@Autowired
	public CosmosService(CosmosRepository cosmosRepository, WebClient webClient) {
		this.cosmosRepository = cosmosRepository;
		this.webClient = webClient;
	}

	/**
	 * @param cosmoRepository
	 * @throws IOException
	 * @throws JsonMappingException
	 * @throws JsonGenerationException
	 */

	public Cosmos consultaCosmosGtin(Long gtin) throws JsonGenerationException, JsonMappingException, IOException {

		String json = webClient.method(HttpMethod.GET)
				.uri("/gtins/{gtin}", gtin)
				.retrieve()
				.bodyToMono(String.class)
				.block();

		FileWriter myWriter = new FileWriter(String.format("%dcosmos.json", gtin));
		myWriter.write(json);
		myWriter.close();

		return null;
	}

}
