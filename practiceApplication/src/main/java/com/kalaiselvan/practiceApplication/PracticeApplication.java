package com.kalaiselvan.practiceApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.kalaiselvan.practiceApplication.config.JwtConfig;

@SpringBootApplication
@EnableConfigurationProperties(JwtConfig.class)
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}
