FROM alpine
RUN apk update
RUN apk upgrade
RUN apk add openjdk8

ADD target/aggregator-service-0.0.1-SNAPSHOT.jar /

ENV PORT=8070

EXPOSE 8070

ENTRYPOINT ["java","-jar","aggregator-service-0.0.1-SNAPSHOT.jar"]
