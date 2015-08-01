package com.springdeveloper.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springdeveloper.cloud.module.TimeSource;

@SpringBootApplication
@ComponentScan(basePackageClasses=TimeSource.class)
public class SourceApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SourceApplication.class, args);
	}

}
