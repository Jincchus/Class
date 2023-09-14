package kr.co.KMarket.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.KMarket.dao.ProductDAO;
import kr.co.KMarket.dto.ProductDTO;

public enum ProductService {
	
	INSTANCE;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	private ProductDAO dao = new ProductDAO();
	
	public void insertProduct(ProductDTO dto) {
		dao.insertProduct(dto);
	}
	public ProductDTO selectProduct(String prodNo) {
		return dao.selectProduct(prodNo);
	}
	public List<ProductDTO> selectProducts(int start) {
		return dao.selectProducts(start);
	}
	public void updateProduct(ProductDTO dto) {
		dao.updateProduct(dto);
	}
	public void deleteProduct(int prodNo) {
		dao.deleteProduct(prodNo);
	}


}
