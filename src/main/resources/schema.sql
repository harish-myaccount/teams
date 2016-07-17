create database if not exists harish;
use harish;
create table if not exists teams (team_id int primary key,
name varchar(25) not null
);

create table if not exists students (student_id int primary key,
 name varchar (25) NOT NULL,
 team int default null,
 FOREIGN KEY (team) REFERENCES teams(team_id)
 );
