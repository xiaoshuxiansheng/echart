/*----------------------折线图-----------------------*/
//折线图堆叠

function test1() {
	var Str="你好";
	function mSend() {
		return Str;
	}
	return mSend();
}

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
(function(){
	var Str=mGet("chart/getnewvisitor");
	 obj =JSON.parse(Str);//将字符串变为json对象
	 
	var myChart = echarts.init(document.getElementById("Stack"));
	
	option = {
    title: {
        text: '折线图堆叠'
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data:['邮件营销','联盟广告','视频广告','直接访问','搜索引擎']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    toolbox: {
        feature: {
            saveAsImage: {}
        }
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: ['周一','周二','周三','周四','周五','周六','周日']
    },
    yAxis: {
        type: 'value'
    },
    series: [
        {
            name:obj[0].type,
            type:'line',
            stack: '总量',
            data:[obj[0].monday, obj[0].tuesday , obj[0].wednesday ,obj[0].thursday, obj[0].friday , obj[0].saturday , obj[0].sunday]
        },
        {
            name:obj[1].type,
            type:'line',
            stack: '总量',
            data:[obj[1].monday, obj[1].tuesday, obj[1].wednesday, obj[1].thursday,obj[1].friday, obj[1].saturday,obj[1].sunday]
        },
        {
            name:obj[2].type,
            type:'line',
            stack: '总量',
            data:[obj[2].monday,  obj[2].tuesday, obj[2].wednesday, obj[2].thursday,obj[2].friday, obj[2].saturday, obj[2].sunday]
        },
        {
            name:obj[3].type,
            type:'line',
            stack: '总量',
            data:[obj[3].monday, obj[3].tuesday, obj[3].wednesday, obj[3].thursday, obj[3].friday, obj[3].saturday, obj[3].sunday]
        },
        {
            name:obj[4].type,
            type:'line',
            stack: '总量',
            data:[obj[4].monday, obj[4].tuesday, obj[4].wednesday, obj[4].thursday, obj[4].friday, obj[4].saturday, obj[4].sunday]
        }
    ]
};

myChart.setOption(option);
})();


//堆叠区域图
(function(){
	var Str=mGet("chart/getnewvisitor");
	 obj =JSON.parse(Str);//将字符串变为json对象
	 
	var area = echarts.init(document.getElementById("area"));
	
	option = {
    title: {
        text: '堆叠区域图'
    },
    tooltip : {
        trigger: 'axis'
    },
    legend: {
        data:['邮件营销','联盟广告','视频广告','直接访问','搜索引擎']
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
            boundaryGap : false,
            data : ['周一','周二','周三','周四','周五','周六','周日']
        }
    ],
    yAxis : [
        {
            type : 'value'
        }
    ],
    series : [
        {
            name:obj[0].type,
            type:'line',
            stack: '总量',
            areaStyle: {normal: {}},
            data:[obj[0].monday, obj[0].tuesday, obj[0].wednesday, obj[0].thursday, obj[0].friday, obj[0].saturday, obj[0].sunday]
        },
        {
            name:obj[1].type,
            type:'line',
            stack: '总量',
            areaStyle: {normal: {}},
            data:[obj[1].monday, obj[1].tuesday, obj[1].wednesday, obj[1].thursday, obj[1].friday, obj[1].saturday, obj[1].sunday]
        },
        {
            name:obj[2].type,
            type:'line',
            stack: '总量',
            areaStyle: {normal: {}},
            data:[obj[2].monday, obj[2].tuesday, obj[2].wednesday, obj[2].thursday, obj[2].friday, obj[2].saturday, obj[2].sunday]
        },
        {
            name:obj[3].type,
            type:'line',
            stack: '总量',
            areaStyle: {normal: {}},
            data:[obj[3].monday, obj[3].tuesday, obj[3].wednesday, obj[3].thursday, obj[3].friday, obj[3].saturday, obj[3].sunday]
        },
        {
            name:obj[4].type,
            type:'line',
            stack: '总量',
            label: {
                normal: {
                    show: true,
                    position: 'top'
                }
            },
            areaStyle: {normal: {}},
            data:[obj[4].monday, obj[4].tuesday, obj[4].wednesday, obj[4].thursday, obj[4].friday, obj[4].saturday, obj[4].sunday]
        }
    ]
};

area.setOption(option);
})();


