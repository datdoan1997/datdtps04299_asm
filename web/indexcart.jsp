<%-- 
    Document   : indexcart
    Created on : Oct 22, 2016, 10:46:16 AM
    Author     : Administrator
--%>

<%@page import="Model.Products"%>
<%@page import="Model.Product"%>
<%@page import="java.util.List"%>
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

	

<!--content-->
<div class="content">
    
    
    <table border="1" style="margin-left: 300px; margin-top: 50px; ">
            <tr>
                <td style="width: 200px; text-align: center; background-color: #f0ad4e;">Ma SP</td>
                <td style="width: 200px; text-align: center; background-color: #f0ad4e;">Ten SP</td>
                <td style="width: 200px; text-align: center; background-color: #f0ad4e;">Gia</td>
            </tr>
            <% 
                Products listSP = new Products();
                List<Product> list = listSP.showProduct("");
                for (Product sp : list) {
                    out.print("<form action=\"ControllerCartBean\">");
                    out.print("<tr><td style='text-align: center;'>" + sp.getCode() + "</td><td style='text-align: center;'>" + sp.getName() + 
                            "</td><td style='text-align: center;'>" + sp.getPrice() + "</td><td><input type=\"submit\" "
                            + "value=\"Add to Cart\" name=\"action\" /></td>"
                            + "<input type=\"hidden\" name=\"txtCode\" value='" + sp.getCode()+"'>"
                            + "<input type=\"hidden\" name=\"txtName\" value='" + sp.getName()+"'>"
                            + "<input type=\"hidden\" name=\"txtPrice\" value='" + sp.getPrice() +"'></tr>");
                    out.print("</form>");
                }   
            %>
        </table>
        <form action="ControllerCartBean">
            <input style="margin-left: 600px; margin-top: 20px; margin-bottom: 20px;" type="submit" name="action" value="View Cart"> 
        </form>
	
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
