FROM alpine
RUN apk update
RUN apk upgrade
RUN apk add openjdk8

ADD target/order-service-0.0.1-SNAPSHOT.jar /

ENV PORT=8060

EXPOSE 8060

ENTRYPOINT ["java","-jar","order-service-0.0.1-SNAPSHOT.jar"]
