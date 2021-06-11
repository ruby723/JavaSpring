package com.douzone.container.user;

import org.springframework.context.annotation.Bean;

public class AppConfig01 {

	@Bean
	public User user() {
		return new User();
	}
}
