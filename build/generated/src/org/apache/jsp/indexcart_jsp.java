package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Products;
import Model.Product;
import java.util.List;

public final class indexcart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>New Store A Ecommerce Category Flat Bootstarp Resposive Website Template | Home :: w3layouts</title>\n");
      out.write("<link href=\"teamplate/css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"teamplate/js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"teamplate/css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"New Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--fonts-->\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500,700,900' rel='stylesheet' type='text/css'><!--//fonts-->\n");
      out.write("<!-- start menu -->\n");
      out.write("<link href=\"teamplate/css/memenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script type=\"text/javascript\" src=\"teamplate/js/memenu.js\"></script>\n");
      out.write("<script>$(document).ready(function(){$(\".memenu\").memenu();});</script>\n");
      out.write("<script src=\"teamplate/js/simpleCart.min.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--header-->\n");
      out.write("<div class=\"header\">\n");
      out.write("\t<div class=\"header-top\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"search\">\n");
      out.write("\t\t\t\t\t<form action=\"ControllerProducts\">\n");
      out.write("                                            <input type=\"text\" name=\"txtTenSP\" value=\"\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search';}\">\n");
      out.write("                                            <input type=\"submit\" name=\"action\" value=\"Search\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-left\">\t\t\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li ><a href=\"indexcustomer.jsp\"  >Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a  href=\"login.jsp\"  >logout</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t<div class=\"cart box_1\">\n");
      out.write("\t\t\t\t\t\t<a href=\"showcart.jsp\">\n");
      out.write("\t\t\t\t\t\t<h3> <div class=\"total\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"simpleCart_total\"></span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"></span> items)</div>\n");
      out.write("\t\t\t\t\t\t\t<img src=\"teamplate/images/cart.png\" alt=\"\"/></h3>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty Cart</a></p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"head-top\">\n");
      out.write("\t\t\t\t<div class=\"logo\">\n");
      out.write("\t\t\t\t\t<a href=\"indexcustomer.jsp\"><img src=\"teamplate/images/logo.png\" alt=\"\"></a>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t  <div class=\" h_menu4\">\n");
      out.write("\t\t\t\t<ul class=\"memenu skyblue\">\n");
      out.write("\t\t\t\t\t  <li class=\"active grid\"><a class=\"color8\" href=\"indexcustomer.jsp\">Home</a></li>\t\n");
      out.write("\t\t\t\t      <li><a class=\"color1\" href=\"#\">lapTop</a>\n");
      out.write("\t\t\t\t      \t<div class=\"mepanel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">ASUS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">HP</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">APPLE</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">LENOVO</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("                                                                                \n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">ALIENWARE</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">SONY</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">GATEWAY</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">TOSHIBA</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">DELL</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">MSI</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">SAMSUNG</a></li>\n");
      out.write("                                                                               \n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t    <li class=\"grid\"><a class=\"color2\" href=\"#\">\tSmart Phone</a>\n");
      out.write("\t\t\t\t\t  \t<div class=\"mepanel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">APPLE</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Samsung</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">HTC</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Gionee</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Huawei</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Mobiistar</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">MEIZU</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">OPPO</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Wing</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">ASUS</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Philips</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">OnePlus</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Coolpad</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">ViVo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col1\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"h_nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4>Popular Brands</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Sony</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Nokia</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Lenovo</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Mobel</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"indexcart.jsp\">Masstel</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t  </div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("\t\t\t\t<li><a class=\"color4\" href=\"#\">Blog</a></li>\t\t\t\t\n");
      out.write("\t\t\t\t<li><a class=\"color6\" href=\"contact.jsp\">Conact</a></li>\n");
      out.write("\t\t\t  </ul> \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\n");
      out.write("<!--content-->\n");
      out.write("<div class=\"content\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <table border=\"1\" style=\"margin-left: 300px; margin-top: 50px; \">\n");
      out.write("            <tr>\n");
      out.write("                <td style=\"width: 200px; text-align: center; background-color: #f0ad4e;\">Ma SP</td>\n");
      out.write("                <td style=\"width: 200px; text-align: center; background-color: #f0ad4e;\">Ten SP</td>\n");
      out.write("                <td style=\"width: 200px; text-align: center; background-color: #f0ad4e;\">Gia</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 
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
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <form action=\"ControllerCartBean\">\n");
      out.write("            <input style=\"margin-left: 600px; margin-top: 20px; margin-bottom: 20px;\" type=\"submit\" name=\"action\" value=\"View Cart\"> \n");
      out.write("        </form>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"footer-top-at\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed\">\n");
      out.write("\t\t\t\t<h4>MORE INFO</h4>\n");
      out.write("\t\t\t\t<ul class=\"nav-bottom\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">How to order</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.jsp\">Location</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Shipping</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Membership</a></li>\t\n");
      out.write("\t\t\t\t\t</ul>\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed \">\n");
      out.write("\t\t\t\t<h4>CONTACT US</h4>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<p>\n");
      out.write("Contrary to popular belief</p>\n");
      out.write("\t\t\t\t\t<p>The standard chunk</p>\n");
      out.write("\t\t\t\t\t<p>office:  +84 964 13 75 71</p>\n");
      out.write("\t\t\t\t\t<ul class=\"social\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i> </i></a></li>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"twitter\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"rss\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\"><i class=\"gmail\"> </i></a></li>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-4 amet-sed\">\n");
      out.write("\t\t\t\t\t<h4>Newsletter</h4>\n");
      out.write("\t\t\t\t\t<p>Sign Up to get all news update\n");
      out.write("and promo</p>\n");
      out.write("\t\t\t\t\t<form>\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"\" onfocus=\"this.value='';\" onblur=\"if (this.value == '') {this.value ='';}\">\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" value=\"Sign up\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"footer-class\">\n");
      out.write("\t\t<p >© 2015 New store All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
