package com.example.cloudpractice.testcontainers;

import lombok.extern.slf4j.Slf4j;
import org.testcontainers.containers.MySQLContainer;

@Slf4j
public class CustomMySqlTestContainer extends MySQLContainer<CustomMySqlTestContainer> {

    private static final String IMAGE_VERSION = "mysql:5";
    private static CustomMySqlTestContainer container;

    private CustomMySqlTestContainer() {super(IMAGE_VERSION);}

    public static CustomMySqlTestContainer getInstance() {
        if (container == null) {
            container = new CustomMySqlTestContainer()
                    .withReuse(true)
                    .withUrlParam("stringtype", "unspecified");
//            container.withInitScript("init.sql");
        }
        return container;
    }

    @Override
    public void start() {
        super.start();
        log.info("************ Starting mysql container ***********");
        log.info(container.getJdbcUrl());
    }
}
