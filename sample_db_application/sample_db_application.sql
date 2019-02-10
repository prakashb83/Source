CREATE DATABASE dbapplication;
use dbapplication;
CREATE TABLE users_data(id int primary key auto_increment, name varchar(40), email varchar(50), phone varchar(20));
INSERT INTO users_data(name, email, phone) values("user1", "user1@gmail.com", "8678904323");