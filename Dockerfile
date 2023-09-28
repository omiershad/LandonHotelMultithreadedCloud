FROM ubuntu:latest
LABEL authors="oersh"

ENTRYPOINT ["top", "-b"]

FROM openJDK:11
COPY C:\Users\oersh\IdeaProjects\d387-advanced-java\target\D387_sample_code-0.0.2-SNAPSHOT.jar
WORKDIR /usr/src
EXPOSE 8080
CMD ["java", "-jar", "D387_sample_code-0.0.2-SNAPSHOT.jar"]