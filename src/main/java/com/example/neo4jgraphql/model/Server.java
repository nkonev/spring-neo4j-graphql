package com.example.neo4jgraphql.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Server {

    @Id
    private String uri;
    private String title;
    @Property("registrations")
    private Boolean registrationsAllowed;
    @Property("short_description")
    private String shortDescription;
    @Relationship("CONNECTED_TO")
    private List<Server> connectedServers;

    public Server() {
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getRegistrationsAllowed() {
        return registrationsAllowed;
    }

    public void setRegistrationsAllowed(Boolean registrationsAllowed) {
        this.registrationsAllowed = registrationsAllowed;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public List<Server> getConnectedServers() {
        return connectedServers;
    }

    public void setConnectedServers(List<Server> connectedServers) {
        this.connectedServers = connectedServers;
    }

    // constructor, etc.
}
