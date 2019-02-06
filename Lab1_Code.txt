--CREATE DATABASE labB1;

use labB1;
CREATE TABLE Student
(
ID int,
Name varchar(50),
phone varchar(50),
address varchar(100)
);
INSERT INTO Student VALUES (1,'Adam','01611','Dhaka');


CREATE TABLE PERSON
(
ID int,
firstName varchar(50),
lastName varchar(50),
birthDay date,
address varchar(50),
salary Decimal(7,2)
);

INSERT INTO PERSON VALUES (1,'Zahid','HASAN','1998-01-03','Dhaka','80000.00');
INSERT INTO PERSON VALUES (2,'Ishan','HASAN','1998-01-03','Dhaka','80000.00');
INSERT INTO PERSON VALUES (3,'Rakib','HASAN','1998-01-03','Dhaka','80000.02');
INSERT INTO PERSON VALUES (4,'kamal','HASAN','1998-01-03','Dhaka','80000.00');
INSERT INTO PERSON VALUES (5,'Rahat','HASAN','1998-01-03','Dhaka','80000.00');
INSERT INTO PERSON VALUES (6,'ZAHID','HASAN','1998-01-03','Dhaka','80000.00');
