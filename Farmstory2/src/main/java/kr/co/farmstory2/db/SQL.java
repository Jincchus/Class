package kr.co.farmstory2.db;

public class SQL {
	// Terms
	public static final String SELECT_TERMS = "SELECT * FROM `Terms`";
	
	// User
	public static final String INSERT_USER = "INSERT INTO `User` SET"
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
	public static final String SELECT_USER = "SELECT * FROM `User` WHERE `uid` =? AND `pass` = SHA2(?, 256)";
	public static final String SELECT_COUNT_UID = "SELECT COUNT(*) FROM `User` WHERE `uid` =?";
	public static final String SELECT_COUNT_NICK = "SELECT COUNT(*) FROM `User` WHERE `nick` =?";
	public static final String SELECT_COUNT_HP = "SELECT COUNT(*) FROM `User` WHERE `hp` =?";
	
	// Article
	public static final String INSERT_ARTICLE = "INSERT INTO `Article` SET "
												+ "`cate` =?, "
												+ "`title` = ?, "
												+ "`content` = ?, "
												+ "`file` = ?, "
												+ "`writer` = ?, "
												+ "`regip` = ?, "
												+ "`rdate` = NOW()";
	public static final String SELECT_MAX_NO = "SELECT MAX(`no`) FROM `Article`";
	public static final String SELECT_ARTICLE = "SELECT * FROM `Article` AS a "
												+ "LEFT JOIN `File` AS b "
												+ "ON a.`no` = b.`ano` "
												+ "WHERE `no` = ?";
	public static final String SELECT_ARTICLES = "SELECT "
													+ "a.*, "
													+ "b.`nick` "
													+ "FROM `Article` AS a "
													+ "JOIN `User` AS b ON a.writer = b.uid "
													+ "WHERE `parent`=0 AND `cate`=? "
													+ "ORDER BY `no` DESC "
													+ "LIMIT ?, 10";
	public static final String SELECT_COUNT_TOTAL = "SELECT COUNT(*) FROM `Article` WHERE `parent` = 0 AND `cate` = ?";
	public static final String UPDATE_ARTICLE = "UPDATE `Article` SET `title` =?, `content` =? WHERE `no` =?";
	public static final String DELETE_ARTICLE = "DELETE FROM `Article` WHERE `no` =? OR `parent` =?";
	
	// Comment
	public static final String INSERT_COMMENT = "INSERT INTO `Article` set "
												+ "`parent` = ?, "
												+ "`content` = ?, "
												+ "`writer` = ?, "
												+ "`regip` = ?, "
												+ "`rdate` = NOW()";
	public static final String SELECT_COMMENTS = "SELECT "
												+ "a.*, "
												+ "b.`nick` "
												+ "FROM `Article` AS a "
												+ "JOIN `User` AS b "
												+ "ON a.writer = b.uid "
												+ "WHERE `parent` = ?";
	public static final String DELETE_COMMENT = "DELETE FROM `Article` WHERE `no` = ?";
	
	// File
	public static final String INSERT_FILE = "INSERT INTO `File` SET "
											+ "`ano` =?, " 
											+ "`oriName` =?, " 
											+ "`newName` =?, " 
											+ "`rdate` =NOW() "; 
	public static final String SELECT_FILE = "SELECT * FROM `File` WHERE `fno` = ?";
	public static final String DELETE_FILE = "DELETE FROM `File` WHERE `ano` = ?";
}
