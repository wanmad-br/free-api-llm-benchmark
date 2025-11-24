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
			RestTemplate restTemplate = new RestTemplate();
			String apiKey = "YOUR_GEMINI_API_KEY"; // TODO: Move to application.properties
			String url = "https://generativelanguage.googleapis.com/v1beta/models/gemini-pro:generateContent?key=" + apiKey;

			// Example request body (adjust as needed for Gemini API)
			String requestJson = "{\"contents\":[{\"parts\":[{\"text\":\"Hello Gemini!\"}]}]}";
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> entity = new HttpEntity<>(requestJson, headers);

			ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
			System.out.println("Gemini API response: " + response.getBody());
		};
	}
}
