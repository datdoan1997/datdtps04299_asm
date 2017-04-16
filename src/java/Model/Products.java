/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class Products {

    public Products() {

    }

    public void add(String masp, String tensp, float price) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "INSERT INTO Products VALUES(?,?,?)";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, masp);
            stm.setString(2, tensp);
            stm.setFloat(3, price);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void update(String masp, String tensp, float price) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "UPDATE Products SET Name = ?, Price = ? WHERE Code = ?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, tensp);
            stm.setFloat(2, price);
            stm.setString(3, masp);

            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void delte(String masp) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "DELETE FROM Products WHERE Code=?";
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, masp);
            stm.executeUpdate();
            stm.close();
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Product> showProduct(String tensp) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=AssignSOF301";
            Connection con = DriverManager.getConnection(url, "sa", "123");
            String sql = "SELECT * FROM Products";
            if (tensp.length() > 0) {
                sql += " WHERE Name LIKE '%" + tensp + "%'";
            }
            java.sql.Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            List<Product> list = new ArrayList<Product>();
            while (rs.next()) {
                String code = rs.getString("Code");
                String name = rs.getString("Name");
                float price = rs.getFloat("Price");
                Product sp = new Product(code, name, price);
                list.add(sp);
                System.out.println("thanh cong");
            }
            return list;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
