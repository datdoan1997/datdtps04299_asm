/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import khachhang.KhachhangDao;
import org.hibernate.Session;
import sample.entity.Customers;
import sample.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class controllercustomer extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            String action = request.getParameter("action");
            if (action.equals("Search")) {
                String tenkh = request.getParameter("txtTenKH");
                List<Customers> list = KhachhangDao.layDanhSachKH(tenkh);
                request.setAttribute("listKH", list);
                RequestDispatcher rd = request.getRequestDispatcher("khachhang.jsp");
                rd.forward(request, response);
            } else if (action.equals("Delete")) {
                String makh = request.getParameter("txtUser");
                boolean daxoa = KhachhangDao.xoaKhachHang(makh);
                if (daxoa) {
                    String url = "controllercustomer?txtTenKH=&action=Search";
                    RequestDispatcher rd = request.getRequestDispatcher(url);
                    rd.forward(request, response);
                }

            } else if (action.equals("Update")) {
                String username = request.getParameter("txtUser");
                String password = request.getParameter("txtPass");
                String hoten = request.getParameter("txtHoTen");
                String gioitinh = request.getParameter("txtGioiTinh");
                String email = request.getParameter("txtEmail");
                String role = request.getParameter("txtRole");
                boolean bl = Boolean.parseBoolean(gioitinh);
                boolean rl = Boolean.parseBoolean(role);
                KhachhangDao dao = new KhachhangDao();
                dao.updateCS(username, password, hoten, bl, email, rl);
                String url = "controllercustomer?txtTenKH=&action=Search";
                RequestDispatcher rt = request.getRequestDispatcher(url);
                rt.forward(request, response);
                
            } else if (action.equals("Register")) {
                String url = "dangky.jsp";
                RequestDispatcher rt = request.getRequestDispatcher(url);
                rt.forward(request, response);
                if (action.equals("Register")) {
                    String username = request.getParameter("txtUser");
                    String password = request.getParameter("txtPass");
                    String hoten = request.getParameter("txtHoTen");
                    String gioitinh = request.getParameter("txtGioiTinh");
                    boolean bl = false;
                    if(gioitinh.equals("Nam")){
                    bl=true;
                    }
                    String email = request.getParameter("txtEmail");
                    Customers cs = new Customers(username, password, hoten, bl, email, false);
                    KhachhangDao ncs = new KhachhangDao();
                    ncs.insertCS(cs);
                    String url2 = "controllercustomer?txtTenKH=&action=Search";
                    RequestDispatcher rt2 = request.getRequestDispatcher(url2);
                    rt2.forward(request, response);
                }
            }

        } catch (Exception e) {

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
