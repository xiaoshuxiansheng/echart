/*----------------------饼状图-----------------------*/
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
//环形图
(function(){
	var Str=mGet("chart/getnewvisitor");
	 obj =JSON.parse(Str);//将字符串变为json对象
	 var sum0=obj[0].monday+ obj[0].tuesday + obj[0].wednesday +obj[0].thursday+ obj[0].friday + obj[0].saturday + obj[0].sunday;
	 var sum1=obj[1].monday+ obj[1].tuesday + obj[1].wednesday +obj[1].thursday+ obj[1].friday + obj[1].saturday + obj[1].sunday;
	 var sum2=obj[2].monday+ obj[2].tuesday + obj[2].wednesday +obj[2].thursday+ obj[2].friday + obj[2].saturday + obj[2].sunday;
	 var sum3=obj[3].monday+ obj[3].tuesday + obj[3].wednesday +obj[3].thursday+ obj[3].friday + obj[3].saturday + obj[3].sunday;
	 var sum4=obj[4].monday+ obj[4].tuesday + obj[4].wednesday +obj[4].thursday+ obj[4].friday + obj[4].saturday + obj[4].sunday;
var pie1 = echarts.init(document.getElementById("pie1"));

option = {
	
	title : {
		text: "一周总访问量环形图",
		x: 'center'
	},
	
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b}: {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        x: 'left',
        data:['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
    },
    series: [
        {
            name:'访问来源',
            type:'pie',
            radius: ['50%', '70%'],
            avoidLabelOverlap: false,
            label: {
                normal: {
                    show: false,
                    position: 'center'
                },
                emphasis: {
                    show: true,
                    textStyle: {
                        fontSize: '30',
                        fontWeight: 'bold'
                    }
                }
            },
            labelLine: {
                normal: {
                    show: false
                }
            },
            data:[
                {value:sum0, name:'直接访问'},
                {value:sum1, name:'邮件营销'},
                {value:sum2, name:'联盟广告'},
                {value:sum3, name:'视频广告'},
                {value:sum4, name:'搜索引擎'}
            ]
        }
    ]
};

pie1.setOption(option);
})();


//嵌套环形图
(function(){
	
var pie2 = echarts.init(document.getElementById("pie2"));

option = {
	
	title : {
		text: "环形图",
		x: 'center'
	},
	
    tooltip: {
        trigger: 'item',
        formatter: "{a} <br/>{b}: {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        x: 'left',
        data:['直达','营销广告','搜索引擎','邮件营销','联盟广告','视频广告','百度','谷歌','必应','其他']
    },
    series: [
        {
            name:'访问来源',
            type:'pie',
            selectedMode: 'single',
            radius: [0, '30%'],

            label: {
                normal: {
                    position: 'inner'
                }
            },
            labelLine: {
                normal: {
                    show: false
                }
            },
            data:[
                {value:335, name:'直达', selected:true},
                {value:679, name:'营销广告'},
                {value:1548, name:'搜索引擎'}
            ]
        },
        {
            name:'访问来源',
            type:'pie',
            radius: ['40%', '55%'],

            data:[
                {value:335, name:'直达'},
                {value:310, name:'邮件营销'},
                {value:234, name:'联盟广告'},
                {value:135, name:'视频广告'},
                {value:1048, name:'百度'},
                {value:251, name:'谷歌'},
                {value:147, name:'必应'},
                {value:102, name:'其他'}
            ]
        }
    ]
};
pie2.setOption(option);
})();


//饼状图
(function(){
	
var pie3 = echarts.init(document.getElementById("pie3"));

option = {
    title : {
        text: '某站点用户访问来源',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        orient: 'vertical',
        left: 'left',
        data: ['直接访问','邮件营销','联盟广告','视频广告','搜索引擎']
    },
    series : [
        {
            name: '访问来源',
            type: 'pie',
            radius : '55%',
            center: ['50%', '60%'],
            data:[
                {value:335, name:'直接访问'},
                {value:310, name:'邮件营销'},
                {value:234, name:'联盟广告'},
                {value:135, name:'视频广告'},
                {value:1548, name:'搜索引擎'}
            ],
            itemStyle: {
                emphasis: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }
    ]
};

pie3.setOption(option);
})();


//南丁格尔玫瑰图
(function(){
	
var pie4 = echarts.init(document.getElementById("pie4"));

option = {
    title : {
        text: '南丁格尔玫瑰图',
        x:'center'
    },
    tooltip : {
        trigger: 'item',
        formatter: "{a} <br/>{b} : {c} ({d}%)"
    },
    legend: {
        x : 'center',
        y : 'bottom',
        data:['rose1','rose2','rose3','rose4','rose5','rose6','rose7','rose8']
    },
    toolbox: {
        show : true,
        feature : {
            mark : {show: true},
            dataView : {show: true, readOnly: false},
            magicType : {
                show: true,
                type: ['pie', 'funnel']
            },
            restore : {show: true},
            saveAsImage : {show: true}
        }
    },
    calculable : true,
    series : [
        {
            name:'半径模式',
            type:'pie',
            radius : [20, 110],
            center : ['25%', '50%'],
            roseType : 'radius',
            label: {
                normal: {
                    show: false
                },
                emphasis: {
                    show: true
                }
            },
            lableLine: {
                normal: {
                    show: false
                },
                emphasis: {
                    show: true
                }
            },
            data:[
                {value:10, name:'rose1'},
                {value:5, name:'rose2'},
                {value:15, name:'rose3'},
                {value:25, name:'rose4'},
                {value:20, name:'rose5'},
                {value:35, name:'rose6'},
                {value:30, name:'rose7'},
                {value:40, name:'rose8'}
            ]
        },
        {
            name:'面积模式',
            type:'pie',
            radius : [30, 110],
            center : ['75%', '50%'],
            roseType : 'area',
            data:[
                {value:10, name:'rose1'},
                {value:5, name:'rose2'},
                {value:15, name:'rose3'},
                {value:25, name:'rose4'},
                {value:20, name:'rose5'},
                {value:35, name:'rose6'},
                {value:30, name:'rose7'},
                {value:40, name:'rose8'}
            ]
        }
    ]
};

pie4.setOption(option);
})();