FROM openjdk:21
WORKDIR /scrapper
COPY ./target/scrapper.jar /scrapper
EXPOSE 8080
EXPOSE 8081
CMD ["java", "--enable-preview", "-jar", "scrapper.jar"]
