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

/**
 * 初始化图表
 * 
 * @param status
 * @returns
 */
function initChat() {
	dept_chart_1();
	dept_chart_2();
}

function dept_chart_1() {
	// 基于准备好的dom，初始化echarts实例
	var myChart1 = echarts.init(document.getElementById('dept_main_1'));

	// 指定图表的配置项和数据
	var option = {
		title : {
			text : 'ECharts 入门示例'
		},
		tooltip : {},
		legend : {
			data : [ '销量' ]
		},
		xAxis : {
			data : [ "衬衫", "羊毛衫", "雪纺衫", "裤子", "高跟鞋", "袜子" ]
		},
		yAxis : {},
		series : [ {
			name : '销量',
			type : 'bar',
			data : [ 5, 20, 36, 10, 10, 20 ]
		} ]
	};

	// 使用刚指定的配置项和数据显示图表。
	myChart1.setOption(option);
}

function dept_chart_2() {
	// 饼图
	var myChart2 = echarts.init(document.getElementById('dept_main_2'));
	// 显示标题，图例和空的坐标轴
	myChart2.setOption({
		title : {
			text : '办公地点分布图',
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
