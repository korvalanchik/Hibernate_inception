-- ----------------------------
-- Table structure for client
-- ----------------------------
DROP TABLE IF EXISTS client;
CREATE TABLE client (
                        id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
                        name varchar(200) NOT NULL
);

-- ----------------------------
-- Records of client
-- ----------------------------
INSERT INTO client VALUES (1, 'Kolya');
INSERT INTO client VALUES (2, 'Sirozha');
INSERT INTO client VALUES (3, 'Vasya');
INSERT INTO client VALUES (4, 'Kolya S.');
INSERT INTO client VALUES (5, 'Sirozha');
INSERT INTO client VALUES (6, 'Vasya P.');
INSERT INTO client VALUES (7, 'Dima');
INSERT INTO client VALUES (8, 'Grisha');
INSERT INTO client VALUES (9, 'Natasha');
INSERT INTO client VALUES (10, 'Kiryusha');
INSERT INTO client VALUES (11, 'Tanya');

-- ----------------------------
-- Table structure for planet
-- ----------------------------
DROP TABLE IF EXISTS planet;
CREATE TABLE planet (id varchar(255) PRIMARY KEY NOT NULL, name varchar(500) NULL DEFAULT NULL);

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


-- ----------------------------
-- Table structure for ticket
-- ----------------------------
DROP TABLE IF EXISTS ticket;
CREATE TABLE ticket  (
                           id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
                           created_at timestamp NULL DEFAULT NULL,
                           client_id int NOT NULL,
                           from_planet_id varchar(255) NULL DEFAULT NULL,
                           to_planet_id varchar(255) NULL DEFAULT NULL,
--                            INDEX `ticket_cl_1`(`client_id`) USING BTREE,
--                            INDEX `ticket_pl_1`(`from_planet_id`) USING BTREE,
--                            INDEX `ticket_pl_2`(`to_planet_id`) USING BTREE,
                           CONSTRAINT ticket_cl_1 FOREIGN KEY (client_id) REFERENCES client (id) ON DELETE CASCADE ON UPDATE CASCADE,
                           CONSTRAINT ticket_pl_1 FOREIGN KEY (from_planet_id) REFERENCES planet (id) ON DELETE CASCADE ON UPDATE CASCADE,
                           CONSTRAINT ticket_pl_2 FOREIGN KEY (to_planet_id) REFERENCES planet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

-- ----------------------------
-- Records of ticket
-- ----------------------------
INSERT INTO ticket VALUES (1, '2024-02-10 20:31:24', 4, 'MARS', 'MARS');
INSERT INTO ticket VALUES (2, '2024-02-07 20:33:14', 6, 'PLUTON', 'EARTH');
INSERT INTO ticket VALUES (3, '2024-02-13 20:51:23', 8, 'SATURN', 'URAN');
INSERT INTO ticket VALUES (6, '2024-02-08 20:55:32', 3, 'URAN', 'SATURN');
INSERT INTO ticket VALUES (8, '2024-02-05 20:57:59', 10, 'EARTH', 'URAN');
INSERT INTO ticket VALUES (9, '2021-09-16 07:06:10', 1, 'URAN', 'URAN');
INSERT INTO ticket VALUES (10, '2011-06-28 19:33:27', 8, 'MERQURY', 'MERQURY');
INSERT INTO ticket VALUES (11, '2020-11-17 14:08:02', 1, 'MARS', 'MARS');
INSERT INTO ticket VALUES (12, '2017-11-09 15:03:16', 5, 'EARTH', 'EARTH');
INSERT INTO ticket VALUES (13, '2001-10-02 11:41:51', 9, 'MERQURY', 'MERQURY');
INSERT INTO ticket VALUES (14, '2018-05-11 21:58:35', 4, 'SATURN', 'SATURN');
INSERT INTO ticket VALUES (15, '2021-02-12 15:50:45', 8, 'EARTH', 'EARTH');
INSERT INTO ticket VALUES (16, '2012-04-04 21:54:57', 3, 'SATURN', 'SATURN');
INSERT INTO ticket VALUES (17, '2015-07-29 01:39:48', 11, 'SUN', 'SUN');
INSERT INTO ticket VALUES (18, '2021-06-26 17:19:42', 9, 'MARS', 'MARS');
INSERT INTO ticket VALUES (19, '2020-01-13 15:24:04', 2, 'MERQURY', 'MERQURY');
INSERT INTO ticket VALUES (20, '2017-05-01 18:31:24', 10, 'VIENUS', 'VIENUS');
INSERT INTO ticket VALUES (21, '2012-04-10 00:48:22', 6, 'URAN', 'MARS');
INSERT INTO ticket VALUES (22, '2024-01-27 02:05:09', 8, 'SATURN', 'EARTH');
INSERT INTO ticket VALUES (23, '2006-05-27 13:53:04', 9, 'MARS', 'URAN');
INSERT INTO ticket VALUES (24, '2002-02-11 05:36:34', 2, 'SUN', 'SATURN');
INSERT INTO ticket VALUES (25, '2008-02-02 01:47:53', 3, 'PLUTON', 'URAN');
INSERT INTO ticket VALUES (26, '2009-09-29 00:10:34', 1, 'EARTH', 'URAN');
INSERT INTO ticket VALUES (27, '2013-07-30 04:07:45', 8, 'PLUTON', 'MERQURY');
INSERT INTO ticket VALUES (28, '2008-10-26 08:23:09', 8, 'URAN', 'MARS');
INSERT INTO ticket VALUES (29, '2011-06-07 19:24:02', 11, 'MARS', 'EARTH');
INSERT INTO ticket VALUES (30, '2010-10-08 05:58:25', 5, 'EARTH', 'MERQURY');
INSERT INTO ticket VALUES (31, '2005-04-24 11:08:27', 5, 'MERQURY', 'SATURN');
INSERT INTO ticket VALUES (32, '2008-11-18 03:33:44', 7, 'PLUTON', 'EARTH');
INSERT INTO ticket VALUES (33, '2011-06-30 10:12:48', 6, 'VIENUS', 'SATURN');
INSERT INTO ticket VALUES (34, '2016-09-20 19:51:24', 3, 'MERQURY', 'SUN');
INSERT INTO ticket VALUES (35, '2001-11-05 10:53:40', 3, 'SATURN', 'MARS');
INSERT INTO ticket VALUES (36, '2009-05-03 18:19:29', 6, 'MARS', 'MERQURY');
INSERT INTO ticket VALUES (37, '2004-02-14 02:43:54', 9, 'MARS', 'MARS');
INSERT INTO ticket VALUES (38, '2005-06-13 01:02:15', 4, 'VIENUS', 'EARTH');
INSERT INTO ticket VALUES (39, '2019-10-11 22:24:01', 4, 'SATURN', 'URAN');
INSERT INTO ticket VALUES (40, '2010-09-13 03:28:29', 7, 'PLUTON', 'SATURN');
INSERT INTO ticket VALUES (41, '2015-09-05 14:02:25', 3, 'URAN', 'URAN');
INSERT INTO ticket VALUES (42, '2003-01-25 08:23:38', 1, 'SATURN', 'URAN');
INSERT INTO ticket VALUES (43, '2018-04-13 19:26:31', 3, 'EARTH', 'MERQURY');
INSERT INTO ticket VALUES (44, '2010-02-07 08:54:47', 3, 'PLUTON', 'MARS');
INSERT INTO ticket VALUES (45, '2022-04-25 15:22:20', 2, 'PLUTON', 'EARTH');
INSERT INTO ticket VALUES (46, '2007-12-19 19:29:40', 2, 'EARTH', 'MERQURY');
INSERT INTO ticket VALUES (47, '2013-06-02 00:23:46', 7, 'VIENUS', 'SATURN');
INSERT INTO ticket VALUES (48, '2008-07-15 16:09:07', 11, 'MARS', 'EARTH');
INSERT INTO ticket VALUES (49, '2019-02-03 18:48:51', 9, 'SATURN', 'SATURN');
INSERT INTO ticket VALUES (50, '2004-08-08 00:32:25', 1, 'MARS', 'SUN');
INSERT INTO ticket VALUES (51, '2023-02-12 16:55:09', 7, 'MERQURY', 'MARS');
INSERT INTO ticket VALUES (52, '2015-07-22 09:41:50', 7, 'PLUTON', 'MERQURY');
INSERT INTO ticket VALUES (53, '2011-08-19 06:00:57', 6, 'SATURN', 'VIENUS');
INSERT INTO ticket VALUES (54, '2012-10-28 15:48:28', 4, 'URAN', 'URAN');
INSERT INTO ticket VALUES (55, '2003-06-05 18:18:35', 9, 'MARS', 'MARS');
INSERT INTO ticket VALUES (56, '2000-03-09 22:03:51', 2, 'PLUTON', 'PLUTON');
INSERT INTO ticket VALUES (57, '2019-09-30 00:01:15', 2, 'EARTH', 'EARTH');
INSERT INTO ticket VALUES (58, '2001-04-13 21:59:22', 2, 'MARS', 'MARS');
INSERT INTO ticket VALUES (59, '2012-12-15 14:02:50', 4, 'URAN', 'URAN');
INSERT INTO ticket VALUES (60, '2007-11-02 19:21:17', 11, 'EARTH', 'EARTH');
INSERT INTO ticket VALUES (61, '2020-01-09 16:50:58', 4, 'MERQURY', 'MERQURY');
INSERT INTO ticket VALUES (62, '2003-05-16 02:28:47', 8, 'MERQURY', 'MERQURY');
INSERT INTO ticket VALUES (64, '2010-02-07 08:54:47', 3, 'PLUTON', 'MERQURY');
INSERT INTO ticket VALUES (65, '2022-04-25 15:22:20', 2, 'PLUTON', 'MARS');
INSERT INTO ticket VALUES (66, '2007-12-19 19:29:40', 2, 'EARTH', 'EARTH');
INSERT INTO ticket VALUES (67, '2013-06-02 00:23:46', 7, 'VIENUS', 'MERQURY');
INSERT INTO ticket VALUES (68, '2008-07-15 16:09:07', 11, 'MARS', 'SATURN');
INSERT INTO ticket VALUES (69, '2019-02-03 18:48:51', 9, 'SATURN', 'EARTH');
INSERT INTO ticket VALUES (70, '2004-08-08 00:32:25', 1, 'MARS', 'SATURN');
INSERT INTO ticket VALUES (71, '2023-02-12 16:55:09', 7, 'MERQURY', 'SUN');
INSERT INTO ticket VALUES (72, '2015-07-22 09:41:50', 7, 'PLUTON', 'MARS');
INSERT INTO ticket VALUES (73, '2011-08-19 06:00:57', 6, 'SATURN', 'MERQURY');
INSERT INTO ticket VALUES (74, '2012-10-28 15:48:28', 4, 'URAN', 'VIENUS');
INSERT INTO ticket VALUES (75, '2003-06-05 18:18:35', 9, 'MARS', 'URAN');
INSERT INTO ticket VALUES (76, '2000-03-09 22:03:51', 2, 'PLUTON', 'MARS');
INSERT INTO ticket VALUES (77, '2019-09-30 00:01:15', 2, 'EARTH', 'PLUTON');
INSERT INTO ticket VALUES (78, '2001-04-13 21:59:22', 2, 'MARS', 'EARTH');
INSERT INTO ticket VALUES (79, '2012-12-15 14:02:50', 4, 'URAN', 'MARS');
INSERT INTO ticket VALUES (80, '2007-11-02 19:21:17', 11, 'EARTH', 'URAN');
INSERT INTO ticket VALUES (81, '2020-01-09 16:50:58', 4, 'MERQURY', 'EARTH');
INSERT INTO ticket VALUES (82, '2003-05-16 02:28:47', 8, 'MERQURY', 'MERQURY');



-- ----------------------------
-- Table structure for ticket
-- ----------------------------
-- CREATE TABLE ticket  (
--     id int NOT NULL,
--     created_at timestamp NULL DEFAULT NULL,
--     client_id int NOT NULL,
--     from_planet_id varchar(255) NULL DEFAULT NULL,
--     to_planet_id varchar(255) NULL DEFAULT NULL,
--     PRIMARY KEY (id),
--     CONSTRAINT ticket_ibfk_1 FOREIGN KEY (client_id) REFERENCES client (id) ON DELETE CASCADE ON UPDATE CASCADE
-- );
-- CREATE INDEX client_id ON ticket(client_id);

-- ----------------------------
-- Records of ticket
-- ----------------------------



