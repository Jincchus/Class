package kr.co.farmstory2.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.db.DBHelper;
import kr.co.farmstory2.dto.OrderDTO;

public class OrderDAO extends DBHelper{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void insertUser(OrderDTO dto) {}
	public OrderDTO selectUser(int orderNo) {
		return null;
	}
	public List<OrderDTO> selectUsers() {
		return null;
	}
	public void updateUser(OrderDTO dto) {}
	public void deleteUser(int orderNo) {}
	

}
