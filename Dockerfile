FROM openjdk:17
#ARG JAR_FILE=target/*.jar
ADD ./target/third-party-server-0.0.1-SNAPSHOT.jar third-party-server.jar
#COPY java-practice.1.0-SNAPSHOT
EXPOSE 8092
ENTRYPOINT ["java","-jar","/third-party-server.jar"]