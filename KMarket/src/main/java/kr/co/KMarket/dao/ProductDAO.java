package kr.co.KMarket.dao;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import kr.co.KMarket.db.ProductDBHelper;
import kr.co.KMarket.db.ProductSQL;
import kr.co.KMarket.dto.ProductDTO;

public class ProductDAO extends ProductDBHelper {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// 기본 CRUD 
	public void insertProduct(ProductDTO dto) {}
	public ProductDTO selectProduct(String prodNo) {
		ProductDTO dto = new ProductDTO();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(ProductSQL.SELECT_PRODUCT); //SQL문 확인 해보기
			psmt.setString(1, prodNo);
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				dto.setProdNo(rs.getInt(1));
				dto.setProdCate1(rs.getInt(2));
				dto.setProdCate2(rs.getInt(3));
				dto.setProdName(rs.getInt(4));
				dto.setDescript(rs.getInt(5));
				dto.setSeller(rs.getInt(6));
				dto.setPrice(rs.getInt(7));
				dto.setDiscount(rs.getInt(8));
				dto.setPoint(rs.getInt(9));
				dto.setStock(rs.getInt(10));
				dto.setSold(rs.getInt(11));
				dto.setDelivery(rs.getInt(12));
				dto.setHit(rs.getInt(13));
				dto.setScore(rs.getInt(14));
				dto.setReview(rs.getInt(15));
				dto.setThumb1(rs.getInt(16));
				dto.setThumb2(rs.getInt(17));
				dto.setDetail(rs.getInt(18));
				dto.setReceipt(rs.getInt(19));
				dto.setBizType(rs.getInt(20));
				dto.setOrigin(rs.getInt(21));
				dto.setIp(rs.getInt(22));
				dto.setRdate(rs.getInt(23));
				dto.setEtc1(rs.getInt(24));
				dto.setEtc2(rs.getInt(25));
				dto.setEtc3(rs.getInt(26));
				dto.setEtc4(rs.getInt(27));
				dto.setEtc5(rs.getInt(28));
			}
			close();
			
		} catch (Exception e) {
			logger.error("selectProduct() error : " + e.getMessage());
		}
		return dto;
	}
	public List<ProductDTO> selectProducts(int prodNo) {
		List<ProductDTO> products = new ArrayList<>();
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(ProductSQL.SELECT_PRODUCTS);
			psmt.setInt(1, start);
			
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				ProductDTO dto = new ProductDTO();
				dto.setProdNo(rs.getInt(1));
				dto.setProdCate1(rs.getInt(2));
				dto.setProdCate2(rs.getInt(3));
				dto.setProdName(rs.getInt(4));
				dto.setDescript(rs.getInt(5));
				dto.setSeller(rs.getInt(6));
				dto.setPrice(rs.getInt(7));
				dto.setDiscount(rs.getInt(8));
				dto.setPoint(rs.getInt(9));
				dto.setStock(rs.getInt(10));
				dto.setSold(rs.getInt(11));
				dto.setDelivery(rs.getInt(12));
				dto.setHit(rs.getInt(13));
				dto.setScore(rs.getInt(14));
				dto.setReview(rs.getInt(15));
				dto.setThumb1(rs.getInt(16));
				dto.setThumb2(rs.getInt(17));
				dto.setDetail(rs.getInt(18));
				dto.setReceipt(rs.getInt(19));
				dto.setBizType(rs.getInt(20));
				dto.setOrigin(rs.getInt(21));
				dto.setIp(rs.getInt(22));
				dto.setRdate(rs.getInt(23));
				dto.setEtc1(rs.getInt(24));
				dto.setEtc2(rs.getInt(25));
				dto.setEtc3(rs.getInt(26));
				dto.setEtc4(rs.getInt(27));
				dto.setEtc5(rs.getInt(28));
				products.add(dto);
			}
			close();
		} catch (Exception e) {
			logger.error("selectProducts()error : " + e.getMessage());
		}
		
		return products;
	}
	public void updateProduct(ProductDTO dto) {
		
	}
	public void deleteProduct(int prodNo) {
		
	}


	// 게시물 갯수 조회 메서드 (jboard 참고)
	public int selectCountTotal() {
		int total = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(ProductSQL.SELECT_COUNT_TOTAL);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				total = rs.getInt(1);
			}
			
			close();
		} catch (Exception e) {
			logger.error("selectCountTotal() error : " + e.getMessage());
		}
		return total;
	}
	
}
