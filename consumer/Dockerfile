FROM openjdk:11.0.3-jdk-slim-stretch

ADD ./target/consumer-0.0.1-SNAPSHOT.jar  /consumer/app/consumer-0.0.1-SNAPSHOT.jar

WORKDIR /consumer/app

ENTRYPOINT ["java","-jar","consumer-0.0.1-SNAPSHOT.jar"]