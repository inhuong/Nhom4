package poly.cafe.polycafe.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import poly.cafe.polycafe.entity.Category;
import poly.cafe.polycafe.entity.User;


public class XQuery {
    public static <B> B getSingleBean(Class<B> beanClass, String sql, Object... values) {
        List<B> list = XQuery.getBeanList(beanClass, sql, values);
        if (!list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    public static <B> List<B> getBeanList(Class<B> beanClass, String sql, Object... values) {
        List<B> list = new ArrayList<>();
        try {
            ResultSet resultSet = XJdbc.executeQuery(sql, values);
            while (resultSet.next()) {
                list.add(XQuery.readBean(resultSet, beanClass));
            }
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private static <B> B readBean(ResultSet resultSet, Class<B> beanClass) throws Exception {
        B bean = beanClass.getDeclaredConstructor().newInstance();
        Method[] methods = beanClass.getDeclaredMethods();
        for(Method method: methods){
            String name = method.getName();
            if (name.startsWith("set") && method.getParameterCount() == 1) {
                try {
                    Object value = resultSet.getObject(name.substring(3));
                    method.invoke(bean, value);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | SQLException e) {
                    System.out.printf("+ Column '%s' not found!\r\n", name.substring(3));
                }
            }
        }
        return bean;
    }
    
    public static void main(String[] args) {
        demo1();
        demo2();
    }

    private static void demo1() {
        String sql = "SELECT * FROM Users WHERE Username=? AND Password=?";
        User user = XQuery.getSingleBean(User.class, sql, "NghiemN", "123456");
    }

    private static void demo2() {
        String sql = "SELECT * FROM Users WHERE Fullname LIKE ?";
        List<User> list = XQuery.getBeanList(User.class, sql, "%Nguyễn %");
    }

    public static List<Category> getEntityList(Class<Category> aClass, String findAllSql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}