package com.example.cloudpractice;

import com.example.cloudpractice.testcontainers.DatabaseTest;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DatabaseTest
public abstract class IntegrationTestBase {

}
