
FROM openjdk:21
WORKDIR /bot
COPY ./target/bot.jar /bot
EXPOSE 8090
EXPOSE 8091
EXPOSE 9092
CMD ["java", "--enable-preview", "-jar", "bot.jar"]
