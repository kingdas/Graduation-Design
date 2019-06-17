function delConfirm(id) {
	console.log(id);
	if (window.confirm("     确认删除？")) {
		location.href = "del/" + id;
	}
};

function update(id) {
	location.href = "update/"+id;
}