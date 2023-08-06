package dev.simonverhoeven.testcontainersdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestTestcontainersDemoApplication {

	public static void main(String[] args) {
		SpringApplication.from(TestcontainersDemoApplication::main)
				.with(DemoConfiguration.class)
				.run(args);
	}

}
