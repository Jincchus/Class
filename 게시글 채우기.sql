# 게시물 채우기
INSERT INTO `Article` (`title`, `content`, `writer`, `regip`, `rdate`)
SELECT `title`, `content`, `writer`, `regip`, `rdate` FROM `Article`;