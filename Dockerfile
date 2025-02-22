FROM openjdk:21
WORKDIR /ocp
COPY ocpdemo.jar ocpdemo.jar
RUN chmod 777 ocpdemo.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "ocpdemo.jar"]