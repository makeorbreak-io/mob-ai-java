FROM mob-ai-java:latest

RUN mkdir /robot/
ADD multipaint /robot/multipaint
ADD lib/*.jar /robot/lib/
ADD Bot.java /robot/Bot.java

ENV CLASSPATH=.:lib/gson-2.6.2.jar

WORKDIR /robot/
RUN javac Bot.java

ENTRYPOINT ["java", "Bot"]
