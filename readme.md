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
