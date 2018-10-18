drop database if exists testdb_4;
create database testdb_4;
use testdb_4;

create table users(
user_id int primary key auto_increment,
user_name varchar(255),
password varchar(255)
);

insert into users values(1,"taro","123");
insert into users values(2,"jiro","456");
insert into users values(3,"hanako","789");
insert into users values(4,"saburo","012");

create table inquiry(
name varchar(255),
qtype varchar(255),
body varchar(255)
);

