CREATE TABLE bwiki_schema.test (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	place varchar(50),
	rating int(1),
	type varchar(30),
	PRIMARY KEY (no)
	);

CREATE TABLE bwiki_schema.places (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	place varchar(50),
	rating int(1),
	type varchar(30),
	dist int(10),
	direction varchar(30),
	road varchar(30),
	food varchar(10),
	lodge varchar(20),
	food_lodge varchar(20),
	petrol varchar(20),
	remarks varchar(50),
	days_reqd int(1),
	from_period varchar(3),
	to_period varchar(10),
	PRIMARY KEY (no)
);


CREATE TABLE bwiki_schema.movie_theatre (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	theatre_name varchar(50),
	address varchar(100),
	pin_code varchar(10),
	contact_number varchar(30),
	contact_person varchar(30),
	rating varchar(15),
	language varchar(50),
	PRIMARY KEY (no)
);

DROP TABLE `bwiki_schema`.`BeautyParlor`;

CREATE TABLE `bwiki_schema`.`BeautyParlor` (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	name varchar(50),
	address varchar(150),
	email varchar(50),
	contact varchar(30),
	foot_falls int(5),
	rating varchar(1),
	remarks varchar(100),
	PRIMARY KEY (no)
);

DROP TABLE `bwiki_schema`.`disco`;

CREATE TABLE `bwiki_schema`.`disco` (
	no int(10) unsigned NOT NULL AUTO_INCREMENT,
	name varchar(20),
	contact_person varchar(10),
	address varchar(100),
	phone_no varchar(30),
	capacity int(5),
	rating varchar(1),
	PRIMARY KEY (no)
);

drop table bwiki_schema.PizzaJoint;

CREATE TABLE bwiki_schema.PizzaJoint
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(30),
address varchar(100),
contact varchar(20),
capacity int(10),
 rating varchar(1),
 PRIMARY KEY (no));

drop table bwiki_schema.CoffeeBar;
 
CREATE TABLE bwiki_schema.CoffeeBar
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(20),
address varchar(100),
contact varchar(20),
contactPerson varchar(20),
rating varchar(1),
 PRIMARY KEY (no));

drop table bwiki_schema.PoolParlor;

CREATE TABLE bwiki_schema.PoolParlor
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(40),
contact varchar(10),
address varchar(100),
capacity int(5),
rating varchar(1),
 PRIMARY KEY (no));
 
drop table bwiki_schema.FastFood;

CREATE TABLE bwiki_schema.FastFood
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(40),
address varchar(100),
contact varchar(30),
pincode varchar(20),
rating varchar(1),
footfalls varchar(5),
contactPerson varchar(20),
 PRIMARY KEY (no));

drop table bwiki_schema.Restaurent;

CREATE TABLE bwiki_schema.Restaurent
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(20),
address varchar(100),
pincode varchar(10),
contact varchar(10),
rating varchar(1),
footfalls int(10),
 PRIMARY KEY (no));
 
drop table bwiki_schema.BowlingAlley;

CREATE TABLE bwiki_schema.BowlingAlley
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(30),
address varchar(100),
footFalls  int(5),
contact varchar(10),
contactPerson varchar(20),
rating varchar(1),
PRIMARY KEY (no));
 
drop table bwiki_schema.Pub;

CREATE TABLE bwiki_schema.Pub
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(30),
address varchar(100),
contact varchar(20),
capacity int(10),
rating varchar(1),
PRIMARY KEY (no));
 
drop table bwiki_schema.Club;

CREATE TABLE bwiki_schema.Club
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(40),
address varchar(100),
pinCode varchar(10),
phoneNo varchar(20),
contactPerson varchar(30),
members int(10),
grade varchar(10),
 PRIMARY KEY (no));