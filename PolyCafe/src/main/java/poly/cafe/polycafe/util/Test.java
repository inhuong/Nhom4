/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.polycafe.util;

import java.awt.List;
import java.sql.ResultSet;
import poly.cafe.polycafe.entity.Category;
import poly.cafe.util.XJdbc;



/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) throws SQLException {
        String sql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
        XJdbc.executeUpdate(sql, "C01", "Loại 1");
        XJdbc.executeUpdate(sql, "C02", "Loại 2");
        
        // Truy vấn nhiều bản ghi (ResultSet)
         String sql = "SELECT * FROM Categories WHERE Name LIKE ?";
            ResultSet rs = XJdbc.executeQuery(sql, "%Loại%");
            while (rs.next()) {
                System.out.println("Id: " + rs.getString("Id") + ", Name: " + rs.getString("Name"));
            }
            
        //Truy xuất nhiều bản ghi và chuyển đổi sang List<Bean>
        String sql = "SELECT * FROM Categories WHERE Name LIKE ?";
        List<Category> beans = XJdbc.getBeanList(Category.class, sql, "%Loại%");
        
        //Truy xuất một bản ghi và chuyển đổi sang Bean
        String sql = "SELECT * FROM Categories WHERE Id=?";
        Category bean = XJdbc.getSingleBean(Category.class, sql, "C02");
        
        //Truy vấn 1 giá trị
        String sql = "SELECT max(Id) FROM Categories WHERE Name LIKE ?";
        String id = XJdbc.getValue(sql, "%Loại%");
    }
}
