package com.example.neo4jgraphql.repository;

import com.example.neo4jgraphql.model.Account;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.graphql.data.GraphQlRepository;

@GraphQlRepository
public interface AccountRepository extends Neo4jRepository<Account, String> { }
