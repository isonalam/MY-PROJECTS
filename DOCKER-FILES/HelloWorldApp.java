FROM openjdk:11
MAINTAINER sonalpriya1597@gmail.com
WORKDIR data
COPY  . . 
RUN javac HelloWorldApp.java
EXPOSE 8080
CMD ["java","HelloWorldApp"]
