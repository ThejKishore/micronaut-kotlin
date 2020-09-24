FROM openjdk:14-alpine
COPY build/libs/kotlin-demo-*-all.jar kotlin-demo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "kotlin-demo.jar"]