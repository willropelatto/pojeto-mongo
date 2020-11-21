package br.com.pojetox.pojetomeneger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PojetoMenegerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PojetoMenegerApplication.class, args);
	}

}
