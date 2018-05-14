<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>会员登录</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css" />
		<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath}/js/bootstrap.min.js" type="text/javascript"></script>
		<!-- 引入自定义css文件 style.css -->
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" type="text/css"/>

		<style>
			body {
				margin-top: 20px;
				margin: 0 auto;
			}
			.navbar-inverse{
	           background-color: #400d0d;
	       }
			.carousel-inner .item img {
				width: 100%;
				height: 300px;
			}
		</style>
	</head>

	<body>

			<!--
            	描述：菜单栏
            -->
			<%@include file="head.jsp" %>
		

		<div class="container">
			<div class="row">

				<div style="margin:0 auto; margin-top:10px;width:950px;">
					<table style="width:100%" > 
					   <tr>
					     <td><strong><h2>已购买商品</h2></strong></td>
					     <td style="text-align: right">
					       <strong>
					         <h2>
					            <a href="${pageContext.request.contextPath }">继续购物</a>
					          </h2>
					        </strong>
					     </td>
					   </tr>
					</table>
				<!-- 	<strong><h2>已购买商品</h2></strong>
					<strong><h2>继续购物</h2></strong> -->
					<table class="table table-bordered">
						<c:forEach  items="${list}" var="l">
						<tbody>
							<tr class="success">
								<th colspan="5">订单编号:${l.oid } </th>
							</tr>
							<tr class="warning">
								<th>图片</th>
								<th>商品</th>
								<th>价格</th>
								<th>数量</th>
								<th>小计</th>
							</tr>
							<tr class="active">
								<td width="60" width="40%">
									<input type="hidden" name="id" value="22">
									<img src="${pageContext.request.contextPath}/${l.oimage}" width="70" height="60">
								</td>
								<td width="30%">
									<a target="_blank">${l.oname }</a>
								</td>
								<td width="20%">
									￥${l.oprice }
								</td>
								<td width="10%">
									${l.ocount }
								</td>
								<td width="15%">
									<span class="subtotal">￥${l.oprice * l.ocount }</span>
								</td>
							</tr>
						</tbody>
						</c:forEach>
					</table>
				</div>
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
				<li><a target="_blank">支付方式</a></li>
				<li><a target="_blank">配送方式</a></li>
				<li><a>服务声明</a></li>
				<li><a>广告声明</a></li>
			</ul>
		</div>
		<div style="text-align: center;margin-top: 5px;margin-bottom:20px;">
			Copyright &copy; 京东商城 版权所有
		</div>
	</body>

</html>