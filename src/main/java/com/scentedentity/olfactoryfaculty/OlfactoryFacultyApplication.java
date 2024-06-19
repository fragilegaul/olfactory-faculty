package com.scentedentity.olfactoryfaculty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@SpringBootApplication
public class OlfactoryFacultyApplication //implements CommandLineRunner 
{

	public static void main(String[] args) {
		SpringApplication.run(OlfactoryFacultyApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}