/*$(document).ready(function(){
	alert("success");
});
*/
jQuery(document).ready(function($) {
	var Str=mGet("table/getuser");
	obj=JSON.parse(Str);
	for (var i in obj){
		var tr=
		'<tr>'+
		'<td><input type="checkbox" /></td>'+
		'<td class="td id">'+i+'</td>'+
		'<td>'+obj[i].userId+'</td>'+
		'<td>'+obj[i].userPassword+'</td>'+
		'<td>'+obj[i].userNickname+'</td>'+
		'<td>'+obj[i].userPhone+'</td>'+
		'<td>'+obj[i].userRegtime+'</td>'+
		'<td>'+obj[i].userRegip+'</td>'+
		'<td>'+obj[i].userLtlogip+'</td>'+
		'<td>'+obj[i].userPortraituri+'</td>'+
		'<td>'+
		'<div class="am-btn-toolbar">'+
		'<div class="am-btn-group am-btn-group-xs">'+
		'<button class="am-btn am-btn-default am-btn-xs am-text-secondary edit" type="button"><span class="am-icon-pencil-square-o"></span> 编辑</button>'+
		'<button class="am-btn am-btn-default am-btn-xs am-hide-sm-only copy" type="button"><span class="am-icon-copy"></span> 复制</button>'+
		'<button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only delete " type="button"><span class="am-icon-trash-o"></span> 删除</button>'+
		'</div>'+
		'</div>'+
		'</td>'+
		'</tr>';
		 $("#append").append(tr);
	}
	$('.am-btn.am-btn-default.am-btn-xs.am-text-secondary.edit').click(function(){
		$('.theme-popover-mask').fadeIn(100);
		$('.theme-popover').slideDown(200);
		var i=$(this).parents("tr").find(".td.id").text(); 
		 $(".am-form-field.am-form-field.id").val(obj[i].userId);
		 $(".am-form-field.am-form-field.password").val(obj[i].userPassword);
		 $(".am-form-field.am-form-field.nickname").val(obj[i].userNickname);
		 $(".am-form-field.am-form-field.phone").val(obj[i].userPhone);
		 $(".am-form-field.am-form-field.regtime").val(obj[i].userRegtime);
		 $(".am-form-field.am-form-field.regip").val(obj[i].userRegip);
		 $(".am-form-field.am-form-field.ltlogip").val(obj[i].userLtlogip);
		 $(".am-form-field.am-form-field.portraituri").val(obj[i].userPortraituri);
		
		$('.am-btn.am-btn-primary.am-btn-block').click(function(){
			var mSerialize=$('.am-form.am-form-horizontal.user').serializeArray();
			var json={};
			for (var i in mSerialize){
				json[mSerialize[i].name]=mSerialize[i]['value'];
			}
			$.ajax({
				type:'POST',
				url:'table/updateuser',
				contentType:'application/json;charset=UTF-8',
				data:JSON.stringify(json),
				success:function(data,status){
				    	if (status=="success"){
				    			alert('修改成功');
				    			$('.theme-popover-mask').fadeOut(100);
				    			$('.theme-popover').slideUp(200);
				    			window.location.reload();
				    		
				    	}
				  }	
			});
		})
		 
		$('.theme-poptit .close').click(function(){
			$('.theme-popover-mask').fadeOut(100);
			$('.theme-popover').slideUp(200);

		})
	})
});
//get获取数据
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
/*(function(){
	alert('成功');
	
})();*/

