http://localhost:8080/graphiql
http://localhost:7474

```graphql
{
  accounts {
    username
  }
}
```

```graphql
{
  account(username: "meistermeier") {
    username
    following {
      username
      server {
        uri
      }
    }
  }
}
```

# Scrolling
```graphql
{
  accountScroll {
    edges {
      node {
        username
      }
    }
    pageInfo {
      hasNextPage
      endCursor
    }
  }
}
```
then
```graphql
{
  accountScroll(after:"T18x", first: 2) {
    edges {
      node {
        username
      }
    }
    pageInfo {
      hasNextPage
      endCursor
    }
  }
}
```


# Further reading
* https://spring.io/blog/2023/06/27/using-spring-for-graphql-with-spring-data-neo4j
* https://github.com/meistermeier/spring-graphql-neo4j/blob/be65c00a5286a372655884313c84c453f82ddfa8/README.adoc
