/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.polycafe.util;

import java.awt.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;
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
         String selectSql1 = "SELECT * FROM Categories WHERE Name LIKE ?";
            ResultSet rs = XJdbc.executeQuery(selectSql1, "%Loại%");
            while (rs.next()) {
                System.out.println("Id: " + rs.getString("Id") + ", Name: " + rs.getString("Name"));
            }
            
//        //Truy xuất nhiều bản ghi và chuyển đổi sang List<Bean>
//        String selectSql2 = "SELECT * FROM Categories WHERE Name LIKE ?";
//        List<Category> beans = XJdbc.getBeanList(Category.class, selectSql2, "%Loại%");
    }
}
