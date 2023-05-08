FROM amazoncorretto:17-alpine-jdk
RUN echo "Main-Class: NhApplication" > manifest.txt
COPY target/nh-0.0.1-SNAPSHOT.jar app.jar
COPY manifest.txt /META-INF/MANIFEST.MF
ENTRYPOINT ["java", "-jar", "/app.jar"]