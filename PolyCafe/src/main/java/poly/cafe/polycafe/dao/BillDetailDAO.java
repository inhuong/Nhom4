/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package poly.cafe.polycafe.dao;

import java.util.List;
import poly.cafe.polycafe.entity.BillDetail;

/**
 *
 * @author Admin
 */
public interface BillDetailDAO extends CrudDAO<BillDetail, Long>{
    List<BillDetail> findByBillId(Long billId);
    List<BillDetail> findByDrinkId(String drinkId);
}
