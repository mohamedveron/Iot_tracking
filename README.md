# Iot_tracking

This service is developed using springboot framework and oapi-codegen to generate http client for other services and to be standard for frontend integration.

# Use api/api.yml file in the swagger ui to see the description of the apis description

# Assumptions:
1- Each device has one SIMCard and it is optional
2- You have first create device and you will receive the id of this device then you can configure it by adding SIMCard to this device
3- You can change the configuration status by update the status of the SIMcard and if the status is active then the device will be ready for sale.


## Setup of the component

Must have jdk installed version >= 8 and installed maven

make file consists of 2 steps: generate, run
you can run all of them 

```bash
cd tracking
make all
```
This app use an relational db postgres and it is an AWS RDS postgres instance


# Start the http server on port 8080:

```bash
cd tracking
make run
```
