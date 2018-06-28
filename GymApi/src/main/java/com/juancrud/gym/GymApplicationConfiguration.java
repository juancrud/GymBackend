package com.juancrud.gym;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.juancrud.gym.api, com.juancrud.gym.services")
//@EnableJpaRepositories("com.juancrud.gym.repositories")
//@EntityScan("com.juancrud.gym.dao")
public class GymApplicationConfiguration {

}
