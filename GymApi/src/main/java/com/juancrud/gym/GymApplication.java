package com.juancrud.gym;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(GymApplicationConfiguration.class)
public class GymApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(GymApplication.class, args);
    }
}
