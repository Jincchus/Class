<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../_header.jsp" %>
        <div id="sub">
            <div><img src="../images/sub_top_tit2.png" alt="MARKET"></div>
            <section class="market">
                <aside>
                    <img src="../images/sub_aside_cate2_tit.png" alt="장보기"/>

                    <ul class="lnb">
                        <li class="on"><a href="./market.html">장보기</a></li>
                    </ul>
                </aside>
                <article class="list">
                    <nav>
                        <img src="../images/sub_nav_tit_cate2_tit1.png" alt="장보기"/>
                        <p>
                            HOME > 장보기 > <em>장보기</em>
                        </p>
                    </nav>

                    <!-- 내용 시작 -->
                    <p class="sort">
                        <a href="#" class="on">전체(10) |</a>
                        <a href="#">과일 |</a>
                        <a href="#">야채 |</a>
                        <a href="#">곡류</a>
                    </p>
                    <table border="0">
                    	<c:forEach var="product" items="${requestScope.products }">
	                        <tr>
	                            <td>
	                                <a href="./view.do?pNo=${product.getpNo()}"><img src="${ctxPath}/rhumb/${product.getThumb1()}" alt="사과 500g"></a>
	                            </td>
	                            <td>과일</td>
	                            <td><a href="./view.do?pNo=${product.getpNo() }">${product.getpName()}</a></td>
	                            <td><strong>4,000</strong>원</td>
	                        </tr>
                        </c:forEach>
                    </table>

            <div class="paging">
	        	<c:if test="${pageGroupStart > 1}">
	            	<a href="${ctxPath}/market/list.do?type=${type}&pg=${pageGroupStart - 1}" class="prev">이전</a>
	            </c:if>
	            <c:forEach var="i" begin="${pageGroupStart}" end="${pageGroupEnd}">
	            	<a href="${ctxPath}/market/list.do?type=${type}&pg=${i}&" class="num ${currentPage == i?'current':'off'}">${i}</a>
	            </c:forEach>
	            <c:if test="${pageGroupEnd < lastPageNum}">
	            	<a href="${ctxPath}/market/list.do?type=${type}&pg=${pageGroupEnd + 1}" class="next">다음</a>
	            </c:if>
	        </div>

                    <!-- 내용 끝 -->

                </article>
            </section>

        </div>
<%@ include file="../_footer.jsp" %>