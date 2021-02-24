CREATE TABLE user(
    userId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userName varchar(255) NOT NULL,
    passwd varchar(255) NOT NULL,
);
CREATE TABLE votelist(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    voteName varchar(255) NOT NULL,
    userId varchar(255) NOT NULL,
);
CREATE TABLE choicelist(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    choiceName varchar(255) NOT NULL,
    passwd varchar(255) NOT NULL,
);