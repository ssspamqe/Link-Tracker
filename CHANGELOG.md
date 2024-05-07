# Changelog

All notable changes to this project will be documented in this file.

## [0.12.1] - 2024-05-07

### Added
- Additional documentation at swagger page
    - Endpoints description
    - Possible API response description

## [0.12] - 2024-04-15

### Added
- Kafka integration tests (using Awaitility)

## [0.11] - 2024-04-13

### Added
- Prometheus and Grafana to docker compose file
- Metrics configuration in yaml file

## [0.10] - 2024-04-09

### Added
- Kafka Connection between Scrapper and Bot
  - Configurable kafka consumer in Bot
        - Messagges that can be deserialized or processed will be sent to dead letter topic
  - Confgurable kafka producer in Scrapper
  - Kafka, Zookeeper and Kafka-ui were added to compose file

### Changed
- LocalDateTime was changed to OffsetDateTime to keep the time zones

## [0.9] - 2024-04-04

### Added
- Configurable retry mechanics to all web clients
- Configurable rate limiting for rest api endpoints in Srapper

## [0.8] - 2024-03-30

### Added
- Jpa-implemented repositories and DataAccessObjects

### Changed
- Repositories implementation now can be choosed via yaml config file
- Methods in repositories that retrieve "Now" time were deleted.

## [0.7] - 2024-03-20

### Added
- Scrapper-jooq application (need for autogenerating jooq code)
- Jooq-implemented repositories

### Changed
- Once implemented service can use JDBC or Jooq implemented repotitories

## [0.6] - 2024-03-19

### Added 
- PostgreSQL tables:
    - Chats
    - Links
    - chat_links
    - stack_overflow_questions
    - git_hub_repositories
- JDBC PostgreSQL connection
- JDBC repositories implementations
    - Chat Repository
    - Link Repository
    - StackOverflow question Repository
    - GitHub repositories Repository
- JDBC related services implementations
    - Chats service
    - Links service
    - StackOveflow questions service
    - GitHub repotitories service
- Parsing Links and determining service, which they represent
- Reporting the type of update for bot service
- new LinkUpdateType enum

### Changed
- Slash commands methods' signatures
- The LinkUpdate DTO data

### Deleted
- Redis Services

## [0.5] - 2024-03-08

### Added
- Database migration files
- Liquibase in docker-compose file
- Sample PostgreSQL integration test

## [0.4] - 2024-03-08

### Added
- Rest api controllers
    - Bot rest controller
        - post /update - send update
    - Scrapper rest controller
        - post /tg-chat/{id} - register chat
        - delete /tg-chat/{id} - delete chat
        - get /links - get all tracked links(requires Tg-Chat-Id header)
        - post /links - add link for tracking (requires Tg-Chat-Id header)
        - delete /links - delete tracked link (requires Tg-Chat-Id header)
- Service and domain layers in Scrapper
    - Redis is being used for storing data
- Swagger-ui for api
- Web clients
    - Bot web client in scrapper
    - Scrapper web client in bot
 
### Changed
- Slash commands hierarchy
- Slash commands service layer was refactored 


## [0.3] - 2024-02-22

### Added
- Web clients
    - StackOverflow web client
        - Getting question by id
        - Getting answers by question id
    - GitHub web client
        - Getting repository by owner and repository name
        - Gettign repository activites by owner and repository name
  

## [0.2] - 2024-02-22

### Added   
- Bot skeleton
  - 5 slash commands
    - Track
    - Untrack
    - Help
    - List
    - Start
- Temporary Data storage 
