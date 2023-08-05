/**
 * 사용자 개인정보 중복체크
 */

// 사용자 개인정보 중복체크
$(function() {
	// 아이디 중복체크
	$('#btnCheckUid').click(function() {

		/* uid값 가져오기 */
		const uid = $('input[name=uid]').val();
		
		if(!uid.match(reUid)){
			$('.resultId').css('color', 'red').text('유효하지 않은 아이디 입니다.');
			isUidOk = false;
			return;
		}
		/* jsonData 만들기*/
		const jsonData = {
			"uid": uid
		};

		/* ajax함수 */
		$.ajax({
			url: '/Jboard1/user/checkUser.jsp',
			type: 'GET',
			data: jsonData,
			dataType: 'json',
			success: function(data) {

				if (data.resultUid >= 1) {
					$('.resultId').css('color', 'red').text('이미 사용중인 아이디 입니다.');
				} else {
					$('.resultId').css('color', 'green').text('사용 가능한 아이디 입니다.');

				}

			}
		});
	}); // 아이디 중복체크 끝

	// 닉네임 중복체크
	$('input[name=nick]').focusout(function() {
		// 입력 데이터 가져오기
		const nick = $(this).val();
		
		if(!nick.match(reNick)){
			$('.resultNick').css('color','red').text('유효하지 않은 닉네임 입니다.');
			isNickOk = false;
			return;
		}

		// JSON 생성
		const jsonData = {
			"nick": nick
		};

		$.get('/Jboard1/user/checkUser.jsp', jsonData, function(data) {
			if (data.resultNick >= 1) {
				$('.resultNick').css('color', 'red').text('이미 사용중인 별명입니다.');
				isNickOk = false;
			} else {
				$('.resultNick').css('color', 'green').text('사용 가능한 별명입니다.');
				isNickOk = true;
			}
		});
	}); // 닉네임 중복체크 끝

	// 이메일 중복체크
	document.getElementsByName('email')[0].onfocusout = function() {
		const resultEmail = document.getElementById('resultEmail');
		
		// 입력 데이터 가져오기
		const email = this.value;

		if(!email.match(reEmail)){
			resultEmail.innerText = '유효한 이메일이 아닙니다.';
			resultEmail.style.color = 'red';
			isEmailOk = false;
			return;
		}
		const xhr = new XMLHttpRequest();
		xhr.open('GET', '/Jboard1/user/checkUser.jsp?email=' + email);
		xhr.send();

		xhr.onreadystatechange = function() {

			if (xhr.readyState == XMLHttpRequest.DONE) {
				if (xhr.status == 200) {
					const data = JSON.parse(xhr.response);
					console.log('data : ' + data);

					const resultEmail = document.getElementById('resultEmail');

					if (data.resultEmail >= 1) {
						resultEmail.innerText = '이미 사용중인 이메일 입니다.';
						resultEmail.style.color = 'red';
					} else {
						resultEmail.innerText = '사용 가능한 이메일 입니다.';
						resultEmail.style.color = 'green';
					}
				}

			}

		} // onreadystatechange end

	} // 이메일 중복체크 끝

	// 휴대폰 중복체크
	document.getElementsByName('hp')[0].addEventListener('focusout', function() {

		const resultHp = document.getElementById('resultHp');
		const hp = this.value;
		
		if(!hp.match(reHp)){
			resultHp.innerText = '유효하지 않은 휴대폰 번호 입니다.';
			resultHp.style.color = 'red';
			isHpOk = false;
			retrun;
		}
		
		const url = '/Jboard1/user/checkUser.jsp?hp=' + this.value;
		fetch(url)
			.then(response => response.json())
			.then(data => {

				console.log(data);

				if (data.resultHp >= 1) {
					resultHp.innerText = '이미 사용중인 번호 입니다.';
					resultHp.style.color = 'red';
					isHpOk = false;
				} else {
					resultHp.innerText = '사용 가능한 번호 입니다.';
					resultHp.style.color = 'green';
					isHpOk = true;
				}
			});
	}); // 휴대폰 중복체크 끝
}); // 사용자 개인정보 끝