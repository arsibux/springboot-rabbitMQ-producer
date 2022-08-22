# Springboot RabbitMQ

Demo project for springboot message consumer using [rabbitMQ](https://www.rabbitmq.com/).

## RabbitMQ

RabbitMQ is one of the most popular open source message brokers.

![kafka producer service](https://github.com/arsibux/springboot-rabbitMQ-producer/blob/main/draw_io/rabbit-producer.drawio.png "kafka producer service")

## Installation

1. Run command at code directory `git clone https://github.com/arsibux/springboot-rabbitMQ-producer.git`
2. Run `docker-compose up -d` [docker-desktop installaton](https://docs.docker.com/desktop/)
3. Open Project in [IntelliJ Idea](https://www.jetbrains.com/idea/download/).
4. Run `mvn clean install` and run `mvn spring-boot:run`
5. Import workspace file of [Postman](https://www.postman.com/downloads/)
   at `${root}/postman/RabbitMQ.postman_collection` into postman.

![postman-api-call](https://github.com/arsibux/springboot-rabbitMQ-producer/blob/main/docs/img/postman-api-call.png "postman-api-call")

You can see the message here at terminal.

![postman-api-call](https://github.com/arsibux/springboot-rabbitMQ-producer/blob/main/docs/img/verify.png "postman-api-call")


## Resources

* [Spring Cloud Apache Kafka](https://spring.io/projects/spring-kafka#overview)
* [Apache Kafka with Spring](https://www.baeldung.com/spring-kafka)