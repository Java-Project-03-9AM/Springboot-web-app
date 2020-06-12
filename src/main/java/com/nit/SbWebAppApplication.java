package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbWebAppApplication {
	private static final String REST_URL="https://www.equifax.com/getScores";


	public static void main(String[] args) {
		SpringApplication.run(SbWebAppApplication.class, args);
 		int a = 10;
	}

}
