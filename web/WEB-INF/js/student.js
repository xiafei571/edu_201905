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
		$("select").attr("disabled", true);
	}
}

function initChat(){

	// 饼图
	var myChart2 = echarts.init(document.getElementById('student_main_1'));
	// 显示标题，图例和空的坐标轴
	myChart2.setOption({
		title : {
			text : '出身地分布图',
			subtext : '纯属虚构',
			x : 'center'
		},
		tooltip : {
			trigger : 'item',
			formatter : "{a} <br/>{b} : {c} ({d}%)"
		},

		series : [ {
			name : '地点',
			type : 'pie',
			radius : '55%',
			center : [ '50%', '60%' ],
			data : [],
			itemStyle : {
				emphasis : {
					shadowBlur : 10,
					shadowOffsetX : 0,
					shadowColor : 'rgba(0, 0, 0, 0.5)'
				}
			}
		} ]
	});

	$.ajax({
		url : "chart/loc",
		success : function(result) {
			// 填入数据
			myChart2.setOption({
				series : [ {
					// 根据名字对应到相应的系列
					data : result.res
				} ]
			});
		}
	});

	
}