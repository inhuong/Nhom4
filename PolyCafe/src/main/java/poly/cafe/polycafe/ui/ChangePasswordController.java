
package poly.cafe.polycafe.ui;

import poly.cafe.polycafe.dao.UserDAO;
import poly.cafe.polycafe.dao.impl.UserDAOImpl;
import poly.cafe.polycafe.util.XAuth;
import poly.cafe.polycafe.util.XDialog;

public interface ChangePasswordController {
    void open();
    void save();
    void close();
    
    UserDAO dao = new UserDAOImpl();
}

