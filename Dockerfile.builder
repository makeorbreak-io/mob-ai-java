FROM mob-ai-java:latest

RUN mkdir /robot/
ADD multipaint /robot/multipaint
ADD lib/*.jar /robot/lib/
ADD Bot.java /robot/Bot.java

WORKDIR /robot/
RUN javac Bot.java

ENV CLASSPATH=.:lib/gson-2.6.2.jar

ENTRYPOINT ["java", "Bot"]
