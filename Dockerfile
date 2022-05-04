FROM openjdk:11
EXPOSE 8080
ADD target/address-book-api.jar address-book-api.jar
ENTRYPOINT ["java", "-jar", "address-book-api.jar"]