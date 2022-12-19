/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author asus
 */
public class EmployeeDAO extends DBContext {
    Connection cnn;// Ket noi
    PreparedStatement stm;// Thuc hien cac cau lenh SQL
    ResultSet rs;// Luu tru va xu ly du lieu
    
    public EmployeeDAO(){
        connect();
    }
    
    private void connect() {
        try {
            cnn = super.connection;
            System.out.println("Connect success");
        } catch (Exception e) {
            System.out.println("Connect fail:" + e.getMessage());
        }
    }
    public Employee checkUser(String account, String pass) {
        try {
            String strSelect = "Select * from dbo.NhanVien where DN=? and MK=? ";

            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, account);
            stm.setString(2, pass);

            rs = stm.executeQuery();
            while (rs.next()) {
                Employee e = new Employee();
                e.setMaNV(rs.getString(1));
                e.setTen(rs.getString(2));
                e.setUser_name(rs.getString(3));
                e.setPassword(rs.getString(4));
                e.setNgaySinh(rs.getString(5));
                e.setQuyen(rs.getBoolean(7));
                e.setPhanQuyen(rs.getInt(8));
                return e;
            }

        } catch (Exception e) {
            System.out.println("check User fail" + e.getMessage());
        }
        return null;
    }
    public static void main(String[] args) {
        EmployeeDAO employee_dao = new EmployeeDAO();
        Employee employee = employee_dao.checkUser("hungtt21@gmail.com", "2578");
        System.out.println(employee.getQuyen());
    }
}
