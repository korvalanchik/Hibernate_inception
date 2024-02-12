DROP TABLE IF EXISTS ticket;
DROP TABLE IF EXISTS planet;
DROP TABLE IF EXISTS client;
-- ----------------------------
-- Table structure for client
-- ----------------------------
CREATE TABLE client (
                        id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
                        name varchar(200) NOT NULL
);

-- ----------------------------
-- Table structure for planet
-- ----------------------------
CREATE TABLE planet (
                        id VARCHAR(255) PRIMARY KEY NOT NULL,
                        CONSTRAINT id_num_and_upper_only CHECK (id REGEXP '^[A-Z0-9]+$'),
                        name varchar(500) NOT NULL
);

-- ----------------------------
-- Table structure for ticket
-- ----------------------------
CREATE TABLE ticket  (
                           id int PRIMARY KEY AUTO_INCREMENT NOT NULL ,
                           created_at timestamp NULL DEFAULT NULL,
                           client_id int NULL NOT NULL,
                           from_planet_id varchar(255) NULL DEFAULT NULL,
                           to_planet_id varchar(255) NULL DEFAULT NULL,
                           CONSTRAINT ticket_cl_1 FOREIGN KEY (client_id) REFERENCES client (id) ON DELETE CASCADE ON UPDATE CASCADE,
                           CONSTRAINT ticket_pl_1 FOREIGN KEY (from_planet_id) REFERENCES planet (id) ON DELETE CASCADE ON UPDATE CASCADE,
                           CONSTRAINT ticket_pl_2 FOREIGN KEY (to_planet_id) REFERENCES planet (id) ON DELETE CASCADE ON UPDATE CASCADE
);

