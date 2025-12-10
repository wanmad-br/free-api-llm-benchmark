package com.example.googleGeminiTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

@SpringBootApplication
public class GoogleGeminiTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleGeminiTestApplication.class, args);
	}

	@Bean
	public CommandLineRunner runGeminiApi() {
		return args -> {
			// Mock da resposta da API Gemini
			String mockResponse = "{\"candidates\":[{\"content\":{\"parts\":[{\"text\":\"Resposta mockada do Gemini!\"}]}}]}";
			System.out.println("Gemini API response: " + mockResponse);
		};
	}
}
