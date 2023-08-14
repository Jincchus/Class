# 게시물 채우기
INSERT INTO `Article` (`title`, `content`, `writer`, `regip`, `rdate`)
SELECT `title`, `content`, `writer`, `regip`, `rdate` FROM `Article`;

# 전체 게시물 갯수
SELECT COUNT(*) FROM `Article`;

SELECT a.*, b.`nick` FROM `Article` AS a 
JOIN `User` AS b ON a.writer = b.uid
ORDER BY `no` DESC
LIMIT 0, 10;

RENAME TABLE `article_copy` TO `Article`;

DELETE FROM `Article`;

DELETE FROM `Article` WHERE `no`=32761;

UPDATE `Article` SET `comment` = `comment` - 1 WHERE `no` = 32756;

UPDATE `Article` SET `title`= '타이틀', `Content`= '컨텐츠' WHERE `no`=32753;

DELETE FROM `Article` WHERE `no` = 32758;

UPDATE `Article` SET `content` = '멍멍' WHERE `no` =32803;