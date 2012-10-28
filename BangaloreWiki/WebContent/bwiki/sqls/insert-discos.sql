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

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('INSOMANIA ', '', 'LE MERIDIAN', '', 500, 'A');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('NOSTALGIA', '', 'GOLDEN PALMS', '', 150, 'A');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('THE ROCKS', '', 'ALLASANDRA,BELLARY ROAD,BLORE-560058,PH#', '8462776 / 8560667', 100, 'C');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('SPLASH', '', 'CLUB CABANA,JADE GARDEN,BELLARY ROAD,BLLORE-560058', '5095151 / 8467055', 500, 'B');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('TIME N AGAIN', '', 'BRIGADE ROAD,BLORE-560001', '5585845', 400, 'C');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('THE CLUB,INFERNO', '', '7TH MILE,MYSORE ROAD,BLORE-560040', '8600665/8600768', 1000, 'A');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('CLUB ET DISCOTHEQUE', '', 'CHA CHE HOTELS LTD.,CHA CHE TOWERS,50 RESIDENCY ROAD,BLORE-560025', '2229321 / 2223922', 400, 'C');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('JJs', '', 'AIRPORT ROAD,BLORE-560008', '5261929', 200, 'B');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('CROSS OVER', '', 'WHITE FIELD,BANGALORE', '', 200, 'C');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('Eclipse', '', 'ARC CLUB,TUNNEL ROAD,MURGESHPALYA,BANAGLORE', '', 100, 'C');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('FUNKY TOWN', '', 'RESIDENCY ROAD,BANGALORE', '', 300, 'B');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('EC41', '', 'HOSUR ROAD,TAMIL NADU', '', 500, 'A');

insert into `bwiki_schema`.`disco` (name, contact_person, address, phone_no, capacity, rating) values ('URBAN EDGE', '', '#131,BRIGADE ROAD,OPP VELLARA JUNCTION,BLORE-5600025', '2211574', 700, 'A');