//对数轴
(function(){
	var Str=mGet("chart/getnewstep");
	 obj =JSON.parse(Str);//将字符串变为json对象
	var step = echarts.init(document.getElementById("step"));
	
	option = {
    title: {
        text: 'Step Line'
    },
    tooltip: {
        trigger: 'axis'
    },
    legend: {
        data:['Step Start', 'Step Middle', 'Step End']
    },
    grid: {
        left: '3%',
        right: '4%',
        bottom: '3%',
        containLabel: true
    },
    toolbox: {
        feature: {
            saveAsImage: {}
        }
    },
    xAxis: {
        type: 'category',
        data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
    },
    yAxis: {
        type: 'value'
    },
    series: [
        {
            name:'Step Start',
            type:'line',
            step: 'start',
            data:[obj[0].monday, obj[0].tuesday, obj[0].wednesday, obj[0].thursday, obj[0].friday, obj[0].saturday, obj[0].sunday]
        },
        {
            name:'Step Middle',
            type:'line',
            step: 'middle',
            data:[obj[1].monday, obj[1].tuesday, obj[1].wednesday, obj[1].thursday, obj[1].friday, obj[1].saturday, obj[1].sunday]
        },
        {
            name:'Step End',
            type:'line',
            step: 'end',
            data:[obj[2].monday, obj[2].tuesday, obj[2].wednesday, obj[2].thursday, obj[2].friday, obj[2].saturday, obj[2].sunday]
        }
    ]
};

step.setOption(option);
})();


//大数据量面积图
(function(){
	var shuju = echarts.init(document.getElementById("shuju"));
	
	var base = +new Date(1968, 9, 3);
var oneDay = 24 * 3600 * 1000;
var date = [];

var data = [Math.random() * 300];

for (var i = 1; i < 20000; i++) {
    var now = new Date(base += oneDay);
    date.push([now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'));
    data.push(Math.round((Math.random() - 0.5) * 20 + data[i - 1]));
}

option = {
    tooltip: {
        trigger: 'axis',
        position: function (pt) {
            return [pt[0], '10%'];
        }
    },
    title: {
        left: 'center',
        text: '大数据量面积图',
    },
    legend: {
        top: 'bottom',
        data:['意向']
    },
    toolbox: {
        feature: {
            dataZoom: {
                yAxisIndex: 'none'
            },
            restore: {},
            saveAsImage: {}
        }
    },
    xAxis: {
        type: 'category',
        boundaryGap: false,
        data: date
    },
    yAxis: {
        type: 'value',
        boundaryGap: [0, '100%']
    },
    dataZoom: [{
        type: 'inside',
        start: 0,
        end: 10
    }, {
        start: 0,
        end: 10,
        handleIcon: 'M10.7,11.9v-1.3H9.3v1.3c-4.9,0.3-8.8,4.4-8.8,9.4c0,5,3.9,9.1,8.8,9.4v1.3h1.3v-1.3c4.9-0.3,8.8-4.4,8.8-9.4C19.5,16.3,15.6,12.2,10.7,11.9z M13.3,24.4H6.7V23h6.6V24.4z M13.3,19.6H6.7v-1.4h6.6V19.6z',
        handleSize: '80%',
        handleStyle: {
            color: '#fff',
            shadowBlur: 3,
            shadowColor: 'rgba(0, 0, 0, 0.6)',
            shadowOffsetX: 2,
            shadowOffsetY: 2
        }
    }],
    series: [
        {
            name:'模拟数据',
            type:'line',
            smooth:true,
            symbol: 'none',
            sampling: 'average',
            itemStyle: {
                normal: {
                    color: 'rgb(255, 70, 131)'
                }
            },
            areaStyle: {
                normal: {
                    color: new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                        offset: 0,
                        color: 'rgb(255, 158, 68)'
                    }, {
                        offset: 1,
                        color: 'rgb(255, 70, 131)'
                    }])
                }
            },
            data: data
        }
    ]
};
	
	shuju.setOption(option);
})();



