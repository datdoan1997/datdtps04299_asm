<%-- 
    Document   : index
    Created on : Oct 1, 2016, 7:06:53 PM
    Author     : Administrator
--%>

<%@page import="java.util.List"%>
<%@page import="Model.Product"%>
<%@page import="Model.Products"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>New Store A Ecommerce Category Flat Bootstarp Resposive Website Template | Home :: w3layouts</title>
<link href="teamplate/css/bootstrap.css" rel="stylesheet" type="text/css"/>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="teamplate/js/jquery.min.js" type="text/javascript"></script>
<!-- Custom Theme files -->
<!--theme-style-->
<link href="teamplate/css/style.css" rel="stylesheet" type="text/css"/>
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--fonts-->
<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->
<!-- start menu -->
<link href="teamplate/css/memenu.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="teamplate/js/memenu.js"></script>
<script>$(document).ready(function(){$(".memenu").memenu();});</script>
<script src="teamplate/js/simpleCart.min.js" type="text/javascript"></script>
</head>
<body>
<!--header-->
<div class="header">
	<div class="header-top">
		<div class="container">
			<div class="search">
					<form action="ControllerProducts">
                                            <input type="text" name="txtTenSP" value="" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search';}">
                                            <input type="submit" name="action" value="Search">
					</form>
			</div>
			<div class="header-left">		
					<ul>
						<li ><a href="indexcustomer.jsp"  >Welcome, ${sessionScope.USER}</a></li>
						<li><a  href="login.jsp"  >logout</a></li>

					</ul>
					<div class="cart box_1">
						<a href="showcart.jsp">
						<h3> <div class="total">
							<span class="simpleCart_total"></span> (<span id="simpleCart_quantity" class="simpleCart_quantity"></span> items)</div>
							<img src="teamplate/images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
					<div class="clearfix"> </div>
			</div>
				<div class="clearfix"> </div>
		</div>
		</div>
		<div class="container">
			<div class="head-top">
				<div class="logo">
					<a href="indexcustomer.jsp"><img src="teamplate/images/logo.png" alt=""></a>	
				</div>
		  <div class=" h_menu4">
				<ul class="memenu skyblue">
					  <li class="active grid"><a class="color8" href="indexcustomer.jsp">Home</a></li>	
				      <li><a class="color1" href="#">lapTop</a>
				      	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="indexcart.jsp">ASUS</a></li>
										<li><a href="indexcart.jsp">HP</a></li>
										<li><a href="indexcart.jsp">APPLE</a></li>
										<li><a href="indexcart.jsp">LENOVO</a></li>
										
										
                                                                                
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="indexcart.jsp">ALIENWARE</a></li>
										<li><a href="indexcart.jsp">SONY</a></li>
										<li><a href="indexcart.jsp">GATEWAY</a></li>
										<li><a href="indexcart.jsp">TOSHIBA</a></li>
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="indexcart.jsp">DELL</a></li>
										<li><a href="indexcart.jsp">MSI</a></li>
										<li><a href="indexcart.jsp">SAMSUNG</a></li>
                                                                               
									</ul>	
								</div>												
							</div>
						  </div>
						</div>
					</li>
				    <li class="grid"><a class="color2" href="#">	Smart Phone</a>
					  	<div class="mepanel">
						<div class="row">
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="indexcart.jsp">APPLE</a></li>
										<li><a href="indexcart.jsp">Samsung</a></li>
										<li><a href="indexcart.jsp">HTC</a></li>
										<li><a href="indexcart.jsp">Gionee</a></li>
										<li><a href="indexcart.jsp">Huawei</a></li>
										<li><a href="indexcart.jsp">Mobiistar</a></li>
										<li><a href="indexcart.jsp">MEIZU</a></li>
										
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<ul>
										<li><a href="indexcart.jsp">OPPO</a></li>
										<li><a href="indexcart.jsp">Wing</a></li>
										<li><a href="indexcart.jsp">ASUS</a></li>
										<li><a href="indexcart.jsp">Philips</a></li>
										<li><a href="indexcart.jsp">OnePlus</a></li>
										<li><a href="indexcart.jsp">Coolpad</a></li>
										<li><a href="indexcart.jsp">ViVo</a></li>
										
									</ul>	
								</div>							
							</div>
							<div class="col1">
								<div class="h_nav">
									<h4>Popular Brands</h4>
									<ul>
										<li><a href="indexcart.jsp">Sony</a></li>
										<li><a href="indexcart.jsp">Nokia</a></li>
										<li><a href="indexcart.jsp">Lenovo</a></li>
										<li><a href="indexcart.jsp">Mobel</a></li>
										<li><a href="indexcart.jsp">Masstel</a></li>
									
									</ul>	
								</div>												
							</div>
						  </div>
						</div>
			    </li>
				<li><a class="color4" href="#">Blog</a></li>				
				<li><a class="color6" href="#">Conact</a></li>
			  </ul> 
			</div>
				
				<div class="clearfix"> </div>
		</div>
		</div>

	</div>

	<div class="banner">
		<div class="container">
			  <script src="teamplate/js/responsiveslides.min.js"></script>
  <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	nav: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>
			<div  id="top" class="callbacks_container">
			<ul class="rslides" id="slider">
			    <li>
					
						<div class="banner-text">
                                                    <h2> NGÔN NGỮ THIẾT KẾ QUEN THUỘC</h2>
						<p>MẶT LƯNG ĐƯỢC BO CONG GIÚP NGƯỜI DÙNG CẦM GIỮ DỄ DÀNG ,HỆ THỐNG CAMERA ĐƯỢC LÀM GỌN VÀ BỚT LỒI LÕM HƠN </p>
						<a href="indexcart.jsp">Learn More</a>
						</div>
				
				</li>
				<li>
					
						<div class="banner-text">
							 <h2> NỀN TẢNG ĐIỀU HÀNH MỚI CHO THỜI LƯỢNG PIN TỐT HƠN</h2>
						<p>HỆ ĐIỀU HÀNH ANDROID 6.0 MASHMALLOW  MỚI NHẤT HIỆN NAY KẾT HỢP VỚI CÔNG NGHỆ MÀN HÌNH SUPER AMOLED VÀ VI XỬ LÝ TIẾT KIỆM ĐIỆN NĂNG </p>
                                                <
												<a href="indexcart.jsp">Learn More</a>

						</div>
					
				</li>
				<li>
						<div class="banner-text">
							 <h2>  BỔ SUNG KHẢ NĂNG CHỐNG NƯỚC HIỆU QUẢ</h2>
						<p>KHẢ NĂNG CHỐNG NƯỚC VÀ BỤI ĐẠT TIÊU CHUẨN  IP68 SẼ MANG ĐẾN SỰ YÊN TÂM KHI SỬ DỤNG MÁY TRONG ĐIỀU KIỆN ẨM ƯỚT VÀ GIÚP NGƯỜI DÙNG VỆ SINH MÁY DỄ DÀNG HƠN </p>
								<a href="indexcart.jsp">Learn More</a>

						</div>
					
				</li>
			</ul>
		</div>

	</div>
	</div>

