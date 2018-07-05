package com.juancrud.gym.api;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.juancrud.gym.api.controllers, com.juancrud.gym.services, com.juancrud.gym.services.mappers")
@EnableJpaRepositories("com.juancrud.gym.repositories")
@EntityScan("com.juancrud.gym.dao")
public class GymApplicationConfiguration {

}