//动态数据+时间坐标轴
(function(){
	
	var trends = echarts.init(document.getElementById("trends"));
	
	function randomData() {
    now = new Date(+now + oneDay);
    value = value + Math.random() * 21 - 10;
    return {
        name: now.toString(),
        value: [
            [now.getFullYear(), now.getMonth() + 1, now.getDate()].join('/'),
            Math.round(value)
        ]
    }
}

var data = [];
var now = +new Date(1997, 9, 3);
var oneDay = 24 * 3600 * 1000;
var value = Math.random() * 1000;
for (var i = 0; i < 1000; i++) {
    data.push(randomData());
}

option = {
    title: {
        text: '动态数据 + 时间坐标轴'
    },
    tooltip: {
        trigger: 'axis',
        formatter: function (params) {
            params = params[0];
            var date = new Date(params.name);
            return date.getDate() + '/' + (date.getMonth() + 1) + '/' + date.getFullYear() + ' : ' + params.value[1];
        },
        axisPointer: {
            animation: false
        }
    },
    xAxis: {
        type: 'time',
        splitLine: {
            show: false
        }
    },
    yAxis: {
        type: 'value',
        boundaryGap: [0, '100%'],
        splitLine: {
            show: false
        }
    },
    series: [{
        name: '模拟数据',
        type: 'line',
        showSymbol: false,
        hoverAnimation: false,
        data: data
    }]
};

	timeTicket = setInterval(function () {
	
	    for (var i = 0; i < 5; i++) {
	        data.shift();
	        data.push(randomData());
	    }
	
	    trends.setOption({
	        series: [{
	            data: data
	        }]
	    });
	}, 1000);

trends.setOption(option);
})();




/*----------------------柱状图-----------------------*/
//坐标轴刻度与标签对齐




















