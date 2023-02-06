//로그인 아이디 유효성 검사
function loginCheck() {
	if(document.frm.id.value.length == 0) {
		alert("아이디 입력하세요.")
		frm.id.focus();
		
		return false; //submit 막는
	}


//로그인 비밀번호 유효성 검사
	if(document.frm.pw.value == "") {
		alert("비밀번호 입력하세요.")
		frm.pw.focus();
		
		return false; //submit 막는
	}
	
	//둘다 만족했을 경우 sumbit 사용가능
	return true;
}

//회원가입 아이디 중복 체크
function idCheck() {
	if(document.frm.id.value.length == 0) {
		alert("아이디 입력하세요.")
		frm.id.focus();
		
		return;
	}
	
	let url = "idCheck.do?id=" + document.frm.id.value;
	window.open(url);
	
}

function idOk() {
	
	self.close();
	
}