#교재실습

#2023 06 20
CREATE DATABASE market_db;

CREATE TABLE `member`(
	`mem_id`			CHAR(8) NOT NULL PRIMARY KEY,
	`mem_name`		VARCHAR(10) NOT NULL,
	`mem_number`	INT NOT NULL,
	`addr`			CHAR(2) NOT NULL,
	`phone1`			CHAR(3),
	`phone2`			CHAR(8),
	`height`			SMALLINT,
	`debut_date`	DATE
);

CREATE TABLE `buy`(
	`num`				INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
	`mem_id`			CHAR(8) NOT NULL,
	`prod_name`		CHAR(6) NOT NULL,
	`group_name`	CHAR(4),
	`price`			INT NOT NULL,
	`amount`			SMALLINT NOT NULL,
	FOREIGN KEY (mem_id) REFERENCES `member`(mem_id)
);

INSERT INTO `member` VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO `buy` VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);