<!--content-->
<div class="content">
	<div class="container">
	<div class="content-top">
		<h1> HIGH QUALITY</h1>
		<div class="grid-in">
			<div class="col-md-4 grid-top">
                            <a href="indexcart.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="teamplate/images/pl.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>LapTop</span>	
									</h3>
								</div>
				</a>
		

			<p><a href="indexcart.jsp"></a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="indexcart.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="teamplate/images/pl1.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Smart Phone</span>	
									</h3>
								</div>
				</a>
			<p><a href="indexcart.jsp">classical Latin</a></p>
			</div>
			<div class="col-md-4 grid-top">
				<a href="indexcart.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="teamplate/images/pi2.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-left    b-delay03 ">
										<span>Bag</span>	
									</h3>
								</div>
				</a>
			<p><a href="indexcart.jsp">undoubtable</a></p>
			</div>
					<div class="clearfix"> </div>
		</div>
		
	</div>
	<!----->
	
	<div class="content-top-bottom">
		<h2>Featured Collections</h2>
		<div class="col-md-6 men">
			<a href="indexcart.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="teamplate/images/d1.jpg" alt="">
				<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in   b-delay03 ">
										<span> popular </span>	
									</h3>
								</div>
			</a>
			
			
		</div>
		<div class="col-md-6">
			<div class="col-md1 ">
				<a href="indexcart.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="teamplate/images/t2.jpg" alt="">
					<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in1   b-delay03 ">
										<span>Lorem</span>	
									</h3>
								</div>
				</a>
				
			</div>
			<div class="col-md2">
				<div class="col-md-6 men1">
					<a href="indexcart.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="teamplate/images/d3.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>new design</span>	
									</h3>
								</div>
					</a>
					
				</div>
				<div class="col-md-6 men2">
					<a href="indexcart.jsp" class="b-link-stripe b-animate-go  thickbox"><img class="img-responsive" src="teamplate/images/d4.jpg" alt="">
							<div class="b-wrapper">
									<h3 class="b-animate b-from-top top-in2   b-delay03 ">
										<span>new style</span>	
									</h3>
								</div>
					</a>
					
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="clearfix"> </div>
	</div>
	</div>
	<!---->
	
</div>
<div class="footer">
				<div class="container">
			<div class="footer-top-at">
			
				<div class="col-md-4 amet-sed">
				<h4>MORE INFO</h4>
				<ul class="nav-bottom">
						<li><a href="#">How to order</a></li>
						<li><a href="#">FAQ</a></li>
						<li><a href="#">Location</a></li>
						<li><a href="#">Shipping</a></li>
						<li><a href="#">Membership</a></li>	
					</ul>	
				</div>
				<div class="col-md-4 amet-sed ">
				<h4>CONTACT US</h4>
				
					<p>
Contrary to popular belief</p>
					<p>The standard chunk</p>
					<p>office:  +84 964 13 75 71</p>
					<ul class="social">
						<li><a href="#"><i> </i></a></li>						
						<li><a href="#"><i class="twitter"> </i></a></li>
						<li><a href="#"><i class="rss"> </i></a></li>
						<li><a href="#"><i class="gmail"> </i></a></li>
						
					</ul>
				</div>
				<div class="col-md-4 amet-sed">
					<h4>Newsletter</h4>
					<p>Sign Up to get all news update
and promo</p>
					<form>
						<input type="text" value="" onfocus="this.value='';" onblur="if (this.value == '') {this.value ='';}">
						<input type="submit" value="Sign up">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="footer-class">
		<p >© 2015 New store All Rights Reserved | Design by  <a href="http://w3layouts.com/" target="_blank">W3layouts</a> </p>
		</div>
		</div>
</body>
</html>
			