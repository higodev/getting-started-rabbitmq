FROM gradle:jdk11 as gradleimage
COPY . /home/gradle/source
WORKDIR /home/gradle/source
RUN gradle clean build

FROM openjdk:11-jre-slim
COPY --from=gradleimage /home/gradle/source/build/libs/getting-started-rabbitmq-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
ENTRYPOINT ["java", "-jar", "getting-started-rabbitmq-0.0.1-SNAPSHOT.jar"]