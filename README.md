# Java Recipes

```
recipe (rĕsˈə-pēˌ)►
n.	A set of directions with a list of ingredients for making or preparing something, especially food.
n.	A formula for or means to a desired end: a recipe for success.
n.	A medical prescription.
```

This repository contains a collection of `recipes` which aims to help get us started and, ultimately, delivering code with business value without too much fuss (such as gradle configuration).

## Recipes
### What we currently have
#### General
- Lombok (`@Data`, `@Builder`, `@Log`, `@toString`)

#### Marshaling
- CSV -> Objects *BeanIO*
- Objects -> CSV File *BeanIO*
- XSD -> Objects *XJC*
- WSDL -> Objects (ObjectFactory)
- JSON File -> Objects *Jackson*

#### Persistence
- SQL Migrations *Flyway*
- DSL *JOOQ*

#### REST
- Unirest

#### Test
- Serenity
- RestAssured

----

### What we will have next
#### Common
- Awaitility
- ApacheCommons
- Freecode (Google Builder library)
- FileUtils
- Guava
- Immutables (Builder Library)
- IOUtils

#### Data
- Redis

#### Messaging
- JMS
- RabbitMQ

#### Services
- Netflix Eureka (Service Discovery)

#### Test
- JUnit 5
- Hamcrest
- SerenityRest
- Extent Reports
- Mockito
- Wiremock

## Areas of Interest
### General Java
* Java Streams
* Collectors
* Functional Programming

### Spring
* Spring DI (Application Context)
* Spring JdbcTemplate
* Spring JPA
* Spring JOOQ (database abstraction)
* Spring REST
* Spring Cloud Eureka `org.springframework.cloud:spring-cloud-starter-netflix-eureka-server/client` (Service Registry, Auto Discovering Clients)
* Spring Security/OAuth

#### REST
* REST APIs (archtecting and designing)
* Swagger UI https://swagger.io/tools/swagger-ui/
* https://www.baeldung.com/swagger-2-documentation-for-spring-rest-api

#### Miscellaneous
* Unirest HTTP client
* HTTPie CLI HTTP client
* Docker Compose Cheatsheet https://github.com/wsargent/docker-cheat-sheet

## References
### General
- https://search.maven.org/
- https://projectlombok.org/
- https://spring.io/guides
- https://docs.gradle.org/current/userguide/userguide.html
- http://www.enterpriseintegrationpatterns.com
- http://plantuml.com/
- https://junit.org/junit5/docs/current/user-guide/
- https://spring.io/guides/tutorials/bookmarks/

### Test
* JUnit 5 https://junit.org/junit5/
* Mockito https://site.mockito.org/
* Serenity http://www.serenity-bdd.info/#/
* Cucumber (Gherkin BDD) https://docs.cucumber.io/docs/gherkin.html
* WireMock http://wiremock.org/
