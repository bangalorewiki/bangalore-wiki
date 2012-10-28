drop table bwiki_schema.Pub;

CREATE TABLE bwiki_schema.Pub
(no int(10) unsigned NOT NULL AUTO_INCREMENT, 
name varchar(30),
address varchar(100),
contact varchar(20),
capacity int(10),
rating varchar(1),
PRIMARY KEY (no));
 
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('4 Foods', '384 1/5 13th Crs S S Ngr-560080. Phone: 080-3312544 ', '', 100, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Airport Restaurant', 'Airport Rd-560017. Phone: 080-5221140 ', 'MR HARI RAO', 300, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Ashwini Bar & Pub', '47 J C Rd-560002. Phone: 080-6700686 ', 'RAGHAVENDRA', 100, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Ballerina Bar & Restaurant', '#44/3 Chandra Cmplx 3rd Flr Rchd Rd-560025. Phone: 080-5585854 ', 'MR REDDY', 100, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Dolphins Restaurant & Pub', '131/2 Wheeler Rd Coxtown-560005. Phone: 080-5914880 ', 'MR ANANDA SHETTY', 150, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Down Town Pub', '41 42 5th Flr Residency Plaza R Rd-560025. Phone: 080-5581193 ', ' MR JAY PRAKASH', 300, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Geoffrey s', '1 Golf Avenue Airport Rd-560008. Phone: 080-5205566 ', 'MR AMIT SABERWALA', 150, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Guzzlers Inn Pub', '48 Rest House Rd-560001. Phone: 080-5582138 ', 'MR BHAVAR SINGH', 300, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Irish Pub', '143/144 1st Mn Sd Prm-560020. Phone: 080-3449263 ', 'MR MAHESH', 150, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Kartik Pub & Bar Restraunt', '87-88 1st Crs 5th Mn Boranna Cplx G Ngr-560009. Phone: 080-2258900 ', 'MR S NARAYAN', 100, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('NASA Blr Hitech Beer Club', '1/A Church St-560001. Phone: 080-5584595 ', 'ASHOK SADHWANI', 200, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Purple Haze & Zapp, ', '17/1 Residency Rd-560025. Phone: 080-2220054 ', 'MR RAGHU/MONICA', 250, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('S & P Enterprises', '1 Ahuja Chambers Kumara Krupa Rd-560001. Phone: 080-2286256 ', 'SUNIL DESHPANDE',-1 , 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Styx Pub', '45 MG Rd-560001. Phone: 080-5582259 ', 'MR YOGESH', 250, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The New Night Watchman Pub', '46/1 Church St Museum Rd-560001. Phone: 080-5588372 ', 'MR SURESH MALLOTRA', 300, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Under Ground Pub', '65 Bluemoon Cplx M G Rd-560001. Phone: 080-5589991 ', 'MR MAHATHANI', 200, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Pub world', '65/laxmi plaza ,Residency Road,Blore-560025,ph#5585206', 'ASHOK SADHWANI', 300, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The 13th Floor', 'Barton centre,M.g.road', '', 200, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('I - Bar', 'The park,m.g.road', '', 200, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('180 - proof', 'St.Marks Road', 'JAY & ROSHNI', 300, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hypnos', 'Infantry Road', '', 150, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Library Bar', 'Leela Palace,Airport road', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Pecos', 'brigade road', '', 300, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Egypt', 'indiranagar', '',-1 , 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Dublin', 'Windsor Manor', '', 60, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Opium', 'AIRPORT ROAD', '', 200, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Windsor Pub', 'CUNNINGHAM ROAD', '', -1, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Tavern', 'CHURCH STREET', '', 150, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Bunkers', 'RESIDENCY ROAD', '', 200, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Sparks', 'RICHMOND ROAD', '', 200, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Urban Edge', 'RICHMOND ROAD', '', 250, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('CUPS N MUGS', 'Infantry Road', 'DESMOND RICE', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Ego s', 'RICHMOND ROAD', '', 150, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Cyber Pub', '2, Mohan Towers, Residency Road', '', 100, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Cyber Pub', 'Bangalore - 560 025.', '', 100, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Sherlock Holmes', '60/1, Coles Road, Fraser Town', '', 150, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Sherlock Holmes', 'Bangalore - 560 005', '', 150, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Tasti Bite', '89/2, Dickenson Road', '', 100, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Tasti Bite', 'Bangalore - 560 042', '', 100, 'B');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Phoenix - An Egyptian Bar', 'St. Mark s Hotel', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Phoenix - An Egyptian Bar', 'St. Mark s Road', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Phoenix - An Egyptian Bar', 'Bangalore - 560 001', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Phoenix - An Egyptian Bar', 'Ph: 2279090', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Take 5', 'Ahuja Chambers', '', 50, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Take 5', 'Kumarakrupa', '', 50, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Take 5', 'Bangalore - 560 001', '', 50, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hi-Spirits', '44, Brigade Road,', '', 100, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hi-Spirits', 'Bangalore - 560 001', '', 100, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hi-Spirits', 'Ph: 5583943', '', 100, 'C');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Coconut Grove Bar', 'The Taj West End, Race Course Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Coconut Grove Bar', 'Bangalore - 560001.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Coconut Grove Bar', 'Phone : +91-80-2259281, 2255055.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hibiscus', '', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hibiscus', 'Hotel Ashok, Kumarakrupa Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hibiscus', 'Bangalore - 560001.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Hibiscus', 'Phone : +91-80-2269462.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jazz Club', '', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jazz Club', 'The Central Park, 47, Dickenson Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jazz Club', 'Bangalore - 560042.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jazz Club', 'Phone : +91-80-5584242.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jockey Club', '', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jockey Club', 'Taj Residency, 144, M.G Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jockey Club', 'Bangalore - 560001.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Jockey Club', 'Phone : +91-80-5584444.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Lobby Lounge', '', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Lobby Lounge', 'Gateway Hotel, Residency Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Lobby Lounge', 'Bangalore - 560025.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Lobby Lounge', 'Phone +91-80-5584545.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Polo Club', 'The Oberoi Hotel, 37-39, M.G Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Polo Club', 'Bangalore - 560001.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Polo Club', 'Phone : +91-80-5585858.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Sundowner', 'Le Meridian, Sankey Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Sundowner', 'Bangalore - 560052.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('Sundowner', 'Phone : +91-80-2262233.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Colonnade Bar', 'The Taj West End, Race Course Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Colonnade Bar', 'Bangalore - 560001.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Colonnade Bar', 'Phone : +91-80-2255055.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Crazy Horse Bar', 'The Taj West End, Race Course Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Crazy Horse Bar', 'Bangalore - 560001.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Crazy Horse Bar', 'Phone : +91-80-2259281, 2255055.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Royal Derby', 'Windsor Manor, Sankey Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Royal Derby', 'Bangalore - 560052.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Royal Derby', 'Phone : +91-80-2269898.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Upper House', 'The Capitol, Raj Bhavan Road,', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Upper House', 'Bangalore - 560001.', '', 50, 'A');
insert into bwiki_schema.Pub (name, address, contact, capacity, rating) values ('The Upper House', 'Phone : +91-80-2281234, 2281515.', '', 50, 'A');
