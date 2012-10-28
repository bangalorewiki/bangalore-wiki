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

insert into bwiki_schema.BowlingAlley(
name,  address,  
footFalls ,  contact,  contactPerson,  
rating) values ('MEGABOWL', 'PRESTIGE TERMINUS,2 AIRPORT ROAD,BLORE560017', 200, '5281655', 'DEEPANARDHAN',  
'A');
insert into bwiki_schema.BowlingAlley(
name,  address,  
footFalls ,  contact,  contactPerson,  
rating) values ('AMEOBA', 'CHURCH STREET', 500, '5594631/32', 'DHARMENDAR',  
'A');
insert into bwiki_schema.BowlingAlley(
name,  address,  
footFalls ,  contact,  contactPerson,  
rating) values ('ALLEY 365', '50,K.H.ROAD,BLORE-560027', 150, '2273826', '',  
'A');
insert into bwiki_schema.BowlingAlley(
name,  address,  
footFalls ,  contact,  contactPerson,  
rating) values ('STAR CITY', 'R.T. NAGAR', 400, '3543286', '',  
'A');
insert into bwiki_schema.BowlingAlley(
name,  address,  
footFalls ,  contact,  contactPerson,  
rating) values ('FUN CITY', '', 100, '', '',  
'A');
insert into bwiki_schema.BowlingAlley(
name,  address,  
footFalls ,  contact,  contactPerson,  
rating) values ('PATEL S GO KARTING INN', '88/22,15TH CROSS,2ND BLOCK,R.T.NAGAR,BLORE-560032',-1 , '', 'RAMESH PATEL',  
'A');
insert into bwiki_schema.BowlingAlley(
name,  address,  
footFalls ,  contact,  contactPerson,  
rating) values ('CRAZY WATERS', 'MYSORE ROAD', 100, '', '',  
'C');
