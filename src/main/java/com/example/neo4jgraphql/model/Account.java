package com.example.neo4jgraphql.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Account {

    @Id
    String id;
    String username;
    @Property("display_name") String displayName;
    @Relationship("REGISTERED_ON") Server server;
    @Relationship("FOLLOWS")
    List<Account> following;

    // constructor, etc.
}
