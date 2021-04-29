FROM openjdk:11-jre-slim
VOLUME /tmp
ADD /target/spring-boot-kafka-consumer.jar spring-boot-kafka-consumer.jar
ENTRYPOINT ["java","-jar","/spring-boot-kafka-consumer.jar"]