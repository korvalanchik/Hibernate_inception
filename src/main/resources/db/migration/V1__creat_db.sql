DROP TABLE IF EXISTS planet;
DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS client;

-- ----------------------------
-- Table structure for client
-- ----------------------------
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
CREATE TABLE planet  (
    id varchar(255) NOT NULL,
    name varchar(500) NULL DEFAULT NULL,
    PRIMARY KEY (id)
);
-- ----------------------------
-- Records of planet
-- ----------------------------


-- ----------------------------
-- Table structure for ticket
-- ----------------------------
CREATE TABLE ticket  (
    id int NOT NULL,
    created_at timestamp NULL DEFAULT NULL,
    client_id int NOT NULL,
    from_planet_id varchar(255) NULL DEFAULT NULL,
    to_planet_id varchar(255) NULL DEFAULT NULL,
    PRIMARY KEY (id),
    CONSTRAINT ticket_ibfk_1 FOREIGN KEY (client_id) REFERENCES client (id) ON DELETE CASCADE ON UPDATE CASCADE
);
CREATE INDEX client_id ON ticket(client_id);

-- ----------------------------
-- Records of ticket
-- ----------------------------



