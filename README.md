# ASCENDING Training 
## Overview
This is a sample project for [ASCENDING](www.ascendingdc.com)

### Project Technical Overview:
* Business Rules
    1. zhang3
    1. li4
* Development Approaches
    1. zhang3
    2. li4

## Configure local environment
### 1. setup local database with docker
Reference to postgres docker [image](http://hub.docker.com/_/postgres) for environment

```
docker run --name training-db -e POSTGRES_USER=${username} -e POSTGRES_PASSWORD=${password} -e POSTGRES_DB=${databaseName} -p 5431:5432 -d postgres
```    
### migrate database schema
Refer to flyway setup [documentation](http://github.com/xc)
```
mvn clean compile flyway:migrate
```