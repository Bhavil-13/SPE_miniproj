FROM openjdk:17
COPY ./target/sci_calc_miniproj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","sci_calc_miniproj-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]