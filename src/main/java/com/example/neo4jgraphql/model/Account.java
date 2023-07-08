package com.example.neo4jgraphql.model;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Property;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
public class Account {

    @Id
    private String id;
    private String username;
    @Property("display_name")
    private String displayName;
    @Relationship("REGISTERED_ON")
    private Server server;
    @Relationship("FOLLOWS")
    private List<Account> following;

    public Account() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public List<Account> getFollowing() {
        return following;
    }

    public void setFollowing(List<Account> following) {
        this.following = following;
    }

    // constructor, etc.
}
