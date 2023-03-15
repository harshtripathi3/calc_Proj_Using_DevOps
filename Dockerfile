FROM openjdk
COPY ./target/calc_Proj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "calc_Proj-1.0-SNAPSHOT-jar-with-dependencies.jar"]