<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script type="text/javascript">

 $(function(){
	 /* [{"cid":"1","cname":"手机数码"},{"cid":"2","cname":"电脑办公"},{"cid":"3","cname":"女装"}] */

	 $.post("${pageContext.request.contextPath}/CategoryServlet",{method:"findcg"},
			 function(data){
		      for(var i in data){
		    	   $("#uls").append("<li><a href='${pageContext.request.contextPath}/ProductServlet?method=findBycid&cid="+data[i].cid+"   '>"+data[i].cname+"</a></li>")
		      }
		 
	 },"json")
 })

</script>
<div class="container-fluid">
	<div class="col-md-4">
		<img src="img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top: 20px">
		<ol class="list-inline">
			<!--如果session中有值 登录状态
					        没有值 。不是登录状态
					      -->

			<c:if test="${empty user}">

				<li><a href="login">登录</a></li>
				<li><a
					href="reg">注册</a></li>
			</c:if>
			<c:if test="${not empty user}">
				<li><a>欢迎:${user.username }</a></li>
				<li><a
					href="logout">退出</a></li>
				<li><a
					href="${pageContext.request.contextPath}/OrdersServlet?method=orderlist">已购买商品</a></li>
			</c:if>
		</ol>
	</div>
</div>
<!--
            	描述：导航条
            -->
<div class="container-fluid">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${pageContext.request.contextPath}">首页</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul  id="uls" class="nav navbar-nav">
					<%-- <li><a href="${pageContext.request.contextPath}/jsp/product_list.jsp">手机数码</a></li>
								<li><a href="#">电脑办公</a></li>
								<li><a href="#">电脑办公</a></li> --%>
					<%-- <c:forEach items="${list }" var="l">
						<li><a href="#">${l.cname }</a></li>
					</c:forEach> --%>
				</ul>

			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
</div>