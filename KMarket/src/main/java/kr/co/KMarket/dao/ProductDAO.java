package kr.co.KMarket.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.KMarket.db.ProductDBHelper;
import kr.co.KMarket.dto.ProductDTO;

public class ProductDAO extends ProductDBHelper {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	
	public void insertProduct(ProductDTO dto) {}
	public ProductDTO selectProduct(int prodNo) {
		return null;
	}
	public List<ProductDTO> selectProducts(int prodNo) {
		return null;
	}
	public void updateProduct(ProductDTO dto) {
		
	}
	public void deleteProduct(int prodNo) {
		
	}


}
