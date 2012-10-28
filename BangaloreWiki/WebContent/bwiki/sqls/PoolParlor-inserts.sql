drop table bwiki_schema.PoolParlor;

CREATE TABLE bwiki_schema.PoolParlor
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(40),
contact varchar(10),
address varchar(100),
capacity int(5),
rating varchar(1),
 PRIMARY KEY (no));

insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('PRIMETIME', '', 'INDIRANAGAR', 200, 'A');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('CYBER QUE', '', 'BRIGADE ROAD', 150, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('POT SHOTS', '', 'BRIGADE ROAD', 100, 'A');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('CUE CLUB', '', 'BASAVANAGUDI', 100, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('ALL BALLS', '', 'CAMBRIDGE ROAD', 100, 'A');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('DOWNTOWN PUB', '', 'RESIDENCY ROAD', 150, 'A');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('CHA CHE TOWERS', '', 'RESIDENCY ROAD', 200, 'A');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('KARNATAKA STATE BILLIARDS ASSOCIATION', '', 'MILLERS ROAD',-1 , 'A');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('CYBER POOL', '', 'KORAMANGALA', 150, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('7 HILLS', '', 'JAYANAGAR', 200, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('TITO S', '', 'KORAMANGALA', 100, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('CUE HAWK', '', 'HOSUR ROAD', 50, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('ALLEY 365', '', 'K.H. ROAD', 500, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('Funstation', '', '#316, 3rd Flr, 5th Avenue,BRIGADE ROAD,BLORE-560001,PH#5098327', 100, 'B');
insert into bwiki_schema.PoolParlor(
name,  contact,  
address,  capacity,  rating) values ('Thunder Ball', '', 'Bellary Rd,PH#5095151/8467055-58', 100, 'C');