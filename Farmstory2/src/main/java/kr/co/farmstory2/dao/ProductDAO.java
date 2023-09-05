package kr.co.farmstory2.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.db.DBHelper;
import kr.co.farmstory2.dto.ProductDTO;

public class ProductDAO extends DBHelper{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void insertProduct(ProductDTO dto) {}
	public ProductDTO selectProduct(int pNo) {
		return null;
	}
	public List<ProductDTO> selectProducts() {
		return null;
	}
	public void updateProduct(ProductDTO dto) {}
	public void deleteProduct(int pNo) {}
	
}
