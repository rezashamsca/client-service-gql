CREATE DATABASE IF NOT EXISTS ClientDb;
USE ClientDb;
CREATE TABLE IF NOT EXISTS client (id BINARY(16) PRIMARY KEY, name VARCHAR(255), INDEX(name)) engine=InnoDb;
