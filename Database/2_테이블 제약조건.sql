#날짜 : 2023/06/16
#이름 : 박경진
#내용 : 2.테이블 제약 조건  실습

#실습 2-1
CREATE TABLE `User2` (
	`uid`		VARCHAR(10) PRIMARY KEY,
	`name`	VARCHAR(10),
	`hp`		CHAR(13),
	`age`		INT
);

#실습 2-2
INSERT INTO `User2` VALUE ('A101','박경진','010-9929-1111',29);
INSERT INTO `User2` VALUE ('A102','박정진','010-9928-1111',23);
INSERT INTO `User2` (`uid`,`name`,`age`) VALUE ('A103','박카스',5);
INSERT INTO `User2` (`uid`,`name`,`age`) VALUE ('A104','신이수',27);

#실습 2-3
CREATE TABLE `User3` (
	`uid`		VARCHAR(10) PRIMARY KEY,
	`name`	VARCHAR(10),
	`hp`		CHAR(13) UNIQUE,
	`age`		INT
);

#실습 2-4
INSERT INTO `User3` VALUE ('A101','박경진','010-9929-1111',29);
INSERT INTO `User3` VALUE ('A102','박정진','010-9928-1111',23);
INSERT INTO `User3` (`uid`,`name`,`age`) VALUE ('A103','박카스',5);
INSERT INTO `User3` VALUE ('A104','신이수','010-2016-1111',27);

#실습 2-5
CREATE TABLE `Parent` (
	`pid`		VARCHAR(10) PRIMARY KEY,
	`name`	VARCHAR(10),
	`hp`		CHAR(13) UNIQUE
);

CREATE TABLE `Child` (
	`cid`		VARCHAR(10) PRIMARY KEY,
	`name`	VARCHAR(10),
	`hp`		CHAR(13) UNIQUE,
	`pid`		VARCHAR(10),
	FOREIGN KEY (`pid`) REFERENCES `Parent` (`pid`)
);

#실습 2-6
INSERT INTO `Parent` (`pid`,`name`) VALUE ('P101','박춘수');
INSERT INTO `Parent` VALUE ('P102','전호정','010-5676-1111');

INSERT INTO `Child` VALUE ('C101','박경진','010-9929-1111','P101');
INSERT INTO `Child` VALUE ('C102','박정진','010-9928-1111','P102');
INSERT INTO `Child` (`cid`,`name`,) VALUE ('C103','박카스',5);

#실습 2-7
CREATE TABLE `User4`(
	`seq`		INT AUTO_INCREMENT PRIMARY KEY,
	`name`	VARCHAR(10),
	`gender`	TINYINT,
	`age`		INT,
	`addr`	VARCHAR(255)
);

#실습 2-8
INSERT INTO `User4` VALUE (1,'박경진',0,29,'부산시 기장군');
INSERT INTO `User4` (`name`,`gender`,`age`,`addr`) VALUE ('박정진',0,23,'경북 하양');
INSERT INTO `User4` (`name`,`gender`,`age`,`addr`) VALUE('박카스',0,5,'부산시 기장군');
INSERT INTO `User4` (`name`,`gender`,`age`,`addr`) VALUE('신이수',1,27,'울산시 울주군');

#실습 2-9
CREATE TABLE `User5`(
	`name`	VARCHAR(10) NOT NULL,
	`gender`	TINYINT,
	`age`		INT DEFAULT 1,
	`addr`	VARCHAR(10)
);

#실습 2-10
INSERT INTO `User5` VALUE ('박경진',0,29,'부산시 기장군');
INSERT INTO `User5` VALUE ('박정진',0,29,'부산시 기장군');
INSERT INTO `User5` (`name`,`gender`,`addr`) VALUE ('박카스',0,'부산시 기장군');
INSERT INTO `User5` VALUE ('신이수',1,29,'부산시 기장군');


#실습 2-11
ALTER TABLE `User5` ADD `hp` VARCHAR(20);
ALTER TABLE `User5` ADD `birth` CHAR(10) DEFAULT '0000-00-00' AFTER `name`;

#실습 2-12
ALTER TABLE `User5` MODIFY `hp` CHAR(13);
ALTER TABLE `User5` MODIFY `age` TINYINT;

#실습 2-13
ALTER TABLE `User5` CHANGE COLUMN `addr` `address` VARCHAR(100);

#실습 2-14
ALTER TABLE `User5` DROP `gender`;

#실습 2-15
CREATE TABLE `User6` LIKE `User5`;

#실습 2-16
INSERT INTO `User6` SELECT * FROM `User5`;

