/**
 * 
 */

/**
 * 初始化表单
 * 
 * @param status
 * @returns
 */
function initForm(status) {
	if (status == 0) {
		$("#student_form").attr("action", "add");
		$("#student_submit").text("添加");
		$("#form_tile").text("添加学生");
	} else if (status == 1) {
		$("#student_form").attr("action", "update");
		$("#student_submit").text("修改");
		$("#form_tile").text("修改学生");
	}
	else if (status == 2) {
		$("#student_submit").hide();
		$("#student_reset").hide();
		$("input").attr("readonly", true).removeClass("form-control").addClass(
				"form-control-plaintext");
		$("#form_tile").text("学生详情");
	}
}