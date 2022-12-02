FROM openjdk:17-oracle

LABEL maintainer="Bogdan David"

ADD target/cloud-practice-0.0.1-SNAPSHOT.jar cloud-practice.jar

EXPOSE 80

ENTRYPOINT ["java", "-jar", "cloud-practice.jar"]