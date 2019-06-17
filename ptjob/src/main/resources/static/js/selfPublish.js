$(function() {
	pageInit();// 页面加载完成之后执行
});
function pageInit() {
	jQuery("#list2").jqGrid(
			{
				url : '/job/selfPublish',// 组件创建完成之后请求数据的url
				datatype : "json",// 请求数据返回的类型。可选json,xml,txt
				colNames : [ '', '兼职名称', '兼职类型', '工作要求', '工作地点', '工作待遇',
						'联系电话', '工作时间', '备注' ],// jqGrid的列显示名字
				colModel : [ // jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
				{
					label : 'id',
					name : 'id',
					index : "id",
					width : 30,
					key : true,
					hidden : true
				}, {
					name : 'jobName',
					index : 'jobName',
					width : 200,
					align : "center"
				}, {
					name : 'typeName',
					index : 'typeName',
					width : 200,
					align : "center"
				}, {
					name : 'jobRequire',
					index : 'jobRequire',
					width : 200,
					align : "center"
				}, {
					name : 'jobPlace',
					index : 'jobPlace',
					width : 200,
					align : "center"
				}, {
					name : 'jobSalary',
					index : 'jobSalary',
					width : 200,
					align : "center"
				}, {
					name : 'jobTel',
					index : 'jobTel',
					width : 200,
					align : "center"
				}, {
					name : 'jobTime',
					index : 'jobTime',
					width : 200,
					align : "center"
				}, {
					name : 'jobRemark',
					index : 'jobRemark',
					width : 200,
					align : "center"
				} ],
				rowNum : 10,// 一页显示多少条
				rowList : [ 10, 20, 1000 ],// 可供用户选择一页显示多少条
				rownumbers : true,
				hidegrid : false,
				pager : '#pager2',// 表格页脚的占位符(一般是div)的id
				sortname : 'id',// 初始化的时候排序的字段
				sortorder : "asc",// 排序方式,可选desc,asc
				mtype : "post",// 向后台请求数据的ajax的类型。可选post,get
				viewrecords : true,
				height : $(window).height() - 140,
				autowidth : true,
				multiselect : true,
				jsonReader : {
					root : "dataList",
					page : "currPage",
					total : "totalpages", // 很重要 定义了 后台分页参数的名字。
					records : "totalCount",
					repeatitems : false,
					id : "id"
				},
				prmNames : {
					page : "page",
					rows : "limit",
					order : "order"
				},
				gridComplete : function() {
					// 隐藏grid底部滚动条
					$("#list2").closest(".ui-jqgrid-bdiv").css({
						"overflow-x" : "hidden"
					});
				}
			});
	// postData : {
	// "jobName" : "jins",
	// "jobType" :
	// }
	// caption : "个人发布记录"// 表格的标题名字

	/* 创建jqGrid的操作按钮容器 */
	/* 可以控制界面上增删改查的按钮是否显示 */
	// jQuery("#list2").jqGrid('navGrid', '#pager2', {
	// edit : false,
	// add : false,
	// del : false
	// });
}

var vm = new Vue({
	el : "#selfPublish",
	data : {
		showPublish : true,
		q : {
			jobName : null,
			jobType : null
		},
		entity : {
			id : null,
			jobName : null,
			jobType : null,
			jobRequire : null,
			jobPlace : null,
			jobSalary : null,
			jobTel : null,
			jobTime : null,
			jobRemark : null,
			userId : null
		}
	},
	methods : {
		query : function() {
			vm.reload()
		},
		reload : function(event) {
			vm.showPublish = true;
			var page = $("#list2").jqGrid('getGridParam', 'page');
			$("#list2").jqGrid('setGridParam', {
				postData : {
					'jobName' : vm.q.jobName,
					'jobType' : vm.q.jobType
				},
				page : page
			}).trigger("reloadGrid");
		},
		employee : function() {
			var id = $('#list2').jqGrid('getGridParam', 'selrow');
			if (!id) {
				return;
			}
			layui.use('layer', function() {
				var layer = layui.layer;
				var layerView = layer.open({
					type : 2,
					offset : 'auto',
					skin : 'layui-layer-molv',
					title : "应聘人员",
					area : [ '500px', '350px' ],
					scrollbar : false,
					shade : 0.3,
					shadeClose : true,
					resize : false,
					content : 'selfPublishDeal.html?' + id,
					end : function() {
						layer.close(layerView);
					}
				});
			});
		},
		update : function() {
			var id = $('#list2').jqGrid('getGridParam', 'selrow');
			if (!id)
				return;
			$.get("/job/findById/" + id, function(r) {
				vm.entity = r;
			});
			vm.showPublish = false;
		},
		doUpdate : function() {
			$.ajax({
				type : 'post',
				url : '/job/update',
				contentType : 'application/json',
				datatype : "json",
				data : JSON.stringify(vm.entity),
				success : function(r) {
					if (r = "success") {
						alert('修改成功');
					}
					vm.showPublish = true;
				},
				error : function(XMLHttpRequest) {
					alert(XMLHttpRequest.status)
				}
			})
		},
		del : function() {
			var ids = $('#list2').jqGrid('getGridParam', 'selarrrow');
			if (!ids) {
				alert('请选择一条数据');
				return;
			}
			layer.confirm('确认删除？', {
				btn : [ '确定', '取消' ],
				title : '提示'
			}, function() {
				var index = layer.load(0, {
					shade : false
				});
				// alert('confirm');
				$.ajax({
					type : 'post',
					url : '/job/delete',
					contentType : 'application/json',
					data : JSON.stringify(ids),
					success : function() {
						location.reload();
					},
					error : function(XMLHttpRequest) {
						alert(XMLHttpRequest.status)
					}
				});
			});
		},
		initTime : function() {
			$('#jobTime').datetimepicker({
				format : "yyyy-mm-dd hh:ii:ss",
				language : 'zh-CN',
				weekStart : 1,
				todayBtn : 1,
				autoclose : 1,
				todayHighlight : true,
				startView : 2,
				minView : 0,
				forceParse : 1,
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
		this.initTime();
	}
});

function backReload() {
	vm.reload();
}
layui.use('element', function() {
	var element = layui.element;

});