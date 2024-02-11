-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO client (name) VALUES ('Kolya');
INSERT INTO client (name) VALUES ('Sirozha');
INSERT INTO client (name) VALUES ('Vasya');
INSERT INTO client (name) VALUES ('Kolya S.');
INSERT INTO client (name) VALUES ('Sirozha');
INSERT INTO client (name) VALUES ('Vasya P.');
INSERT INTO client (name) VALUES ('Dima');
INSERT INTO client (name) VALUES ('Grisha');
INSERT INTO client (name) VALUES ('Natasha');
INSERT INTO client (name) VALUES ('Kiryusha');
INSERT INTO client (name) VALUES ('Tanya');

-- ----------------------------
-- Records of planet
-- ----------------------------
INSERT INTO planet VALUES ('EARTH', 'Earth');
INSERT INTO planet VALUES ('MARS', 'Mars');
INSERT INTO planet VALUES ('MERQURY', 'Merqury');
INSERT INTO planet VALUES ('PLUTON', 'Pluton');
INSERT INTO planet VALUES ('SATURN', 'Saturn');
INSERT INTO planet VALUES ('SUN', 'Sun');
INSERT INTO planet VALUES ('URAN', 'Uran');
INSERT INTO planet VALUES ('VIENUS', 'Vienus');
INSERT INTO planet VALUES ('JUPITER', 'Jupiter');
INSERT INTO planet VALUES ('MOON', 'Moon');
INSERT INTO planet VALUES ('NEPTUN', 'Neptun');

-- ----------------------------
-- Records of ticket
-- ----------------------------
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2024-02-10 20:31:24', 4, 'MARS', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2024-02-07 20:33:14', 6, 'PLUTON', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2024-02-13 20:51:23', 8, 'SATURN', 'URAN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2024-02-08 20:55:32', 3, 'URAN', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2024-02-05 20:57:59', 10, 'EARTH', 'URAN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2021-09-16 07:06:10', 1, 'URAN', 'URAN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2011-06-28 19:33:27', 8, 'MERQURY', 'MERQURY');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2020-11-17 14:08:02', 1, 'MARS', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2017-11-09 15:03:16', 5, 'EARTH', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2001-10-02 11:41:51', 9, 'MERQURY', 'MERQURY');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2018-05-11 21:58:35', 4, 'MOON', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2021-02-12 15:50:45', 8, 'EARTH', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2012-04-04 21:54:57', 3, 'SATURN', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2015-07-29 01:39:48', 11, 'SUN', 'SUN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2021-06-26 17:19:42', 9, 'MARS', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2020-01-13 15:24:04', 2, 'MOON', 'MERQURY');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2017-05-01 18:31:24', 10, 'NEPTUN', 'VIENUS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2012-04-10 00:48:22', 6, 'URAN', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2024-01-27 02:05:09', 8, 'SATURN', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2006-05-27 13:53:04', 9, 'MARS', 'URAN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2002-02-11 05:36:34', 2, 'SUN', 'SATURN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2008-02-02 01:47:53', 3, 'PLUTON', 'URAN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2009-09-29 00:10:34', 1, 'EARTH', 'URAN');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2013-07-30 04:07:45', 8, 'PLUTON', 'MERQURY');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2008-10-26 08:23:09', 8, 'URAN', 'MARS');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2011-06-07 19:24:02', 11, 'MARS', 'EARTH');
INSERT INTO ticket (created_at, client_id, from_planet_id, to_planet_id) VALUES ('2010-10-08 05:58:25', 5, 'EARTH', 'MERQURY');


