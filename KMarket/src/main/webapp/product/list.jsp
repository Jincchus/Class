<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ include file="./_productHeader.jsp" %>
        <main id="product">
            <aside>
                <ul class="category">
                    <li><i class="fa fa-bars" aria-hidden="true"></i>카테고리</li>
                    <li>
                        <a href="#"><i class="fas fa-tshirt"></i>패션·의류·뷰티</a>
                        <ol>
                            <li><a href="#">남성의류</a></li>
                            <li><a href="#">여성의류</a></li>
                            <li><a href="#">잡화</a></li>
                            <li><a href="#">뷰티</a></li>
                        </ol>
                    </li>
                    <li>
                        <a href="#"><i class="fas fa-laptop"></i>가전·디지털</a>
                        <ol>
                            <li><a href="#">노트북/PC</a></li>
                            <li><a href="#">가전</a></li>
                            <li><a href="#">휴대폰</a></li>
                            <li><a href="#">기타</a></li>
                        </ol>
                    </li>
                    <li>
                        <a href="#"><i class="fas fa-utensils"></i>식품·생필품</a>
                        <ol>
                            <li><a href="#">신선식품</a></li>
                            <li><a href="#">가공식품</a></li>
                            <li><a href="#">건강식품</a></li>
                            <li><a href="#">생필품</a></li>
                        </ol>
                    </li>
                    <li>
                        <a href="#"><i class="fas fa-home"></i>홈·문구·취미</a>
                        <ol>
                            <li><a href="#">가구/DIY</a></li>
                            <li><a href="#">침구·커튼</a></li>
                            <li><a href="#">생활용품</a></li>
                            <li><a href="#">사무용품</a></li>
                        </ol>
                    </li>
                </ul>
            </aside>
            <section class="list">
                <!-- 제목, 페이지 네비게이션 -->
                <nav>
                    <h1>상품목록</h1>
                    <p>
                        HOME > <span>패션·의류·뷰티</span> > <strong>남성의류</strong>
                    </p>
                </nav>
                <!-- 정렬 메뉴 -->
                <ul class="sort">
                    <li>
                        <a href="#" class="on">판매많은순</a>
                    </li>
                    <li>
                        <a href="#">낮은가격순</a>
                    </li>
                    <li>
                        <a href="#">높은가격순</a>
                    </li>
                    <li>
                        <a href="#">평점높은순</a>
                    </li>
                    <li>
                        <a href="#">후기많은순</a>
                    </li>
                    <li>
                        <a href="#">최근등록순</a>
                    </li>
                </ul>
                <!-- 상품목록 -->
                <table border="0">
                    <tbody>
                    <!-- 
                    	<c:forEach var="product" items="${products }">
	                        <tr>
	                            <td>
	                                <a href="${ctxPath }/view.do?prodNo=${product.prodNo }" class="thumb">
	                                    <img src="${ctxPath }/thumb/${product.thumb1}" alt="${product.prodName }">
	                                </a>
	                            </td>
	                            <td>
	                                <h3 class="name">${product.prodName}</h3>
	                                <a href="${product.descript }" class="desc">상품설명</a>
	                            </td>
	                            <td>
	                                <ul>
	                                !!! price 설명엔 판매가격으로 나와있음 org price인지 dis price 인지 확인 !!!
	                                    <li><ins class="dis-price">${product.price }</ins></li> 
	                                    <li>
	                                        <del class="org-price">${product.price }</del>
	                                        <span class="discount">${product.discount }</span>
	                                    </li>
	                                    <li><span class="free-delivery">무료배송</span></li>
	                                </ul>
	                            </td>
	                            <td>
	                                <h4 class="seller"><i class="fas fa-home"></i>&nbsp;${product.seller}</h4>
	                                !!! 판매자 등급 확인 join 해야 할 듯 !!!
	                                <h5 class="badge power">판매자등급</h5>
	                                !!! 상품평 : score 에 따라 class star값 달라짐 확인 !!!
	                                <h6 class="rating star1">상품평</h6>
	                            </td>
	                        </tr>
                        </c:forEach>
                    -->
                        <tr>
                            <td>
                                <a href="#" class="thumb">
                                    <img src="http://via.placeholder.com/120x120" alt="상품이미지">
                                </a>
                            </td>
                            <td>
                                <h3 class="name">상품명</h3>
                                <a href="#" class="desc">상품설명</a>
                            </td>
                            <td>
                                <ul>
                                    <li><ins class="dis-price">27,000</ins></li>
                                    <li>
                                        <del class="org-price">30,000</del>
                                        <span class="discount">10%</span>
                                    </li>
                                    <li><span class="free-delivery">무료배송</span></li>
                                </ul>
                            </td>
                            <td>
                                <h4 class="seller"><i class="fas fa-home"></i>&nbsp;판매자</h4>
                                <h5 class="badge power">판매자등급</h5>
                                <h6 class="rating star1">상품평</h6>
                            </td>
                        </tr>
                    </tbody>
                </table>
                <!-- 23.09.14 jboard paging 참조 > 매개변수 start만 사용 카테고리에 따라 매개변수 추가 될 듯 -->
                <div class="paging">
                    <span class="prev">
                        <a href="#"><&nbsp;이전</a>
                    </span>
                    <span class="num">
                        <a href="#" class="on">1</a>
                        <a href="#">2</a>
                        <a href="#">3</a>
                        <a href="#">4</a>
                        <a href="#">5</a>
                        <a href="#">6</a>
                        <a href="#">7</a>
                    </span>
                    <span class="next">
                        <a href="#">다음&nbsp;></a>
                    </span>
                </div>
            </section>
        </main>

<%@ include file="./_productFooter.jsp" %>