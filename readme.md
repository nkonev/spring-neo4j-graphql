
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
