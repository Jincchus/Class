/**
 * 사용 xxx view 동적처리 부분 변경하면서 사용 안하게 되면서 아까워서 저장
 * view.jsp탭은 최신 Javascript*(ES6) 문법 적용
 */

 	$(function(){
		
		// 댓글 입력
		$('#btnComment').click(function(e){
			e.preventDefault();
			const parent = $('#formComment > input[name=parent]').val();
			const content = $('#formComment > textarea[name=content]').val();
			const writer = $('#formComment > input[name=writer]').val();
			
			const jsonData = {
					"parent" : parent,
					"content" : content,
					"writer" : writer
			};
			
			console.log('jsonData : ' + jsonData);
			
			$.ajax({
				url : '/Farmstory2/comment.do',
				type : 'post',
				data : jsonData,
				dataType : 'json',
				success : function(data){
					console.log(data);
					if(data.no > 0){
						alert('댓글이 등록되었습니다.');
						
						$('#formComment > textarea[name=content]').val(''); // 댓글 등록 후 textarea 초기화
						
						// 동적 화면 생성
						const dt = new Date();
						const year = dt.getFullYear().toString().substr(2,4);
						const month = (dt.getMonth()+1).toString().padStart(2, '0');
						const date = dt.getDate().toString().padStart(2,'0');
						const now = year+"-"+month+"-"+date;

						const article = `<article>
											<span class='nick'> ${sessUser.nick} </span>
											<span class='date'> `+now+` </span>
											<p class='content'> `+content+`</p>
											<div>
												<a href='#' class='remove' data-no=`+data.no+`>삭제</a> 
												<a href='#' class='modify'>수정</a> 
											</div>
										 </article>`;
						$('.commentList').append(article);
					}else{
						alert('댓글 등록이 실패했습니다.');
					}
				}
			});
		}); //#btnComment.click 끝
		
		// 댓글 삭제(동적 생성 이벤트 구현)
		$(document).on('click', '.del',function(e){
			e.preventDefault();
			
			const no = $(this).data('no');
			const article = $(this).parent().parent();
			
			console.log('no : ' + no);
			
			const jsonData = {
				"kind" : "DELETE",
				"no" : no
			}
			$.ajax({
				url : '/Farmstory2/comment.do',
				type : 'GET',
				data : jsonData,
				dataType : 'json',
				success : function(data){
					if(data.result > 0){
						alert('댓글이 삭제 되었습니다.');
						// 화면처리
						article.remove();
					}
				}
			});
		}); //댓글 삭제 end
	}) // function 끝