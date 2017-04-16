/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khachhang;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import sample.entity.Customers;
import sample.util.HibernateUtil;

/**
 *
 * @author Administrator
 */
public class KhachhangDao {

    public static List<Customers> layDanhSachKH(String tenkh) {
        List<Customers> list = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String sql = " from Customers where hoten like '%" + tenkh + "%'";
        Query query = session.createQuery(sql);
        list = query.list();
        return list;
    }

    public KhachhangDao() {

    }

    public static void main(String[] args) {
        Customers c=new Customers("dd", "dd", "ada", true, "dâda", false);
        KhachhangDao.xoaKhachHang("dd");
    }

    public static boolean xoaKhachHang(String maKhachHang) {
        Customers kh = KhachhangDao.layThongTinKH(maKhachHang);
        if (kh == null) {
            return false;
        }
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            session.delete(kh);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
            return false;
        }

    }

    public static Customers layThongTinKH(String makh) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Customers kh = (Customers) session.get(Customers.class, makh);
        session.close();
        return kh;
    }

    public void updateCS(String username, String password, String hoten, boolean gioitinh, String email, boolean role) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            Customers ct = (Customers) session.get(Customers.class, username);
            ct.setUsername(username);
            ct.setPassword(password);
            ct.setHoten(hoten);
            ct.setGioitinh(gioitinh);
            ct.setEmail(email);
            ct.setRole(role);
            session.save(ct);
            session.flush();
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public static boolean insertCS(Customers cs) {
        if (KhachhangDao.layThongTinKH(cs.getUsername()) != null) {
            return false;
        }
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        try {
            session.getTransaction().begin();
            session.save(cs);
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e);
            return false;
        }

    }
}
