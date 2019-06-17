var vm = new Vue({
	el : "#selfInfoUpdate",
	data : {
		entity : {
			userName : null,
			userSex : null,
			userAge : null,
			userDegree : null,
			userExp : null,
			userHobby : null,
			userSpec : null,
			userTel : null,
			userWeChat : null,
			userQQ : null,
			userLoginName : null,
			userPassword : null,
			remark : null
		}
	},
	methods : {
		update : function() {
			$.ajax({
				type : "post",
				url : "/user/update",
				contentType : "application/json;charset = UTF-8",
				data : JSON.stringify(vm.entity),
				success : function() {
					// alert('修改成功');
					history.back(-1);
				},
				error : function(XMLHttpRequest) {
					alert(XMLHttpRequest.status);
				}
			})
		},
		selfInfo : function() {
			window.location.href = "selfInfo";
		}
	}
})

$(function() {
	$.get("/user/findOne", function(r) {
		vm.entity = r
	})
})