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

 CREATE TABLE if not exists `node` (
  `id` int NOT NULL,
  `name` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

 
 CREATE TABLE if not exists `node_children` (
  `node_id` int NOT NULL,
  `children_id` int NOT NULL,
  UNIQUE KEY `UK_children` (`children_id`),
  CONSTRAINT `FK_node` FOREIGN KEY (`node_id`) REFERENCES `node` (`id`),
  CONSTRAINT `FK_child` FOREIGN KEY (`children_id`) REFERENCES `node` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

  
 
