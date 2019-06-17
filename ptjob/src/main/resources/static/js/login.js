var vm = new Vue({
	el : '#login',
	data : {
		loginOrRegister : true,
		q : {
			userLoginName : null,
			userPassword : null
		},
		entity : {
			userName : null,
			userSex : null,
			userAge : null,
			userDegree : null,
			userHobby : null,
			userSpec : null,
			userExp : null,
			userTel : null,
			userWeChat : null,
			userQQ : null,
			userLoginName : null,
			userPassword : null,
			remark : null
		}
	},
	methods : {
		login : function() {
			var checkCode = document.getElementById("checkCode").value;
			if (checkCode.toLowerCase() == code.toLocaleLowerCase()) {
				$.ajax({
					type : 'post',
					url : '/base/loginCheck',
					contentType : 'application/json',
					dataType : 'text',
					data : JSON.stringify(vm.q),
					success : function(r) {
						if (r == "success") {
							window.location.href = "index";
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
		},
		register : function() {
			vm.entity = {};
			vm.loginOrRegister = false;
		},
		doRegister : function() {
			if (!vm.entity.userName) {
				alert('请填写用户名');
				return;
			}
			if (!vm.entity.userSex) {
				alert('请填写性别');
				return;
			}
			if (!vm.entity.userLoginName) {
				alert('请填写登录名');
				return;
			}
			if (!vm.entity.userPassword) {
				alert('请填写密码');
				return;
			}
			if (!vm.entity.userTel) {
				alert('请填写电话号码');
				return;
			}
			$.ajax({
				type : "post",
				url : "/user/add",
				contentType : "application/json",
				dataType : "text",
				data : JSON.stringify(vm.entity),
				success : function(r) {
					if (r == "success") {
						alert('注册成功');
						vm.q = {};
						vm.loginOrRegister = true;
					}
				},
				error : function(XMLHttpRequest) {
					alert(XMLHttpRequest.status);
				}
			})
		},
		cancel : function() {
			vm.loginOrRegister = true;
		}
	}
});

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
