# cf-redis-demo
Simple Spring Boot app using Redis - deployable to Cloud Foundry. 

This demo is based on the [Micorosft Spring Initializer tutorial](https://docs.microsoft.com/en-us/java/azure/spring-framework/configure-spring-boot-initializer-java-app-with-redis-cache?view=azure-java-stable) using an Azure Redis Cache.

It has been modified to leverage Pivotal Application Service (PAS) on Azure including the [Azure Service Broker](https://github.com/Azure/meta-azure-service-broker) to create the Redis Cache. In addition, the Spring Boot Starter *Cloud Connector* is being used to automatically create the Redis DataSource based on the injected environment variables. The *Actuator* provides additional capabilities to the app and integrates with PAS.

Please adjust the `manifest.yml` to deploy to PAS to your needs. Make sure to create a Redis Cache machting the name in the manifest.yml:
```
cf create-service azure-rediscache basicc0 myrediscache
```
