package com.example.neo4jgraphql;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.context.ImportTestcontainers;
import org.springframework.graphql.ExecutionGraphQlService;
import org.springframework.graphql.test.tester.ExecutionGraphQlServiceTester;
import org.springframework.graphql.test.tester.GraphQlTester;

@SpringBootTest
@ImportTestcontainers(Neo4jContainerConfiguration.class)
class Neo4jGraphqlApplicationTests {

    final GraphQlTester graphQlTester;

    @Autowired
    public Neo4jGraphqlApplicationTests(ExecutionGraphQlService graphQlService) {
        this.graphQlTester = ExecutionGraphQlServiceTester.builder(graphQlService).build();
    }

    @Test
    void resultMatchesExpectation() {
        String query = "{" +
                "  account(username:\"meistermeier\") {" +
                "    displayName" +
                "  }" +
                "}";

        this.graphQlTester.document(query)
                .execute()
                .path("account")
                .matchesJson("[{\"displayName\":\"Gerrit Meier\"}]");

    }

}
