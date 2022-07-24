FROM openjdk:17.0.2-jdk-slim
ENV APP_FILE client-service-gql-0.0.4.jar
ENV APP_HOME /usr/apps
EXPOSE 8080
COPY target/$APP_FILE $APP_HOME/
WORKDIR $APP_HOME
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -jar $APP_FILE"]