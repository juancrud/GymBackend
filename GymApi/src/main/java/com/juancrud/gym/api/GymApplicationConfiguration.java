package com.juancrud.gym.api;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.juancrud.gym.api.controllers, com.juancrud.gym.services, com.juancrud.gym.services.mappers")
@EnableJpaRepositories("com.juancrud.gym.repositories")
@EntityScan("com.juancrud.gym.dao")
public class GymApplicationConfiguration {

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				String get = HttpMethod.GET.toString();
				String post = HttpMethod.POST.toString();
				String put = HttpMethod.PUT.toString();
				String delete = HttpMethod.DELETE.toString();
				registry.addMapping("/**").allowedMethods(get, post, put, delete);
			}
		};
	}
}
