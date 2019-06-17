var vm = new Vue({
	el : "#selfInfo",
	data : {
		entity : {
			id : null,
			userName : null,
			userSex : null,
			userAge : null,
			userHobby : null,
			userSpec : null,
			userDegree : null,
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
		selfInfoUpdate : function() {
			window.location.href = "selfInfoUpdate";
		},
		goIndex : function() {
			window.location.href = "index";
		}
	}
});

$(function() {
	$.get("/user/findOne", function(r) {
		vm.entity = r
	})
})
layui.use('element', function() {
	var element = layui.element;

});