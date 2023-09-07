package kr.co.farmstory2.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.farmstory2.db.DBHelper;
import kr.co.farmstory2.db.SQL;
import kr.co.farmstory2.dto.ProductDTO;

public class ProductDAO extends DBHelper{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	public void insertProduct(ProductDTO dto) {
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_PRODUCT);
			psmt.setInt(1, dto.getType());
			psmt.setString(2, dto.getpName());
			psmt.setInt(3, dto.getPrice());
			psmt.setInt(4, dto.getDelivery());
			psmt.setInt(5, dto.getStock());
			psmt.setInt(6, dto.getSold());
			psmt.setString(7, dto.getThumb1());
			psmt.setString(8, dto.getThumb2());
			psmt.setString(9, dto.getThumb3());
			psmt.setString(10, dto.getSeller());
			psmt.setString(11, dto.getEtc());
			
			psmt.executeUpdate();
			
		} catch (Exception e) {
			logger.error("insertProduct() error : " + e.getMessage());
		}
	}
	public int selectCountProductsTotal(String type) {
		int total = 0;
		try {
			conn = getConnection();
			if(type.equals("0")) {
				psmt = conn.prepareStatement(SQL.SELECT_COUNT_PRODUCTS_ALL);
			}else {
				psmt = conn.prepareStatement(SQL.SELECT_COUNT_PRODUCTS_TYPE);
				psmt.setString(1, type);
			}
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
			close();
			
		} catch (Exception e) {
			logger.debug("selectCountProductsTotal() error : " + e.getMessage());
		}
		return total;
	}
	public ProductDTO selectProduct(int pNo) {
		return null;
	}
	public List<ProductDTO> selectProducts() {
		List<ProductDTO> products = new ArrayList<>();
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(SQL.SELECT_PRODUCTS);
			
			while(rs.next()) {
				ProductDTO product = new ProductDTO();
				product.setpNo(rs.getInt(1));
				product.setType(rs.getInt(2));
				product.setpName(rs.getString(3));
				product.setPrice(rs.getInt(4));
				product.setDelivery(rs.getInt(5));
				product.setStock(rs.getInt(6));
				product.setSold(rs.getInt(7));
				product.setThumb1(rs.getString(8));
				product.setThumb2(rs.getString(9));
				product.setThumb3(rs.getString(10));
				product.setSeller(rs.getString(11));
				product.setEtc(rs.getString(12));
				product.setRdate(rs.getString(13));
				
				products.add(product);
			}
			
		} catch (Exception e) {
			logger.error("selectProducts() error : " + e.getMessage());
		}
		return products;
	}
	public void updateProduct(ProductDTO dto) {}
	public void deleteProduct(int pNo) {}
	
}
