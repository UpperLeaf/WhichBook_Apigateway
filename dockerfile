FROM openjdk:11.0.8-slim-buster
COPY . /usr/src/api_gateway
WORKDIR /usr/src/api_gateway
CMD ["./gradlew", "bootRun"]