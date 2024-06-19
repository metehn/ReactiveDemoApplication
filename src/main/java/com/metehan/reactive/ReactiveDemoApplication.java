package com.metehan.reactive;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveDemoApplication.class, args);
	}
	//For creating dummy data
	/*@Bean
	public CommandLineRunner runner(StudentRepository repository) {
		return args -> {
			for (int i = 0; i < 1000; i++) {
				repository.save(
						Student.builder()
								.firstname("Metehan" + i)
								.lastname("Ersoy" + i)
								.age(i)
								.build()
				).subscribe();
			}
		};
	}*/
}
