<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../_header.jsp" %>
<jsp:include page="./_aside${group}.jsp"/>
			<section class="modify">
			    <h3>글수정</h3>
			    <article>
			        <form action="${ctxPath }/admin/productRegister.do" method="post" enctype="multipart/form-data">
			        
			            <table>
			                <tr>
			                    <td>제목</td>
			                    <td><input type="text" name="title" value="${article.title }"/></td>
			                </tr>
			                <tr>
			                    <td>내용</td>
			                    <td>
			                        <textarea name="content">${article.content }</textarea>
			                    </td>
			                </tr>
			                <tr>
			                <!-- modify controller 원래있던 파일명, 원래있던 파일 넘버 input만들어서 넣어주기 파일넘버는 hidden -->
			                    <td>첨부</td>
			                    <td>
			                    	<c:if test="${article.file > 0}">
			                    		<input type="text" name="oriName" value="${article.fileDto.oriName }"/>
			                    		<input type="text" name="oriFno" value="${article.fileDto.fno}">
			                   		</c:if>
			                    	<input type="file" name="file">
			                    </td>
			                </tr>
			            </table>
			            <div>
			                <a href="./list.do?group=${group}&cate=${cate}" class="btnCancel">취소</a>
			                <input type="submit"  class="btnWrite" value="수정완료">
			            </div>
			        </form>
			    </article>
			</section>
			<!-- 내용 끝 -->
        </article>
    </section>
</div>			
<%@include file="../_footer.jsp" %>