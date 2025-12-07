FROM eclipse-temurin:21-jdk
WORKDIR /app
COPY src/ /app/
RUN javac *.java
CMD ["java", "FitnessTrackerApp"]