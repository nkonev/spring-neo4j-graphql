package com.example.neo4jgraphql.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Server {

    @Id
    String uri;
    String title;
    @Property("registrations") Boolean registrationsAllowed;
    @Property("short_description") String shortDescription;
    @Relationship("CONNECTED_TO") List<Server> connectedServers;

    // constructor, etc.
}
