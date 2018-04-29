/*----------------------柱状图-----------------------*/
function mGet(url){
	var xmlhttp;
	var Str;
	if (window.XMLHttpRequest)
	  {// code for IE7+, Firefox, Chrome, Opera, Safari
	  xmlhttp=new XMLHttpRequest();
	  }
	else
	  {// code for IE6, IE5
	  xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	  }
	xmlhttp.onreadystatechange=getdata;
	function getdata(){
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
	    {
	
			Str=xmlhttp.responseText;

	    }
	}
	xmlhttp.open("GET",url,false);
	xmlhttp.send();
	return Str;
}

//坐标轴刻度与标签对齐
(function(){
	
var columnar1 = echarts.init(document.getElementById("columnar1"));

option = {
	
	title: {
		text: "柱状图",
		x:'left'
	},
	
    color: ['#3398DB'],
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    toolbox: {
        feature: {
            saveAsImage: {}
        }
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis : [
        {
            type : 'category',
            data : ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
            axisTick: {
                alignWithLabel: true
            }
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:'直接访问',
            type:'bar',
            barWidth: '60%',
            data:[10, 52, 200, 334, 390, 330, 220]
        }
    ]
};

columnar1.setOption(option);
})();



//堆叠条形图
(function(){
	var Str=mGet("chart/getnewvisitor");
	 obj =JSON.parse(Str);//将字符串变为json对象
var columnar2 = echarts.init(document.getElementById("columnar2"));

option = {
	
	title : {
		text: "堆叠条形图",
		x:'left'
	},
	
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
        data: ['直接访问', '邮件营销','联盟广告','视频广告','搜索引擎'],
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis:  {
        type: 'value'
    },
    yAxis: {
        type: 'category',
        data: ['周一','周二','周三','周四','周五','周六','周日']
    },
    series: [
        {
            name: '直接访问',
            type: 'bar',
            stack: '总量',
            label: {
                normal: {
                    show: true,
                    position: 'insideRight'
                }
            },
            data: [obj[0].monday, obj[0].tuesday , obj[0].wednesday ,obj[0].thursday, obj[0].friday , obj[0].saturday , obj[0].sunday]
        },
        {
            name: '邮件营销',
            type: 'bar',
            stack: '总量',
            label: {
                normal: {
                    show: true,
                    position: 'insideRight'
                }
            },
            data: [obj[1].monday, obj[1].tuesday , obj[1].wednesday ,obj[1].thursday, obj[1].friday , obj[1].saturday , obj[1].sunday]
        },
        {
            name: '联盟广告',
            type: 'bar',
            stack: '总量',
            label: {
                normal: {
                    show: true,
                    position: 'insideRight'
                }
            },
            data: [obj[2].monday, obj[2].tuesday , obj[2].wednesday ,obj[2].thursday, obj[2].friday , obj[2].saturday , obj[2].sunday]
        },
        {
            name: '视频广告',
            type: 'bar',
            stack: '总量',
            label: {
                normal: {
                    show: true,
                    position: 'insideRight'
                }
            },
            data: [obj[3].monday, obj[3].tuesday , obj[3].wednesday ,obj[3].thursday, obj[3].friday , obj[3].saturday , obj[3].sunday]
        },
        {
            name: '搜索引擎',
            type: 'bar',
            stack: '总量',
            label: {
                normal: {
                    show: true,
                    position: 'insideRight'
                }
            },
            data: [obj[4].monday, obj[4].tuesday , obj[4].wednesday ,obj[4].thursday, obj[4].friday , obj[4].saturday , obj[4].sunday]
        }
    ]
};

columnar2.setOption(option);
})();


//正负条形图
(function(){
	var Str=mGet("chart/getnewie");
	 obj =JSON.parse(Str);//将字符串变为json对象
var columnar3 = echarts.init(document.getElementById("columnar3"));

option = {
	
	title : {
		text: "正负条形图",
		x:'left'
	},
	
    tooltip : {
        trigger: 'axis',
        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
        }
    },
    legend: {
        data:['利润', '支出', '收入']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    xAxis : [
        {
            type : 'value'
        }
    ],
    yAxis : [
        {
            type : 'category',
            axisTick : {show: false},
            data : ['周一','周二','周三','周四','周五','周六','周日']
        }
    ],
    series : [
        {
            name:'利润',
            type:'bar',
            label: {
                normal: {
                    show: true,
                    position: 'inside'
                }
            },
            data:[obj[0].monday, obj[0].tuesday , obj[0].wednesday ,obj[0].thursday, obj[0].friday , obj[0].saturday , obj[0].sunday]
        },
        {
            name:'收入',
            type:'bar',
            stack: '总量',
            label: {
                normal: {
                    show: true
                }
            },
            data:[obj[1].monday, obj[1].tuesday , obj[1].wednesday ,obj[1].thursday, obj[1].friday , obj[1].saturday , obj[1].sunday]
        },
        {
            name:'支出',
            type:'bar',
            stack: '总量',
            label: {
                normal: {
                    show: true,
                    position: 'left'
                }
            },
            data:[obj[2].monday, obj[2].tuesday , obj[2].wednesday ,obj[2].thursday, obj[2].friday , obj[2].saturday , obj[2].sunday]
        }
    ]
};


columnar3.setOption(option);
})();


//折柱混合
(function(){
	var Str=mGet("chart/getnewenvironment");
	 obj =JSON.parse(Str);//将字符串变为json对象
var columnar4 = echarts.init(document.getElementById("columnar4"));


option = {
	
	title : {
		text: "折柱混合",
		x: "left"
	},
	
    tooltip: {
        trigger: 'axis'
    },
    toolbox: {
        feature: {
            saveAsImage: {show: true}
        }
    },
    legend: {
        data:['蒸发量','降水量','平均温度']
    },
    xAxis: [
        {
            type: 'category',
            data: ['1月','2月','3月','4月','5月','6月','7月','8月','9月','10月','11月','12月']
        }
    ],
    yAxis: [
        {
            type: 'value',
            name: '水量',
            min: 0,
            max: 250,
            interval: 50,
            axisLabel: {
                formatter: '{value} ml'
            }
        },
        {
            type: 'value',
            name: '温度',
            min: 0,
            max: 25,
            interval: 5,
            axisLabel: {
                formatter: '{value} °C'
            }
        }
    ],
    series: [
        {
            name:'蒸发量',
            type:'bar',
            data:[obj[0].january, obj[0].january, obj[0].march, obj[0].april, obj[0].may, obj[0].june, obj[0].july, obj[0].august, obj[0].september, obj[0].october, obj[0].november, obj[0].december]
        },
        {
            name:'降水量',
            type:'bar',
            data:[obj[1].january, obj[1].january, obj[1].march, obj[1].april, obj[1].may, obj[1].june, obj[1].july, obj[1].august, obj[1].september, obj[1].october, obj[1].november, obj[1].december]
        },
        {
            name:'平均温度',
            type:'line',
            yAxisIndex: 1,
            data:[obj[2].january, obj[2].january, obj[2].march, obj[2].april, obj[2].may, obj[2].june, obj[2].july, obj[2].august, obj[2].september, obj[2].october, obj[2].november, obj[2].december]
        }
    ]
};




columnar4.setOption(option);
})();
