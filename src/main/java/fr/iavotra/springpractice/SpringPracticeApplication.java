package fr.iavotra.springpractice;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableBatchProcessing
public class SpringPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringPracticeApplication.class, args);
	}

}
