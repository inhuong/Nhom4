//
//package poly.cafe.polycafe.util;
//
//import java.sql.ResultSet;
//import java.util.List;
//import poly.cafe.polycafe.entity.Category;
//
///**
// *
// * @author Admin
// */
//public class Test {
//    public static void main(String[] args) {
//        String sql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
//        XJdbc.executeUpdate(sql, "C01", "Loại 1");
//        XJdbc.executeUpdate(sql, "C02", "Loại 2");
//        
//        String insertSql = "INSERT INTO Categories (Id, Name) VALUES(?, ?)";
//        XJdbc.executeUpdate(insertSql, "C01", "Loại 1");
//        XJdbc.executeUpdate(insertSql, "C02", "Loại 2");
//
//        String selectLikeSql = "SELECT * FROM Categories WHERE Name LIKE ?";
//        ResultSet rs = XJdbc.executeQuery(selectLikeSql, "%Loại%");
//
//        List<Category> beans = XJdbc.getBeanList(Category.class, selectLikeSql, "%Loại%");
//
//        String selectByIdSql = "SELECT * FROM Categories WHERE Id=?";
//        Category bean = XJdbc.getSingleBean(Category.class, selectByIdSql, "C02");
//
//        String selectMaxIdSql = "SELECT max(Id) FROM Categories WHERE Name LIKE ?";
//        String id = XJdbc.getValue(selectMaxIdSql, "%Loại%");
//    }
//}
