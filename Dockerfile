FROM openjdk:24
RUN mkdir /app
COPY out/production/IS147%20project/ /app
WORKDIR /app
CMD java Main