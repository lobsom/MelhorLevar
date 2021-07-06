package com.gomesmr.melhorlevar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class MelhorLevarApiApplication {
	
	@Bean
	public WebClient webClientCosmos(WebClient.Builder builder) {
	return builder
			.baseUrl("https://api.cosmos.bluesoft.com.br")
 			.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
			.defaultHeader("X-Cosmos-Token", "74Iqc0NpTZHlY7ezhXTzsQ")
			.defaultHeader("User-Agent","Cosmos-API-Request")
			.build();
	} 

	public static void main(String[] args) {
		SpringApplication.run(MelhorLevarApiApplication.class, args);
	}

}
