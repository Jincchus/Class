#날자 : 2023/06/23
#이름 : 박경진
#내용 : SQL 연습문제4

#실습4-1
CREATE DATABASE `BookStore`;
CREATE USER 'admin4'@'%' IDENTIFIED BY '1234';
GRANT ALL PRIVILEGES ON `BookStore`.* TO 'admin4'@'%';
FLUSH PRIVILEGES

#실습4-2
CREATE TABLE `Customer`(
	`custId`		INT PRIMARY KEY AUTO_INCREMENT,
	`name`		VARCHAR(10) NOT NULL,
	`address`	VARCHAR(20) NULL,
	`phone`		VARCHAR(13) NULL
);

CREATE TABLE `Book`(
	`bookId`		INT PRIMARY KEY NOT NULL,
	`bookName`	VARCHAR(20) NOT NULL,
	`publisher`	VARCHAR(20) NOT NULL,
	`price`		INT NULL
);

CREATE TABLE `Order`(
	`orderId`	INT PRIMARY KEY AUTO_INCREMENT,
	`custId`		INT NOT NULL,
	`bookId`		INT NOT NULL,
	`salePrice`	INT NOT NULL,
	`orderDate`	DATE NOT NULL
	
);

#실습4-3
INSERT INTO `Customer` VALUE (NULL,'박지성', '영국 맨체스터'  , '000-5000-0001');
INSERT INTO `Customer` VALUE (NULL,'김연아', '대한민국 서울'  , '000-6000-0001');
INSERT INTO `Customer` VALUE (NULL,'장미란', '대한민국 강원도', '000-7000-0001');
INSERT INTO `Customer` VALUE (NULL,'추신수', '미국 클리블랜드', '000-8000-0001');
INSERT INTO `Customer` VALUE (NULL,'박세리', '대한민국 대전'  , NULL );

INSERT INTO `Book` VALUE (1, '축구의 역사',   '굿스포츠',   7000);
INSERT INTO `Book` VALUE (2, '축구아는 여자', '나무수',     13000);
INSERT INTO `Book` VALUE (3, '축구의 이해',   '대한미디어', 22000);
INSERT INTO `Book` VALUE (4, '골프 바이블',   '대한미디어', 35000);
INSERT INTO `Book` VALUE (5, '피겨 교본',     '굿스포츠',   8000);

INSERT INTO `Book` VALUE (6, '역도 단계별 기술', '굿스포츠',   6000);
INSERT INTO `Book` VALUE (7, '야구의 추억',      '이상미디어', 20000);
INSERT INTO `Book` VALUE (8, '야구를 부탁해',    '이상미디어', 13000);
INSERT INTO `Book` VALUE (9, '올림픽 이야기',    '삼성당',     7500);
INSERT INTO `Book` VALUE (10,'Olympic Champions','Pearson',    13000);

INSERT INTO `Order` VALUE (NULL, 1, 1,  6000,  '2014-07-01');
INSERT INTO `Order` VALUE (NULL, 1, 3,  21000, '2014-07-03');
INSERT INTO `Order` VALUE (NULL, 2, 5,  8000,  '2014-07-03');
INSERT INTO `Order` VALUE (NULL, 3, 6,  6000,  '2014-07-04');
INSERT INTO `Order` VALUE (NULL, 4, 7,  20000, '2014-07-05');

INSERT INTO `Order` VALUE (NULL, 1, 2,  12000, '2014-07-07');
INSERT INTO `Order` VALUE (NULL, 4, 8,  13000, '2014-07-07');
INSERT INTO `Order` VALUE (NULL, 3, 10, 12000, '2014-07-08');
INSERT INTO `Order` VALUE (NULL, 2, 10, 7000,  '2014-07-09');
INSERT INTO `Order` VALUE (NULL, 3, 8,  13000, '2014-07-10');

#실습4-4
SELECT `custid`, `name`, `address` FROM `customer`;

#실습4-5
SELECT `bookname`, `price` FROM `BOOK`;

#실습4-6
SELECT `price`, `bookname` FROM `BOOK`;

#실습4-7
SELECT * FROM `book`;

#실습4-8
SELECT `publisher` FROM `book`;

#실습4-9
SELECT DISTINCT `publisher` FROM `book`;
SELECT  `publisher` FROM `book` GROUP BY `publisher`;

#실습4-10
SELECT * FROM `book` WHERE price >= 20000;

#실습4-11
SELECT * FROM `book` WHERE price < 20000 ;

#실습4-12
SELECT * FROM `book` WHERE price >= 10000 AND price <= 20000 ;
SELECT * FROM `book` WHERE `price` BETWEEN 10000 AND 20000;

#실습4-13
SELECT `bookid`, `bookname`, `price` FROM `book`
WHERE price >= 15000 AND price <= 30000;

#실습4-14
SELECT * FROM `book` WHERE `bookid` = 2 OR `bookid` = 3 OR `bookid` = 5;
SELECT * FROM `book` WHERE `bookid` IN(2, 3, 5);

#실습4-15
SELECT * FROM `book` WHERE `bookid` % 2 = 0 ;
SELECT * FROM `book` WHERE MOD(bookId, 2) = 0;

#실습4-16
SELECT * FROM `customer` WHERE `name` LIKE '박%';

