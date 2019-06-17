var vm = new Vue({
	el : "#publish",
	data : {
		showPublish : true,
		entity : {
			id : null,
			jobName : null,
			jobType : 1,
			jobRequire : "",
			jobPlace : null,
			jobSalary : null,
			jobTel : null,
			jobTime : null,
			jobRemark : "",
			userId : null
		}
	},
	methods : {
		save : function() {
			if (!vm.entity.jobName) {
				layer.msg('请填写名称', {
					time : 1500
				});
				$('#jobName').focus();
				return;
			}
			if (!vm.entity.jobPlace) {
				layer.msg('请填写地点', {
					time : 1500
				});
				$('#jobPlace').focus();
				return;
			}
			if (!vm.entity.jobTel) {
				layer.msg('请填写联系方式', {
					time : 1500
				});
				$('#jobTel').focus();
				return;
			}
			if (!vm.entity.jobTime) {
				layer.msg('请填写时间', {
					time : 1500
				});
				$('#jobTime').focus();
				return;
			}
			$.ajax({
				type : 'post',
				url : '/job/add',
				contentType : 'application/json',
				dataType : 'text',
				data : JSON.stringify(vm.entity),
				success : function(r) {
					if (r == "success") {
						alert('发布成功');
					}
					window.location.href = "index";
				},
				error : function(XMLHttpRequest) {
					alert(XMLHttpRequest.status)
				}
			})
		},
		back : function() {
			window.location.href = "index";
		},
		initDate : function() {
			$('#jobTime').datetimepicker({
				format : "yyyy-mm-dd hh:ii:ss",
				language : 'zh-CN',
				weekStart : 1,
				todayBtn : 1,
				autoclose : 1,
				todayHighlight : true,
				startView : 2,
				minView : 0,
				forceParse : 0,
				pickerPosition : "top-right"
			});
			$('#jobTime').datetimepicker().on('hide', function(ev) {
				var value = $("#jobTime").val();
				vm.entity.jobTime = value;
			});
		}
	},
	computed : {
		types : function() {
			var array = [];
			$.ajaxSettings.async = false;
			$.get("/job/getAllTypes", function(r) {
				array = r;
			});
			$.ajaxSettings.async = true;
			return array;
		}
	},
	mounted : function() {
		this.initDate();
	}
});

$(function() {
	$.ajaxSettings.async = false;
	$.get("/base/getInfo", function(r) {
		vm.entity.userId = r;
	});
	$.ajaxSettings.async = true;
})
layui.use('element', function() {
	var element = layui.element;

});