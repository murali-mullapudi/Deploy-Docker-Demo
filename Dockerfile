FROM java:8

EXPOSE 8090

ADD target/Deploy-Docker-Demo.jar Deploy-Docker-Demo.jar

ENTRYPOINT ["java","-jar","Deploy-Docker-Demo.jar"]