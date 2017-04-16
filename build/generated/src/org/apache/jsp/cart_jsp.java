package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"Css/dangnhap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"Css/searchProduct.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <body id=\"body\">\n");
      out.write("        <div class=\"wapper\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <div class=\"tieude\">\n");
      out.write("                    <div class=\"logo\"><img src=\"IMG/logo.jpg\" width=\"250px\" height=\"80px\"/></div>\n");
      out.write("                    <div class=\"tt\">Tìm kiếm:</div>\n");
      out.write("                    <div class=\"timkiem\">\n");
      out.write("                        <form action=\"Controller_Products\">\n");
      out.write("                            <input type=\"text\" name=\"txtTenSP\" value=\"\"/>\n");
      out.write("                            <input type=\"submit\" name=\"action\" value=\"Search\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dangnhap\">\n");
      out.write("                        <a class=\"login-window\" href=\"#login-box\">Đăng nhập</a>\n");
      out.write("                        <div class=\"login\" id=\"login-box\">\n");
      out.write("                            <p>Đăng nhập</p>\n");
      out.write("                            <a class=\"close\" href=\"#\">\n");
      out.write("                                <img class=\"img-close\" title=\"Close Window\" alt=\"Close\" src=\"IMG/thoat.png\" width=\"20\" height=\"20\"/>\n");
      out.write("                            </a>\n");
      out.write("                            <form class=\"login-content\" action=\"ControllerCustomers\">\n");
      out.write("                                <label class=\"username\">\n");
      out.write("                                    <span>Tên hoặc email</span>\n");
      out.write("                                    <input id=\"username\" type=\"text\" name=\"txtUser\" placeholder=\"Username\" value=\"\"/>\n");
      out.write("                                </label>\n");
      out.write("                                <label class=\"password\">\n");
      out.write("                                    <span>Mật khẩu</span>\n");
      out.write("                                    <input id=\"password\" type=\"password\" name=\"txtPass\" placeholder=\"Password\" value=\"\"/>\n");
      out.write("                                </label>\n");
      out.write("                                <label class=\"qmatkhau\">\n");
      out.write("                                    <a class=\"forgot\" href=\"#\">Quên mật khẩu?</a>\n");
      out.write("                                    <button class=\"submit-button\" type=\"submit\" name=\"action\" value=\"Login\">Đăng nhập</button>\n");
      out.write("                                </label>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js\"></script>\n");
      out.write("                        <script src=\"Js/dangnhap.js\" type=\"text/javascript\"></script>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"dangky\"><a href=\"Dangky.jsp\">Đăng ký</a></div>\n");
      out.write("                    <div class=\"thongtin\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"#\">Hỗ trợ</a>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Gọi: +0967-441-406</a></li>\n");
      out.write("                                    <li><a href=\"#\">Mail: Fpt@gmail.com</a></li>\n");
      out.write("                                    <li><a href=\"#\">Địa chỉ: Thủ Dầu Một, TP.Bình Dương</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"quangcao\">\n");
      out.write("                    <div class=\"qc\">\n");
      out.write("                        <div class=\"header-left\">\n");
      out.write("                            <div class=\"image\"><img id=\"hinh\" src=\"IMG/1.jpg\"/></div>  \n");
      out.write("                            <div class=\"back\"><img src=\"IMG/back.png\" onclick=\"back()\"/></div>\n");
      out.write("                            <div class=\"next\"><img src=\"IMG/next.png\" onclick=\"next()\"/></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"header-right\">\n");
      out.write("                            <div class=\"hright-top\"><img src=\"IMG/logo.jpg\" width=\"380\" height=\"119\"/></div>\n");
      out.write("                            <div class=\"hright-bot\"><img src=\"IMG/bantin.png\" width=\"380\" height=\"119\"/></div>\n");
      out.write("                        </div>\n");
      out.write("                        <script>\n");
      out.write("                            var a = document.getElementById(\"hinh\");\n");
      out.write("                            var i = 1;\n");
      out.write("\n");
      out.write("                            function next() {\n");
      out.write("                                i++;\n");
      out.write("                                if (i >= 4) {\n");
      out.write("                                    i = 1;\n");
      out.write("                                } else {\n");
      out.write("                                    //\n");
      out.write("                                }\n");
      out.write("                                a.src = \"IMG/\" + i + \".jpg\";\n");
      out.write("                            }\n");
      out.write("                            function back() {\n");
      out.write("                                if (i == 4)\n");
      out.write("                                    i -= 2;\n");
      out.write("                                else\n");
      out.write("                                    i--;\n");
      out.write("                                if (i < 1) {\n");
      out.write("                                    i = 3;\n");
      out.write("                                } else {\n");
      out.write("                                    //\n");
      out.write("                                }\n");
      out.write("                                a.src = \"IMG/\" + i + \".jpg\";\n");
      out.write("                            }\n");
      out.write("                            var mySlideshow;\n");
      out.write("                            document.mySlideshow = setInterval(next, 4000);\n");
      out.write("                        </script>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <div class=\"cont\">\n");
      out.write("                    <div class=\"content-left\">\n");
      out.write("                        <div class=\"content-left-tren\">\n");
      out.write("                            <div class=\"Danhsachsp\">Danh sách sản phẩm</div>\n");
      out.write("                            <div class=\"Tensp\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li><a href=\"#\">Điện thoại</a>\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\">Nokia</a></li>\n");
      out.write("                                            <li><a href=\"#\">SamSum</a></li>\n");
      out.write("                                            <li><a href=\"#\">Apple</a></li>\n");
      out.write("                                            <li><a href=\"#\">Opple</a></li>\n");
      out.write("                                            <li><a href=\"#\">HTC</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">Laptop</a>\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li><a href=\"#\">Dell</a></li>\n");
      out.write("                                            <li><a href=\"#\">Asur</a></li>\n");
      out.write("                                            <li><a href=\"#\">Apple</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li><a href=\"#\">Máy tính bảng</a></li>\n");
      out.write("                                    <li><a href=\"#\">Phụ kiện</a></li>\n");
      out.write("                                    <li><a href=\"#\">Khuyến mãi</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"content-left-giua\">\n");
      out.write("                            <div class=\"anhdong\">\n");
      out.write("                                <img style=\"-webkit-user-select: none\" src=\"http://fptshop.com.vn/Content/v3/images/ads/201406051806116130_Giao-hang.gif\" width=\"312px\" height=\"auto\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"content-left-duoi\">\n");
      out.write("                            <div class=\"tenqc\">Quảng cáo</div>\n");
      out.write("                            <div class=\"cq\"><img src=\"IMG/qc.jpg\" width=\"312px\" height=\"500px\"/></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"content-right\">\n");
      out.write("                        <table border=\"1\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td>Code</td>\n");
      out.write("                                <td>Name</td>\n");
      out.write("                                <td>Price</td>\n");
      out.write("                                <td>Giỏ hàng</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                        <form action=\"ControllerCartBean\">\n");
      out.write("                            <input type=\"submit\" value=\"View Cart\" name=\"action\"/>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"fooder\"><img src=\"IMG/fooder.JPG\" width=\"1230px\" height=\"220px\"/></div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("rows");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${SP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <form action=\"ControllerCartBean\">\n");
          out.write("                                    <tr>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                        <td>\n");
          out.write("                                            <input type=\"submit\" value=\"Add to Cart\" name=\"action\" />\n");
          out.write("                                            <input type=\"hidden\" name=\"txtCode\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.code}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                            <input type=\"hidden\" name=\"txtName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                            <input type=\"hidden\" name=\"txtPrice\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rows.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"/>\n");
          out.write("                                        </td>\n");
          out.write("                                    </tr>\n");
          out.write("                                </form>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
