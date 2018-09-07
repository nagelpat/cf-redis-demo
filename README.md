# cf-redis-demo
Simple Spring Boot app using Redis - deployable to Cloud Foundry. 

This demo is based on the [Micorosft Spring Initializer tutorial](https://docs.microsoft.com/en-us/java/azure/spring-framework/configure-spring-boot-initializer-java-app-with-redis-cache?view=azure-java-stable) using an Azure Redis Cache.

It has been modified to leverage Pivotal Application Service (PAS) on Azure including the [Azure Service Broker](https://github.com/Azure/meta-azure-service-broker):
- added the following Spring Boot Starters: *Actuator* and *Cloud Connectors*
- added a manifest.yml to deploy to CloudFoundry

Make sure to create a Redis Cache machting the name in the manifest.yml:
```
cf create-service azure-rediscache basicc0 myrediscache
```
