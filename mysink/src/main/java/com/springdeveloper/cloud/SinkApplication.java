package com.springdeveloper.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.springdeveloper.cloud.module.LogSink;

@SpringBootApplication
@ComponentScan(basePackageClasses=LogSink.class)
public class SinkApplication {

	public static void main(String[] args) throws InterruptedException {
		SpringApplication.run(SinkApplication.class, args);
	}

}
