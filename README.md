# Spring Boot with GraphQL
> Sample GraphQL Server

## GraphQL Testing the Application
1. http://localhost:8080/graphiql
2. Postman (beta version)

## Mutation Request
```
mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
  {
    id
  }
}
```

## Query Request
```
query {
  vehicles(count: 1) 
  {
    id, 
    type, 
    modelCode
	}
}
```

## References
- https://www.baeldung.com/spring-graphql
- https://itnext.io/beginners-guide-to-graphql-with-spring-boot-69d229e87b19