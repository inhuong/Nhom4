/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poly.cafe.polycafe.dao.impl;

import java.util.List;
import poly.cafe.polycafe.dao.CategoryDAO;
import poly.cafe.polycafe.entity.Category;
import poly.cafe.polycafe.util.XJdbc;
import poly.cafe.polycafe.util.XQuery;

/**
 *
 * @author Admin
 */
public class CategoryDAOImpl implements CategoryDAO {

    String createSql = "INSERT INTO Categories(Id, Name) VALUES(?, ?)";
    String updateSql = "UPDATE Categories SET Name=? WHERE Id=?";
    String deleteSql = "DELETE FROM Categories WHERE Id=?";
    String findAllSql = "SELECT * FROM Categories";
    String findByIdSql = "SELECT * FROM Categories WHERE Id=?";

    @Override
    public Category create(Category entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Category entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Category> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Category findById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
