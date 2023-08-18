package kr.Farmstory1.db;

public class SQL {
	// user
	public static final String INSERT_USER = "INSERT INTO `User` SET "
											+ "`uid`= ?, "
											+ "`pass`=SHA2(?, 256), "
											+ "`name`=?, "
											+ "`nick`=?, "
											+ "`email`=?, "
											+ "`hp`=?, "
											+ "`zip`=?, "
											+ "`addr1`=?, "
											+ "`addr2`=?, "
											+ "`regip`=?, "
											+ "`regDate`=NOW()";
	
	public static final String SELECT_USER = "SELECT * FROM `User` WHERE `uid`=? AND `pass`=SHA2(?, 256)";
	
	// terms
	public static final String SELECT_TERMS = "SELECT * FROM `Terms`";
	
	// article
	public static final String INSERT_ARTICLE = "INSERT INTO `Article` SET "
												+ "`cate` =?, "
												+ "`title` =?, "
												+ "`content` =?, "
												+ "`writer` =?, "
												+ "`regip` =?, "
												+ "`rdate` = NOW()";
	public static final String UPDATE_ARTICLE = "UPDATE `Article` SET `title`=?, `Content`=? WHERE `no`=?";
	public static final String SELECT_ARTICLE = "SELECT * FROM `Article` WHERE `no` = ?";
	public static final String SELECT_ARTICLES_JOIN = "SELECT "
													+ "a.*, "
													+ "b.`nick` "
													+ "FROM `Article` AS a "
													+ "JOIN `User` AS b "
													+ "ON a.writer = b.uid "
													+ "WHERE `parent` = 0 "
													+ "AND `cate` = ? "
													+ "ORDER BY `no` DESC "
													+ "LIMIT ?, 10";
	public static final String DELETE_ARTICLE = "DELETE FROM `Article` WHERE `no`=? OR `parent`=?";
	public static final String SELECT_COUNT_TOTAL = "SELECT COUNT(*) FROM `Article` "
													+ "WHERE `parent` = 0 AND `cate` = ?";
			
	// 최신 글
	public static final String SELECT_LATESTS = "SELECT `no`,`title`,`rdate` FROM `Article` "
											+ "WHERE `parent`=0 AND `cate`=? Order BY `no` DESC LIMIT ?";
	
	// comment
	public static final String INSERT_COMMENT = "INSERT INTO `Article` set "
											  + "`parent` =?, "
											  + "`content` =?, "
											  + "`writer` =?, "
											  + "`regip` =?, "
											  + "`rdate` = NOW()";
	public static final String UPDATE_COMMENT = "DELETE FROM `Article` WHERE `no`=? OR `parent`=?";
	public static final String SELECT_COMMENTS = "SELECT "
			+ "a.*, "
			+ "b.`nick` "
			+ "FROM `Article` AS a "
			+ "JOIN `User` AS b "
			+ "ON a.writer = b.uid "
			+ "WHERE `parent` = ?";
}
