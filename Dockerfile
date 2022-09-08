FROM openjdk
RUN mkdir app
COPY . /src/java
WORKDIR /src/java
RUN ["javac", "Main.java"]
ENTRYPOINT ["java","Main.java"]

