package com.juancrud.gym;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan("com.juancrud.gym.api")
//@EnableJpaRepositories("com.juancrud.gym.repositories")
//@EntityScan("com.juancrud.gym.dao")
public class GymAppConfiguration {
}
