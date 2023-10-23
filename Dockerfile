FROM openjdk:17
WORKDIR /app
COPY ./build/libs/calculator-0.0.1-SNAPSHOT.jar /app/choco-calculator.jar
CMD ["java", "-jar", "/app/choco-calculator.jar"]

