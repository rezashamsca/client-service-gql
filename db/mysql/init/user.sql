CREATE DATABASE IF NOT EXISTS ClientDb;

ALTER DATABASE ClientDb
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

 CREATE USER 'clientdb_user'@'%' IDENTIFIED BY 'yourStrong(!)Password';
 GRANT ALL ON ClientDb.* TO 'clientdb_user'@'%';
