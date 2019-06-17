var jobId;
var id;
$(function() {
	var str = location.href; // 取得整个地址栏
	var num = str.indexOf("?");
	var num2 = str.indexOf("&");
	id = str.substring(num + 1, num2);
	userId = str.substr(num2 + 1);
	$.ajaxSettings.async = false;
	$.get("/job/findById/" + id, function(r) {
		vm.job = r;
	});
	$.get("/user/findOne/" + userId, function(r) {
		vm.user = r;
	});
	$.ajaxSettings.async = true;
});

var vm = new Vue({
	el : "#jobInfo",
	data : {
		job : {
			jobName : null,
			jobType : null,
			jobRequire : null,
			jobPlace : null,
			jobSalary : null,
			jobTel : null,
			jobTime : null,
			jobRemark : null
		},
		user : {
			userName : null,
			userSex : null,
			userAge : null,
			userHobby : null,
			userSpec : null,
			userDegree : null,
			userExp : null,
			userTel : null,
			userWeChat : null,
			userQQ : null
		}
	},
	methods : {

	}
})