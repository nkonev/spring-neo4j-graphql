package com.example.neo4jgraphql.controller;

import com.example.neo4jgraphql.model.Account;
import com.example.neo4jgraphql.repository.AccountRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class AccountController {

    private final AccountRepository repository;

    AccountController(AccountRepository repository) {
        this.repository = repository;
    }

    @QueryMapping
    List<Account> accounts() {
        return repository.findAll();
    }
}
