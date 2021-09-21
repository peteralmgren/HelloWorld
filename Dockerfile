FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ADD target/helloworld.jar helloworld.jar

ENTRYPOINT ["java","-jar","/helloworld.jar"]
