package db;

public class SQL {

	// user3
	public static final String INSERT_USER3 = "INSERT INTO `user3` SET "
											+ "`uid` = ?, "
											+ "`name` = ?, "
											+ "`hp` = ?, "
											+ "`age` = ? ";
	public static final String SELECT_USER3  = "SELECT * FROM `user3` WHERE `uid` = ?";
	public static final String SELECT_USER3S = "SELECT * FROM `user3`";
	public static final String UPDATE_USER3  = "UPDATE `user3` SET `name` =?, `hp` =?, `age` = ? WHERE `uid` =?";
	public static final String DELETE_USER3  = "DELETE FROM `user3` WHERE `uid` = ?";
	
	// user4
	public static final String INSERT_USER4 = "INSERT INTO `user4` SET "
											+ "`name` =?, "
											+ "`gender` =?, "
											+ "`age` =?, "
											+ "`addr` =? ";
	public static final String SELECT_USER4 = "SELECT * FROM `user4` WHERE `seq` =?";
	public static final String SELECT_USER4S = "SELECT * FROM `user4`";
	public static final String DELETE_USER4 = "DELETE FROM `user4` WHERE `seq` =?";
	
	// user5
	
	// user6
	
	
	
}
