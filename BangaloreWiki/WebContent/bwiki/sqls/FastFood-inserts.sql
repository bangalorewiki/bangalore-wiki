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

insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Adam s Fast Food', '485, 9th Main, HAL II Stage, Bangalore - 560038.', 'Phone : 5292005.', '', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Casa Piccola', '26, CMH Road, Bangalore - 560038.,', 'Phone : 5258823.', '', 'B', 150, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Casa Piccola', 'Devatha Plaza, Residency Road,', ' Phone : 2212907.', 'Bangalore - 560025', 'B', 500, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Casa Piccola', 'Westminister, Cunningham Road,', ' Phone : 2203330.', 'Bangalore - 560052', 'B', 400, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Corner House', 'Firdaus Complex, 44/1, Residency Road,', ' Phone : 5292005, 5583262.', 'Bangalore - 560025', 'A', 600, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Indiana Fast Food', '9, St. Patrick s Complex, Residency Road,', ' Phone : 5585966.', 'Bangalore 560025', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Kentucky Fried Chicken', '4, Brigade Road, Bangalore - 560001.,', 'Phone : 5598782.', '', 'A', 700, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Mac Fast Food', 'Church Street, Bangalore 560001., Phone : 5588056.', '', '', 'B', 110, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Nilgiris Restaurant', 'Golden Enclave, Airport Road,', ' Phone : 5266955.', 'Bangalore - 560071', 'B', 75, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Pizza Delight', '300, 5th Cross, 6th Block, Koramangala,', ' Phone : 5530467.', 'Bangalore - 560095', 'B', 60, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Stars And Stripes', '2, St.Partick s Church Complex, Brigade Road,', ' Phone : 5548425.', 'Bangalore - 560001', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('The Only Place', 'Mota Royal Arcade, 158, Brigade Road,', ' Phone : 5588678.', 'Bangalore - 560001', 'Z',-1 , '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Wimpy s', '50, Brigade Road, Bangalore - 560001.,', 'Phone : 5588783.', '', 'B', 150, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Aden`s Fast Food', 'Address : Ejipuramainroad Viveknagar', 'Phone : 5716536', 'Pin : 560047', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Family Bakery', 'Address : 16/2 3rd Main Vannarpet', 'Phone : 5542745', 'Pin : 560047', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Hot Breads', 'Address : No.83 Copperarch', 'Phone : 5591848', 'Pin : 560001', 'B', 200, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Indian Bakery', 'Address : 8 Near State Bank Of India Hal Market Complex', 'Phone : 5279602', 'Pin : 560017', 'C', 120, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Indian Store Bakery', 'Address : Ejipura Main Road Viveknagar', 'Phone : 5716095', 'Pin : 560047', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Iyengar`s Bakery', 'Address : 145, M.M. Road', 'Phone : 5483228', 'Pin : 560005', '', 100, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Iyengars Bakery', 'Address : No-39/213,Remco-Lyt Vijayanagar', 'Phone : 3352827', 'Pin : 560040', 'C', 100, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('M.S. Bakery', 'Address : Crpuramextesnion Gundappa Meet Road', 'Phone : 5477831', 'Pin : 560084', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Magnolia Confectioners', 'Address : 37, 8th Main, 2nd Cross Vasanthnagar', 'Phone : 2255267', 'Pin : 560052', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Pink Panther', 'Address : G-7 Ramashree Chambers Lady Curzon Road', 'Phone : 5592404', 'Pin : 560001', 'B', 100, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Surabhi Fast Food', 'Basaveshwarnagar', 'Phone : 3201966', 'Pin : 560079', 'B', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Sweet Chariot', 'Address : 11 Brigade Road', 'Phone : 5580729', 'Pin : 560001', 'A', 200, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Thom`s Bakery and Super Market', 'Address : 1/2 Wheeler Road', 'Phone : 5301860', 'Pin : 560005', 'A', 500, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Vishnu Sagar', 'Address : 186/2 S.E.Rd Sheshadripuram', 'Phone : 3442514', 'Pin : 560020', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Anand Sweets and Savouries Frazer Tn', 'Address : 7/1 Hainees Rd', 'Phone : 5301555', 'Pin : 560005', 'A', 350, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Cafe Tip Top', 'Address : 24 9th Main Road', 'Phone : 6631546', 'Pin : 560011', 'C', 50, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Cake Basket', 'Address : 2, Kumarapark East Kumarkrupa Road', 'Phone : 2258704', 'Pin : 560001', 'C', 120, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Cake Pack Bakery', 'Address : 52/2, 17th Crs, Mc Layout', 'Phone : 3387161', 'Pin : 560040', 'C', 100, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('Cakes and Flakes', 'Address : 100 5th Block 5th Cross,KORAMANGALA', 'Phone : 5534843', 'Pin : 560095', 'B', 100, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('SHANTI SAGAR', 'C.M.H. ROAD', 'Phone:2918799', '', 'B', 1000, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('SUKH SAGAR', 'C.M.H. ROAD', 'Phone:2202255', '', 'B', 1000, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('M.T.R.', 'J.C.ROAD', 'Phone:2220022', '', 'A', 600, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('CADAMBAM', 'M.G.ROAD', 'Phone:6548852', '', 'A', 800, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('SAMRAT', 'RACE COURSE ROAD', 'Phone:2261996', '', '', 700, 'Rajavendra pai');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('AIRLINES', 'LAVELLE ROAD', 'Phone:6640150', '', 'A', 500, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('DELHI CHOWK', 'LANGFORD TOWN', 'Phone:2218891', '', 'B', 75, 'sridhar');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('MEGH SAGAR', 'INDIRANAGAR', 'Phone:5250110', '', 'C', 100, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('WOODY S', 'COMMERCIAL STREET', '', '', 'A', 500, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('BHAGHATRAM S', 'COMMERCIAL STREET', '', '', 'B', 800, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('ADIGAS', 'JAYANAGAR', 'Phone:6531570', '', 'A', 1000, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('ICY NICY', 'JAYANAGAR', '', '', 'B', 200, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('PAVITHRA', 'JAYANAGAR', 'Phone:6704524', '', 'B', 1000, 'usman');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('ICE N SPICE', 'ST.MARKS ROAD', 'Phone:2211094', '', 'B', 150, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('KABAB CORNER', 'ST.MARKS ROAD', 'Phone:5520404', '', 'B', 150, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('KABAB MAGIC', 'K.R.ROAD', '', '', 'B', 200, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('KONARK', 'RESIDENCY ROAD', 'Phone:2240865', '', 'A', 1000, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('AMRUTH', 'ST.MARKS ROAD', 'Phone:2214988', '', 'B', 1000, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('HOT CHIPS', 'JAYANAGAR', '', '', 'B', 900, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('KOSHY S', 'RICHMOND ROAD,BLORE -560025', 'Phone:2213793', '', 'B', 650, 'P.O.Koshy');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('RELISH', 'NEW BEL ROAD', '', '', 'B', 400, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('KENTUCKY', 'RAJA RAM MOHAN ROAD', '', '', 'C', 700, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('OGWARRIOR', 'RAJAJAINAGAR', '', '', 'A', 900, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('V.B.BAKERY', 'V.V.PURAM', 'Phone:3321772', '', 'A', 950, '');
insert into bwiki_schema.FastFood(
name,  address,  
contact,  pincode,  rating,  
footfalls,  contactPerson) values ('SAGAR S', 'RAJAJINAGAR', 'Phone:3300771', '', 'A', 800, '');