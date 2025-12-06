FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY src/ /app/src/
RUN javac src/*.java
CMD ["java", "-cp", "src", "FitnessTrackerApp"]