package com.example.cloudpractice.testcontainers;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.util.TestPropertyValues;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@TestConfiguration
public class MySqlInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private static CustomMySqlTestContainer customMySqlTestContainer;

    static {
        customMySqlTestContainer = CustomMySqlTestContainer.getInstance();
        customMySqlTestContainer.start();
    }

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        TestPropertyValues.of(
                "spring.datasource.url=" + customMySqlTestContainer.getJdbcUrl(),
                "spring.datasource.username=" + customMySqlTestContainer.getUsername(),
                "spring.datasource.password=" + customMySqlTestContainer.getPassword()
        ).applyTo(applicationContext.getEnvironment());
    }
}
