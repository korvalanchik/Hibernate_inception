CREATE TABLE client(ID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
                    NAME varchar(200) NOT NULL,
                    CONSTRAINT CHK_client CHECK (CHAR_LENGTH(NAME)>=3))

