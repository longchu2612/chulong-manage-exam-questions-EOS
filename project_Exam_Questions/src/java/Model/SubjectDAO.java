/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class SubjectDAO extends DBContext{
    Connection cnn;// Ket noi
    PreparedStatement stm;// Thuc hien cac cau lenh SQL
    ResultSet rs;// Luu tru va xu ly du lieu
    
    public SubjectDAO(){
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
    public ArrayList<Subject> getAllSubject(){
        ArrayList<Subject> list = new ArrayList<>();
        
        try {

            String strSelect = "select * from dbo.Mon";
            stm = cnn.prepareStatement(strSelect);

            rs = stm.executeQuery();
            while (rs.next()) {
                Subject s= new Subject();
                s.setMaMon(rs.getString(1));
                s.setTenMon(rs.getString(2));
                list.add(s);
            }
        } catch (Exception e) {
            System.out.println("check account fail" + e.getMessage());
        }
        return list;
    }
    public static void main(String[] args) {
        SubjectDAO subject_dao = new SubjectDAO();
        ArrayList<Subject> list = subject_dao.getAllSubject();
        for (Subject subject : list) {
            System.out.println(subject.getMaMon());
            
        }
    }
}