////柱状图
//(function(){
//	
//var myChart = echarts.init(document.getElementById("histogram"));
//
//option = {
//	
//	title: {
//		text: "柱状图",
//		x:'center'
//	},
//	
//  color: ['#3398DB'],
//  tooltip : {
//      trigger: 'axis',
//      axisPointer : {            // 坐标轴指示器，坐标轴触发有效
//          type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
//      }
//  },
//  toolbox: {
//      feature: {
//          saveAsImage: {}
//      }
//  },
//  grid: {
//      left: '3%',
//      right: '4%',
//      bottom: '3%',
//      containLabel: true
//  },
//  xAxis : [
//      {
//          type : 'category',
//          data : ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
//          axisTick: {
//              alignWithLabel: true
//          }
//      }
//  ],
//  yAxis : [
//      {
//          type : 'value'
//      }
//  ],
//  series : [
//      {
//          name:'直接访问',
//          type:'bar',
//          barWidth: '60%',
//          data:[10, 52, 200, 334, 390, 330, 220]
//      }
//  ]
//};
//
//myChart.setOption(option);
//})();
//
//
////折线图
//(function(){
//	
//	var line = echarts.init(document.getElementById("line"));
//	
//	option = {
//  title: {
//      text: '堆叠区域图',
//      x:'center'
//  },
//  tooltip : {
//      trigger: 'axis'
//  },
//  
//  toolbox: {
//      feature: {
//          saveAsImage: {}
//      }
//  },
//  grid: {
//      left: '3%',
//      right: '4%',
//      bottom: '3%',
//      containLabel: true
//  },
//  xAxis : [
//      {
//          type : 'category',
//          boundaryGap : false,
//          data : ['周一','周二','周三','周四','周五','周六','周日']
//      }
//  ],
//  yAxis : [
//      {
//          type : 'value'
//      }
//  ],
//  series : [
//      
//      {
//          name:'联盟广告',
//          type:'line',
//          stack: '总量',
//          areaStyle: {normal: {}},
//          data:[220, 182, 191, 234, 290, 330, 310]
//      },
//      {
//          name:'视频广告',
//          type:'line',
//          stack: '总量',
//          areaStyle: {normal: {}},
//          data:[150, 232, 201, 154, 190, 330, 410]
//      },
//      {
//          name:'直接访问',
//          type:'line',
//          stack: '总量',
//          areaStyle: {normal: {}},
//          data:[320, 332, 301, 334, 390, 330, 320]
//      },
//      {
//          name:'搜索引擎',
//          type:'line',
//          stack: '总量',
//          label: {
//              normal: {
//                  show: true,
//                  position: 'top'
//              }
//          },
//          areaStyle: {normal: {}},
//          data:[820, 932, 901, 934, 1290, 1330, 1320]
//      }
//  ]
//};
//
//line.setOption(option);
//})();
//
//
////饼状图
//(function(){
//
//	var pie = echarts.init(document.getElementById("pie"));
//	
//	option = {
//  title : {
//      text: '饼状图',
//      subtext: '纯属虚构',
//      x:'center'
//  },
//  tooltip : {
//      trigger: 'item',
//      formatter: "{a} <br/>{b} : {c} ({d}%)"
//  },
//  toolbox: {
//      feature: {
//          saveAsImage: {}
//      }
//  },
//  legend: {
//      orient: 'vertical',
//      left: 'left',
//      data: ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
//  },
//  series : [
//      {
//          name: '访问来源',
//          type: 'pie',
//          radius : '55%',
//          center: ['50%', '60%'],
//          data:[
//              {value:335, name:'直接访问'},
//              {value:310, name:'邮件营销'},
//              {value:234, name:'联盟广告'},
//              {value:135, name:'视频广告'},
//              {value:1548, name:'搜索引擎'}
//          ],
//          itemStyle: {
//              emphasis: {
//                  shadowBlur: 10,
//                  shadowOffsetX: 0,
//                  shadowColor: 'rgba(0, 0, 0, 0.5)'
//              }
//          }
//      }
//  ]
//};
//
//
//pie.setOption(option);
//})();
//
//
////环形图
//(function(){
//	
//	var annular = echarts.init(document.getElementById("annular"));
//	
//
//	option = {
//		
//		title: {
//			text: "环状图",
//			x:'center'
//		},
//		
//	    tooltip: {
//	        trigger: 'item',
//	        formatter: "{a} <br/>{b}: {c} ({d}%)"
//	    },
//	    toolbox: {
//	        feature: {
//	            saveAsImage: {}
//	        }
//	    },
//	    legend: {
//	        orient: 'vertical',
//	        x: 'left',
//	        data:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
//	    },
//	    series: [
//	        {
//	            name:'访问来源',
//	            type:'pie',
//	            radius: ['50%', '70%'],
//	            avoidLabelOverlap: false,
//	            label: {
//	                normal: {
//	                    show: false,
//	                    position: 'center'
//	                },
//	                emphasis: {
//	                    show: true,
//	                    textStyle: {
//	                        fontSize: '30',
//	                        fontWeight: 'bold'
//	                    }
//	                }
//	            },
//	            labelLine: {
//	                normal: {
//	                    show: false
//	                }
//	            },
//	            data:[
//	                {value:335, name:'直接访问'},
//	                {value:310, name:'邮件营销'},
//	                {value:234, name:'联盟广告'},
//	                {value:135, name:'视频广告'},
//	                {value:1548, name:'搜索引擎'}
//	            ]
//	        }
//	    ]
//	};
//
//annular.setOption(option);
//})();
//
