/**
 * 初始化分页信息
 * 
 * @param pagation
 * @returns
 */
function initPage(pageIndex, pageSize, totalCountPage) {
	// 如果当前页是最后一页的话，下一页置灰
	if (pageIndex == totalCountPage) {
		$("#page_next").addClass("disabled");
	} else {
		$("#page_next").removeClass("disabled");
	}

	// 如果当前页是第一页的话，上一页置灰
	if (pageIndex == 1) {
		$("#page_pre").addClass("disabled");
	} else {
		$("#page_pre").removeClass("disabled");
	}

}

/**
 * 初始化表单
 * 
 * @param status
 * @returns
 */
function initForm(status) {
	if (status == 0) {
		$("#dept_form").attr("action", "add");
		$("#dept_submit").text("添加");
	} else if (status == 1) {
		$("#dept_form").attr("action", "update");
		$("#dept_submit").text("修改");
	}
}