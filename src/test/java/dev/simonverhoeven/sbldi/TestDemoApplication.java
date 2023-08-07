package dev.simonverhoeven.sbldi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(DemoApplication::main)
				.with(DemoConfiguration.class)
				.run(args);
	}

}
