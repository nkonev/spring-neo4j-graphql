
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

```
