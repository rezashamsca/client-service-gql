# Use docker build . -t rtecsoft/demo-customer-mssql:{version} to build the image

# We choose exact tag (not 'latest'), to be sure that new version wont break creating image
FROM mcr.microsoft.com/mssql/server:2019-latest

# change active user to root
USER root

# Create app directory
RUN mkdir -p /usr/src/app

# set mssql as owner of the app directory
RUN chown mssql /usr/src/app

# change back to user mssql
USER mssql

WORKDIR /usr/src/app

# Copy initialization scripts
COPY ./init /usr/src/app

# change active user to root
USER root

# Grant permissions for the run-initialization script to be executable
RUN chmod +x /usr/src/app/run-initialization.sh

# change back to user mssql
USER mssql

# Set environment variables, not to have to write them with docker run command
# Note: make sure that your password matches what is in the run-initialization script
ENV SA_PASSWORD yourStrong(!)Password
ENV ACCEPT_EULA Y

# Expose port 1433 in case accesing from other container
EXPOSE 1433

# Run Microsoft SQl Server and initialization script (at the same time)
# Note: If you want to start MsSQL only (without initialization script) you can comment bellow line out, CMD entry from base image will be taken
CMD /bin/bash ./entrypoint.sh