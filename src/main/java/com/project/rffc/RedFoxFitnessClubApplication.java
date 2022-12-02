package com.project.rffc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableJpaRepositories("com.project.rffc.*")
////@ComponentScan(basePackages = { "com.project.rffc.*" })
//@EntityScan("com.project.rffc.entity") 
@SpringBootApplication
@ComponentScan("com.project.rffc.entity")
public class RedFoxFitnessClubApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedFoxFitnessClubApplication.class, args);
	}

}
