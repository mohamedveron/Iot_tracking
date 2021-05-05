# Iot_tracking

This service is developed using springboot framework and oapi-codegen to generate http client for other services and to be standard for frontend integration.

# Use api/api.yml file in the swagger ui to see the description of the apis description



## Setup of the component

Must have jdk installed version >= 8 and also maven

make file consists of 2 steps: generate, run
you can run all of them 

```bash
make all
```
This app use an relational db postgres and it is an AWS RDS postgres instance


# Start the http server on port 8080:

```bash
make run
```
