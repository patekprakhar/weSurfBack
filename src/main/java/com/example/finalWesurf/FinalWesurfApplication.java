package com.example.finalWesurf;

import com.example.finalWesurf.movieData.movieController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FinalWesurfApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinalWesurfApplication.class, args);
	}

}
