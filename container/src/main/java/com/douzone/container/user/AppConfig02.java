package com.douzone.container.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig02 {

	@Bean
	public User user() {
		return new User("둘리");
	}
}
