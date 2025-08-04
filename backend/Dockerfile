# uses the official Gradle image to build the application
FROM gradle:8.2.1-jdk17

# set the working directory inside the container, all commands will be run from here and files will be copied to this directory
WORKDIR /app
COPY . .

# build the application using Gradle
CMD ["./gradlew", "bootRun"]
