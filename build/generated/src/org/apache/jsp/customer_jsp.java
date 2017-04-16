package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css_login/customer.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Customer</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"head\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"login.jsp\">Home</a></li>\n");
      out.write("                <li><a href=\"product.jsp\">product</a></li>\n");
      out.write("                <li><a href=\"insert.jsp\">insert</a></li>\n");
      out.write("                <li><a href=\"editProduct.jsp\">update</a></li>\n");
      out.write("            </ul>\n");
      out.write("            <div class=\"search\">\n");
      out.write("                <form action=\"ControllerProducts\">\n");
      out.write("                    tìm kiếm <input type=\"text\" name=\"txtTenSP\" value=\"\"/>\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"Search\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"dangky\">\n");
      out.write("                <button type=\"button\"><a href=\"login.jsp\">ĐĂNG NHẬP </a></button>\n");
      out.write("                <button type=\"button\"><a href=\"login.jsp\">ĐĂNG KÝ</a></button>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"slideshow\">\n");
      out.write("            <div class=\"slideshow-container\">\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">1 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/1.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">2 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/2.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">3 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/3.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">4 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/4.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">5 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/5.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">6 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/6.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">7 / 11</div>\n");
      out.write("                    <a href=\"customer.jsp\"></a>\n");
      out.write("                    <img src=\"css_login/img/7.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">8 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/8.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">9 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/9.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">10 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/10.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"mySlides fade\">\n");
      out.write("                    <div class=\"numbertext\">11 / 11</div>\n");
      out.write("                    <img src=\"css_login/img/11.jpg\" style=\"width:650\" height=\"400\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <a class=\"prev\" onclick=\"plusSlides(-1)\">&#10094;</a>\n");
      out.write("                <a class=\"next\" onclick=\"plusSlides(1)\">&#10095;</a>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("            <div style=\"text-align:center\">\n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(1)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(2)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(3)\"></span>\n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(4)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(5)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(6)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(7)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(8)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(9)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(10)\"></span> \n");
      out.write("                <span class=\"dot\" onclick=\"currentSlide(11)\"></span> \n");
      out.write("            </div>\n");
      out.write("            <h1>Welcome, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.USER}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("            <p1><a href=\"String url = 'controllercustomer?txtTenKH=&action=Search';\">♥♥♥♥ MUA HÀNG ♥♥♥♥</a></p1>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            var slideIndex = 1;\n");
      out.write("            showSlides(slideIndex);\n");
      out.write("\n");
      out.write("            function plusSlides(n) {\n");
      out.write("                showSlides(slideIndex += n);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function currentSlide(n) {\n");
      out.write("                showSlides(slideIndex = n);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function showSlides(n) {\n");
      out.write("                var i;\n");
      out.write("                var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                var dots = document.getElementsByClassName(\"dot\");\n");
      out.write("                if (n > slides.length) {\n");
      out.write("                    slideIndex = 1\n");
      out.write("                }\n");
      out.write("                if (n < 1) {\n");
      out.write("                    slideIndex = slides.length\n");
      out.write("                }\n");
      out.write("                for (i = 0; i < slides.length; i++) {\n");
      out.write("                    slides[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                for (i = 0; i < dots.length; i++) {\n");
      out.write("                    dots[i].className = dots[i].className.replace(\" active\", \"\");\n");
      out.write("                }\n");
      out.write("                slides[slideIndex - 1].style.display = \"block\";\n");
      out.write("                dots[slideIndex - 1].className += \" active\";\n");
      out.write("            }\n");
      out.write("            var slideIndex = 0;\n");
      out.write("            showSlides();\n");
      out.write("\n");
      out.write("            function showSlides() {\n");
      out.write("                var i;\n");
      out.write("                var slides = document.getElementsByClassName(\"mySlides\");\n");
      out.write("                for (i = 0; i < slides.length; i++) {\n");
      out.write("                    slides[i].style.display = \"none\";\n");
      out.write("                }\n");
      out.write("                slideIndex++;\n");
      out.write("                if (slideIndex > slides.length) {\n");
      out.write("                    slideIndex = 1\n");
      out.write("                }\n");
      out.write("                slides[slideIndex - 1].style.display = \"block\";\n");
      out.write("                setTimeout(showSlides, 3000);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
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
