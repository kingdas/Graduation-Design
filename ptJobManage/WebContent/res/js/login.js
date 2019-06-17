window.onload = change;
var code;
function change() {
	document.getElementById("codeImg").innerHTML = getCode(4);
}
function getCode(n) {
	var all = "zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP0123456789";
	var b = "";
	for (var i = 0; i < n; i++) {
		var index = Math.floor(Math.random() * 62);
		b += all.charAt(index);
	}
	code = b;
	return b;
}

function loginCheck() {
	var adminName = document.getElementById("adminName").value;
	var adminPassword = document.getElementById("adminPassword").value;
	var checkCode = document.getElementById("checkCode").value;
	if (checkCode.toLowerCase() == code.toLocaleLowerCase()) {
		$.ajax({
			type : 'post',
			url : 'base/loginCheck/' + adminName + "/" + adminPassword,
			dataType : 'text',
			success : function(r) {
				if (r == "success") {
					window.location.href = "base/frame";
				} else {
					alert('用户名或密码错误');
					change();
				}
			},
			error : function(XMLHttpRequest) {
				// alert(XMLHttpRequest.status);
				alert('用户名或密码错误');
				change();
			}
		})
	} else {
		alert('验证码错误');
		change();
	}
}

function infoClear() {
	document.getElementById("adminName").value = '';
	document.getElementById("adminPassword").value = '';
	document.getElementById("checkCode").value = '';
}
