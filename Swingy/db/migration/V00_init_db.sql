CREATE DATABASE IF NOT EXISTS swingy_db;
CREATE USER 'ugtheven'@'localhost:933' IDENTIFIED BY '123456';
GRANT ALL PRIVILEGES ON swingy_db.* TO 'ugtheven'@'localhost:933';
FLUSH PRIVILEGES;