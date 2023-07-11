package com.example.neo4jgraphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;

@TestConfiguration(proxyBeanMethods = false)
@ImportTestcontainers(Neo4jContainerConfiguration.class)
class TestNeo4jGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.from(Neo4jGraphqlApplication::main)
                .with(TestNeo4jGraphqlApplication.class)
                .run(args);
    }
}
