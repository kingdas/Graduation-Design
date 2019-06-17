function publish() {
	window.location.href = "publish";
};

function selfPublish() {
	window.location.href = "selfPublish";
};

function selfInfo() {
	window.location.href = "selfInfo";
};

function showTable(jobList) {
	$('#tbody').empty();
	for (var i = 0; i < jobList.length; i++) {
		var typeName = '';
		$.ajaxSettings.async = false
		$.getJSON("/job/getTypeName/" + jobList[i].jobType, function(r) {
			typeName = r.typeName;
		});
		$.ajaxSettings.async = true;
		var str = "";
		str += "<tr><td>"
				+ jobList[i].jobName
				+ "</td><td>"
				+ typeName
				+ "</td><td>"
				+ jobList[i].jobRequire
				+ "</td><td>"
				+ jobList[i].jobPlace
				+ "</td><td>"
				+ jobList[i].jobSalary
				+ "</td><td>"
				+ jobList[i].jobTime
				+ "</td><td>"
				+ jobList[i].jobTel
				+ "</td><td>"
				+ jobList[i].jobRemark
				+ "</td><td><input type = 'button' class = 'btn btn-default btn-xs' onclick = 'prompt("
				+ jobList[i].id
				+ ","
				+ jobList[i].userId
				+ ")' value = '查看' /></td><td><input type = 'button' class = 'btn btn-default btn-xs' onclick = 'deliver("
				+ jobList[i].id + ")' value = '投递' /></td></tr>";
		$('#tbody').append(str);
	}
}

$(function() { // 加载兼职列表
	$.get("/base/getLoginName", function(r) {
		document.getElementById("loginName").innerHTML = r;
	});
	$.ajax({
		type : 'get',
		url : '/job/list',
		dataType : "json",
		success : function(r) {
			showTable(r);
		},
		error : function(XMLHttpRequest) {
			alert(XMLHttpRequest.status)
		}
	});
});

$('#jobFind').keyup(function() {
	if (event.keyCode == 13) {
		var jobName = document.getElementById("jobFind").value;
		console.log(jobName);
		var params = {
			"jobName" : jobName,
			"jobType" : null
		};
		var s = JSON.stringify(params);
		$.ajax({
			type : 'post',
			url : '/job/condition',
			dataType : 'json',
			data : params,
			success : function(r) {
				showTable(r);
			},
			error : function(XMLHttpRequest) {
				alert(XMLHttpRequest.status)
			}
		});
	}
});

function prompt(id, userId) {
	var layerView = layer.open({
		type : 2,
		skin : 'layui-layer-molv',
		anim : 4,
		isOutAnim : true,
		resize : true,
		offset : 'auto',
		title : '兼职信息',
		shade : 0.3,
		shadeClose : true,
		maxmin : true, // 开启最大化最小化按钮
		area : [ '600px', '500px' ],
		content : 'jobInfo.html?' + id + "&" + userId,
		closeBtn : 1,
		end : function() {
			layer.close(layerView);
		}
	});
}

function deliver(id) {
	$.ajax({
		type : 'post',
		url : '/job/deliver/' + id,
		dataType : "text",
		success : function() {
			layui.use('layer', function() {
				var layer = layui.layer;
				layer.msg('投递成功');
			})
		},
		error : function(XMLHttpRequest) {
			alert(XMLHttpRequest.status);
		}
	})
}

$(function() {
	layui.use('carousel', function() {
		var carousel = layui.carousel;
		carousel.render({
			elem : '#test1',
			width : '1200px', // 设置容器宽度
			height : '450px;',
			arrow : 'always', // 始终显示箭头
			anim : 'default',// 切换动画方式
			// autoplay : true,
			time : 3000,
			index : 0
		});
	});
})

layui.use('element', function() {
	var element = layui.element;
});

function logout() {
	$.ajax({
		type : 'post',
		url : '/base/logout',
		dataType : "text",
		success : function(r) {
			if (r == 'logout') {
				window.location.href = "login";
			}
		},
		error : function(XMLHttpRequest) {
			alert(XMLHttpRequest.status);
		}
	})
}
