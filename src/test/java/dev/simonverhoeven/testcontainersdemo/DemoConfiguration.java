package dev.simonverhoeven.testcontainersdemo;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
public class DemoConfiguration {

    @Bean
//    @RestartScope
    @ServiceConnection(name = "redis")
    GenericContainer<?> redisContainer() {
        return new GenericContainer<>(DockerImageName.parse("redis:latest"))
                .withExposedPorts(6379);
    }

//    @Bean
//    public GenericContainer mailhogContainer(DynamicPropertyRegistry registry) {
//        GenericContainer container = new GenericContainer("mailhog/mailhog")
//                .withExposedPorts(1025);
//        registry.add("spring.mail.host", container::getHost);
//        registry.add("spring.mail.port", container::getFirstMappedPort);
//        return container;
//    }

}
