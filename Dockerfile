FROM openjdk:17-jdk-slim-buster
EXPOSE 8092
ADD ./target/third-party-server.jar third-party-server.jar
ENTRYPOINT ["java","-jar","/third-party-server.jar"]