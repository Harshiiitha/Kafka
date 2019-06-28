FROM openjdk:11.0.3-jdk-slim-stretch

ADD ./target/producer-0.0.1-SNAPSHOT.jar  /producer/app/producer-0.0.1-SNAPSHOT.jar

WORKDIR /producer/app

ENTRYPOINT ["java","-jar","producer-0.0.1-SNAPSHOT.jar"]