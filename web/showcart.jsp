<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

	

<!--content-->
<div class="content">
    
    
    <h1 style="margin-left: 520px; margin-top: 20px;">Your Shopping Cart</h1>
        <c:set var="shop" value="${sessionScope.SHOP}" />
        <c:if test="${not empty shop}">
            <table border="1" style="margin-left: 400px; margin-top: 50px; margin-bottom: 30px;">
                <thead>
                    <tr>
                        <td style="width: 50px; text-align: center;">No.</td>
                        <td style="width: 100px; text-align: center;">Code</td>
                        <td style="width: 200px; text-align: center;">Name</td>
                        <td style="width: 100px; text-align: center;">Price</td>
                        <td style="width: 70px; text-align: center;">Quantity</td>
                        <td style="width: 50px; text-align: center;">Action</td>
                    </tr>
                </thead>
                <tbody>
                <form action="ControllerCartBean">
                    <c:set var="count" value="0" />
                    <c:forEach var="rows" items="${shop}">
                        <c:set var="count" value="${count + 1}" />
                        <tr>
                            <td style="text-align: center;">${count}</td>
                            <td style="text-align: center;">${rows.value.sanpham.code}</td>
                            <td style="text-align: center;">${rows.value.sanpham.name}</td>
                            <td style="text-align: center;">${rows.value.sanpham.price}</td>
                            <td style="text-align: center;">${rows.value.quantity}</td>
                            <td><input style="margin-left: 18px;" type="checkbox" name="rmv"
                                       value="${rows.value.sanpham.code}" /></td>
                        </tr>
                    </c:forEach>
                        <tr style="text-align: center;">
                        <c:url var="add" value="ControllerCartBean">
                            <c:param name="action" value="AddMore"/>
                        </c:url>
                        <td colspan="2"><a href="${add}">Add More</a></td>
                        <td><input type="submit" value="Remove" name="action"/></td>
                    </tr>
                </form>
            </tbody>
        </table>
    </c:if>
	
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