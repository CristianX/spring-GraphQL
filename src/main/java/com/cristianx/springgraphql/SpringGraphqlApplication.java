package com.cristianx.springgraphql;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringGraphqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGraphqlApplication.class, args);
	}


	// @Bean
	// ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
	// 	return args -> {
	// 		Author cristian = authorRepository.save(new Author());
	// 		authorRepository.save(author);

	// 		bookRepository.save(new Book("Java: A Beginner's Guide, Sixth Edition", "0071809252", 728, author));
	// 	};
	// }

}
