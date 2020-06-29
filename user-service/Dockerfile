FROM alpine
RUN apk update
RUN apk upgrade
RUN apk add openjdk8

ADD target/user-service-0.0.1-SNAPSHOT.jar /

ENV PORT=8050

EXPOSE 8050

ENTRYPOINT ["java","-jar","user-service-0.0.1-SNAPSHOT.jar"]
