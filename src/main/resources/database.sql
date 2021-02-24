CREATE TABLE user(
    userId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    userName varchar(255) NOT NULL,
    passwd varchar(255) NOT NULL
) ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE votelist(
    voteId int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    voteName varchar(255) NOT NULL,
    userId varchar(255) NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;
CREATE TABLE choicelist(
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    voteId int NOT NULL,
    choiceName varchar(255) NOT NULL,
    num int NOT NULL
)ENGINE=INNODB DEFAULT CHARSET=utf8;