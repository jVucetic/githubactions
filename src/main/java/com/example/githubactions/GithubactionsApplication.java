package com.example.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GithubactionsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubactionsApplication.class, args);
	}

}
