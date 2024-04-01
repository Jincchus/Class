package com.shop;

import java.util.List;
import java.util.Scanner;

import com.shop.dao.CustomerDAO;
import com.shop.dao.OrderDAO;
import com.shop.dao.ProductDAO;
import com.shop.vo.CustomerVO;
import com.shop.vo.OrderVO;
import com.shop.vo.ProductVO;

import sub5.UserDAO;
import sub5.UserVO;

/*
 * 날짜 : 2023/07/13
 * 이름 : 박경진
 * 내용 : Shop CRUD 실습
 */

public class ShopMain {
	public static void main(String[] args) {
		
		System.out.println("---------------------");
		System.out.println("쇼핑몰에 오신것을 환영합니다.");
		System.out.println("---------------------");

		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		ProductDAO productDAO = ProductDAO.getInstance();
		CustomerVO loginedCustomer = null;
		while(true) {
			if(loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 구매하기:4");
			} else {
				System.out.println("종료:0, 로그아웃:1, 주문현황:2, 상품목록:3, 구매하기:4");
				
			}
			
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			if(answer == 0 ) {
				// 종료
				break;
			} else if(answer == 1) {
				// 로그인 / 로그아웃
				if(loginedCustomer == null) {
					System.out.print("아이디 입력 : ");
					String custId = sc.next();

					loginedCustomer = customerDAO.selectCustomer(custId);

					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");

					}else{
						System.out.println("일치하는 회원이 없습니다.");
					}
				}else {
					// 로그아웃 처리
					System.out.println(loginedCustomer.getName()+"님 안녕히 가세요.");
					loginedCustomer = null;
				}
				
			} else if(answer == 2) {

				if(loginedCustomer == null) {

					// 회원가입
					CustomerVO vo = new CustomerVO();

					System.out.print("아이디 입력 : ");
					vo.setCustId(sc.next());

					System.out.print("이름 입력 : ");
					vo.setName(sc.next());

					System.out.print("휴대폰 입력 :");
					vo.setHp(sc.next());

					System.out.print("주소 입력 : ");
					vo.setAddr(sc.next());

					int result = customerDAO.insertCustomer(vo);

					if(result > 0) {
						System.out.println("회원가입을 축하합니다.");

					}else {
						System.out.println("회원가입에 실패 했습니다. 다시 회원가입 하십시오.");
					}
				}else {
					
					// 주문 현황
					String orderId = loginedCustomer.getCustId();
					List<OrderVO> myOrders = orderDAO.selectOrders(orderId);
					
					System.out.println("----------- 주문 현황 -----------");
					for(OrderVO myOrder : myOrders) {
						System.out.println(myOrder);
					}
					System.out.println("-----------------------------");
					
				}
				
			} else if(answer == 3) {
				// 상품목록
				List<ProductVO> products = productDAO.selectProducts();
				
				System.out.println("------------ 상품 목록 ------------");
				for(ProductVO product : products) {
					System.out.println(product);
					
				}
				System.out.println("---------------------------------");
			} else if(answer == 4) {
				// 주문하기
				if(loginedCustomer == null) {
					System.out.println("로그인을 먼저 하십시오.");
					continue;
				}

				OrderVO orderVO = new OrderVO();
				
				System.out.print("주문 상품번호를 입력 : ");
				int prodNo = sc.nextInt();
				
				System.out.println("주문 수량 입력 : ");
				int prodCount = sc.nextInt();
				
				// 주문객체 생성
				orderVO.setOrderId(loginedCustomer.getCustId());
				orderVO.setOrderProduct(prodNo);
				orderVO.setOrderCount(prodCount);
				orderVO.setOrderId(loginedCustomer.getCustId());
				
				// 주문처리
				int result = orderDAO.insertOrder(orderVO);
				
				//상품 재고 수정
				productDAO.updateProductStock(prodNo, prodCount);
				
				if(result > 0) {
					System.out.println("상품 주문이 완료되었습니다.");
				}else {
					System.out.println("상품 주문이 실패했습니다.");
				}
			}
		}
	
	
		sc.close();
		System.out.println("안녕히 가세요~");
	
	}
}
