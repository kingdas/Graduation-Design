var jobId;
$(function pageInit() {
	// 创建jqGrid组件
	var str = location.href; // 取得整个地址栏
	var num = str.indexOf("?");
	jobId = str.substr(num + 1);
	jQuery("#list2").jqGrid({
		url : '/job/publishDeal/' + jobId,// 组件创建完成之后请求数据的url
		datatype : "json",// 请求数据返回的类型。可选json,xml,txt
		colNames : [ '', '姓名', '性别', '年龄', '学历', '经验', '联系电话' ],// jqGrid的列显示名字
		colModel : [ // jqGrid每一列的配置信息。包括名字，索引，宽度,对齐方式.....
		{
			label : 'id',
			name : 'id',
			index : "id",
			width : 30,
			key : true,
			hidden : true
		}, {
			name : 'userName',
			index : 'userName',
			width : 200,
			align : "center"
		}, {
			name : 'userSex',
			index : 'userSex',
			width : 200,
			align : "center"
		}, {
			name : 'userAge',
			index : 'userAge',
			width : 200,
			align : "center"
		}, {
			name : 'userDegree',
			index : 'userDegree',
			width : 200,
			align : "center"
		}, {
			name : 'userExp',
			index : 'userExp',
			width : 200,
			align : "center"
		}, {
			name : 'userTel',
			index : 'userTel',
			width : 250,
			align : "center"
		} ],
		rowNum : 10,// 一页显示多少条
		rowList : [ 10, 20, 30 ],// 可供用户选择一页显示多少条
		pager : '#pager2',// 表格页脚的占位符(一般是div)的id
		sortname : 'id',// 初始化的时候排序的字段
		sortorder : "asc",// 排序方式,可选desc,asc
		mtype : "post",// 向后台请求数据的ajax的类型。可选post,get
		viewrecords : true,
		height : $(window).height() - 85,
		autowidth : true,
		multiselect : true,
	// caption : "个人发布记录"// 表格的标题名字
	});
	/* 创建jqGrid的操作按钮容器 */
	/* 可以控制界面上增删改查的按钮是否显示 */
	jQuery("#list2").jqGrid('navGrid', '#pager2', {
		edit : false,
		add : false,
		del : false
	})
})

function back() {
	parent.backReload();
	parent.layer.closeAll();
}
