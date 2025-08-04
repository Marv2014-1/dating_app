package com.myapp.dating.snuggle;

import org.springframework.boot.SpringApplication;

public class TestSnuggleApplication {

	public static void main(String[] args) {
		SpringApplication.from(SnuggleApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
