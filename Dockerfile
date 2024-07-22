FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/LearnToCode.java-1.0-SNAPSHOT.jar learntocode.jar
EXPOSE 5000
ENTRYPOINT exec java $JAVA_OPTS -jar learntocode.jar
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
#ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar learntocode.jar