#실습4-17
SELECT * FROM `customer` WHERE `address` LIKE '대한민국 %';

#실습4-18
SELECT * FROM `customer` WHERE `phone` is NOT NULL;

#실습4-19
SELECT * FROM `book` WHERE `publisher` = '굿스포츠' OR `publisher`= '대한미디어';
SELECT * FROM `Book` WHERE `publisher` IN('굿스포츠', '대한미디어');

#실습4-20
SELECT DISTINCT `publisher` FROM `book` WHERE `bookName` = '축구의 역사';

#실습4-21
SELECT `publisher` FROM `book` WHERE `bookname` LIKE '%축구%';

#실습4-22
SELECT * FROM `book` WHERE `bookname` LIKE '_구%';

#실습4-23
SELECT * FROM `book` WHERE `price` >=20000 AND `bookname` LIKE '%축구%';

#실습4-24
SELECT * FROM `book` order BY `bookname` ASC;

#실습4-25
SELECT * FROM `book` order BY `price` ,`bookname`;

#실습4-26
SELECT * FROM `book` order BY `price` DESC , `publisher` asc;

#실습4-27
SELECT* FROM `book` order BY `price` DESC LIMIT 3;

#실습4-28
SELECT * FROM `book` order BY `price` asc LIMIT 3;

#실습4-29
SELECT SUM(`salePrice`) AS `총판매액` FROM `order` ;

#실습4-30
SELECT 
	SUM(`salePrice`) AS `총판매액`,
	AVG(`salePrice`) AS `평균값`,
	MIN(`salePrice`) AS `최저가`,
	MAX(`salePrice`) AS `최고가`
FROM `order`;

#실습4-31
SELECT COUNT(*) AS `판매건수` FROM `Order`;
SELECT COUNT(`orderId`) AS `판매건수` FROM `order`


#실습4-32
UPDATE `book` 
SET `bookname` = REPLACE(`bookname`, '야구', '농구')
WHERE `bookname` LIKE '%야구%' ;

SELECT
	`bookId`,
	REPLACE(`bookName`, '농구', '야구') AS `bookName`,
	`publisher`,
	`price`
FROM `book`;

#실습4-33***
SELECT `custid` ,	COUNT(`bookid`) AS '수량'
FROM `order`
WHERE `saleprice` >=8000
GROUP BY `custid` HAVING COUNT(`orderid`) >=2;

SELECT
	`custId`,
	COUNT(*) AS '수량'
FROM `Order`
WHERE `saleprice` >= 8000
GROUP BY `custId`
HAVING `수량` >= 2;

#실습4-34
SELECT * FROM `customer` AS a
JOIN `order` AS b ON a.custId = b.custId;

SELECT * FROM `customer` JOIN `order` AS b USING(`custId`);

SELECT * FROM `Customer` a, `Order` b WHERE a.custID = b.custId;

#실습4-35
SELECT * FROM `customer` AS a
JOIN `order` AS b ON a.custid = b.custid
order BY a.`custid` ASC;


#실습4-36
SELECT a.`name`,b.`saleprice`
FROM `customer` AS a
JOIN `order` AS b ON a.custid = b.custid
order BY a.`custid` asc;

#실습4-37
SELECT a.`name`, SUM(b.`saleprice`)
FROM `customer` AS a
JOIN `order` AS b ON a.custid = b.custid
GROUP BY a.`custid`
order BY a.`name` asc;

#실습4-38
SELECT a.`name`, c.`bookname`
FROM `customer` AS a
JOIN `order` AS b ON a.custid = b.custid
JOIN `book` AS c ON b.bookid = c.bookid
order BY a.custid asc;

#실습4-39
SELECT a.`name`, c.`bookname`
FROM `customer` AS a
JOIN `order` AS b ON a.custid = b.custid
JOIN `book` AS c ON b.bookid = c.bookid
WHERE c.`price` = 20000;

#실습4-40
SELECT a.`name`, b.`saleprice`
FROM `customer` AS a
LEFT JOIN `order` AS b ON a.custid = b.custid ;

#실습4-41
SELECT SUM(b.saleprice) AS '총매출'
FROM `customer` AS a
JOIN `order` AS b ON a.custid = b.custid
WHERE a.`name` = '김연아';

SELECT 
	SUM(`salePrice`) AS `총매출` 
FROM `Order` 
WHERE `custId` = (SELECT `custId` FROM `Customer` WHERE `name` = '김연아');

#실습4-42
SELECT `bookname` FROM `book`
WHERE `price` = (SELECT MAX(`price`) FROM `book`);

SELECT `bookname` FROM `book` order BY `price` DESC LIMIT 1;


#실습4-43
SELECT a.`name`
FROM `customer` AS a
left JOIN `order` AS b ON a.custid = b.custid
WHERE `orderid` is Null;

#실습4-44
INSERT INTO `book` (`bookid`,`bookname`, `publisher`) 
VALUE (11,'스포츠 의학', '한솔의학서적'); 

INSERT INTO `book` SET
							`bookId` = 11,
							`bookName` = '스포츠의학',
							`publisher` = '한솔의학서적';


#실습4-45
UPDATE `customer` SET `address` = '대한민국 부산' 
WHERE `custid` = 5  ;

#실습4-46
DELETE FROM `Customer` WHERE `custid` = 5;