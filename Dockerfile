FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sitcom.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/sitcom.jar"]