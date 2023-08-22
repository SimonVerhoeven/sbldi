package dev.simonverhoeven.sbldi;

import org.springframework.boot.SpringApplication;

public class TestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoApplication::main)
				.with(DemoConfiguration.class)
				.run(args);
	}

}
