<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
	<head></head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>会员注册</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
		
		<!-- 引入自定义css文件 style.css -->
		<link rel="stylesheet" href="css/style.css" type="text/css"/>

<style>
  body{
   margin-top:20px;
   margin:0 auto;
 }
 .carousel-inner .item img{
	 width:100%;
	 height:300px;
 }
.navbar-inverse{
	           background-color: #400d0d;
	       }
 
font {
    color: #3164af;
    font-size: 18px;
    font-weight: normal;
    padding: 0 10px;
}
.error{
  color:red;
}
 </style>
</head>
<body>




			<!--
            	描述：菜单栏
            -->
			<%@include file="head.jsp" %>




<div class="container" style="width:100%;background:url('${pageContext.request.contextPath}/img/regist_bg.jpg');">
<div class="row"> 

	<div class="col-md-2"></div>
	
	


	<div class="col-md-8" style="background:#fff;padding:40px 80px;margin:30px;border:7px solid #ccc;">
		<font>会员注册</font>USER REGISTER
		<form class="form-horizontal" id="foms" method="post"  action="reg" style="margin-top:5px;">
			 
			 <input type="hidden" name="method" value="register">
			 <div class="form-group">
			    <label for="username" class="col-sm-2 control-label">用户名</label>
			    <div class="col-sm-6">
			      <input type="text" onkeyup="checknull()"  onblur="ajaxByname()" name="username" class="form-control" id="username" placeholder="请输入用户名">
			      <span  id="sp" style="color:red"></span>
			    </div>
			  </div>
			   <div class="form-group">
			    <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
			    <div class="col-sm-6">
			      <input type="password" name="password" class="form-control" id="inputPassword3" placeholder="请输入密码">
			    </div>
			  </div>
			   <div class="form-group">
			    <label for="confirmpwd" class="col-sm-2 control-label">确认密码</label>
			    <div class="col-sm-6">
			      <input type="password"  name="repassword" class="form-control" id="confirmpwd" placeholder="请输入确认密码">
			    </div>
			  </div> 
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <input type="submit"  width="100" value="注册" name="submit" border="0"
				    style="background: url('${pageContext.request.contextPath}/img/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);
				    height:35px;width:100px;color:white;">
			    </div>
			  </div>
			</form>
	</div>
	
	<div class="col-md-2"></div>
  
</div>
</div>

	  
	
	<div style="margin-top:50px;">
			<img src="${pageContext.request.contextPath}/img/footer.jpg" width="100%" height="78" alt="我们的优势" title="我们的优势" />
		</div>

		<div style="text-align: center;margin-top: 5px;">
			<ul class="list-inline">
				<li><a>关于我们</a></li>
				<li><a>联系我们</a></li>
				<li><a>招贤纳士</a></li>
				<li><a>法律声明</a></li>
				<li><a>友情链接</a></li>
				<li><a>支付方式</a></li>
				<li><a>配送方式</a></li>
				<li><a>服务声明</a></li>
				<li><a>广告声明</a></li>
			</ul>
		</div>
		<div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
			Copyright &copy;  京东商城 版权所有
		</div>

</body>
<script src="${pageContext.request.contextPath}/js/jquery.validate.js" type="text/javascript"></script>
<script src="${pageContext.request.contextPath}/js/messages_zh.js" type="text/javascript"></script>
<script type="text/javascript">
   $(function(){
	   
	   $("#foms"). validate({   
		   rules:{
			    username:{required:true},
			    password:{required:true},
			    repassword:{equalTo:"#inputPassword3"}
		   },
		   messages:{
			   username:{required:"你是不是傻,用户不能为空"},
			   password:{required:"你疯了,密码不能空"},
			   repassword:{equalTo:"密码都不一样，你脑残啊"}
		   }
	   }) 
	  
   })
   //键盘离开
   function checknull(){
	   
	   var vals = $("#username").val();
	   if(vals==null || $.trim(vals)=="" ){
		   $("#sp").html("");  
 
	   }
   }
   
   function ajaxByname(){
	  
	   var vals = $("#username").val();
	   if(vals==null || $.trim(vals)=="" ){
		   $("#sp").html("");  
		   return   
	   }
	    $.post("${pageContext.request.contextPath}/UserServlet",
			   {method:"ajaxByname",username:vals},
			   function(data){
				  if(data){/* data是true 可以使用*/
					  $("#sp").html("");  
				  }else{ /* 否则不可以使用 */
					$("#sp").html("用户名已经被人注册了");  
				  }
				   
			   },"json") 
   }

</script>
</html>
