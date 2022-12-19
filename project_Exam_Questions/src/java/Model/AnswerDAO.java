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
public class AnswerDAO extends DBContext{
    Connection cnn;// Ket noi
    PreparedStatement stm;// Thuc hien cac cau lenh SQL
    ResultSet rs;// Luu tru va xu ly du lieu
    
    private void connect() {
        try {
            cnn = super.connection;
            System.out.println("Connect success");
        } catch (Exception e) {
            System.out.println("Connect fail:" + e.getMessage());
        }
    }
    public AnswerDAO(){
        connect();
    }
     public void insertAnswer(int maCh, String noiDung,int dungSai) {
        
        try {
            String strinsert = "INSERT INTO dbo.DapAn(MaCH,NoiDung,DungSai) VALUES (?,?,?)";

            stm = cnn.prepareStatement(strinsert);
            stm.setInt(1, maCh);
            stm.setString(2, noiDung);
            stm.setInt(3, dungSai);
            stm.execute();
            

        } catch (Exception e) {
            System.out.println("Insert fail" + e.getMessage());
        }
        
    }
     
     public void deleteById(int id){
         try {
            String strdelete = "DELETE FROM dbo.DapAn WHERE MaCH = ? ";

            stm = cnn.prepareStatement(strdelete);
           
            stm.setInt(1, id);
            stm.execute();
            
        } catch (Exception e) {
            System.out.println("Delete Question fail" + e.getMessage());
        }
    }
    public ArrayList<Answer> getAnswer(int id,String check){
        ArrayList<Answer> list = new ArrayList<>();
        try{
            String strSelect ="select * from dbo.DapAn where MaCH = ? and DungSai= ? ";
            stm = cnn.prepareStatement(strSelect);
            stm.setInt(1, id);
            stm.setString(2, check);
            rs = stm.executeQuery();
            while(rs.next()){
                Answer answer = new Answer();
                answer.setNoiDung(rs.getString(3));
                list.add(answer);
            }
        }catch(Exception e){
            
        }
        return list;
    }
   
     public static void main(String[] args) {
         AnswerDAO answer_dao = new AnswerDAO();
         ArrayList<Answer> list = new ArrayList<>();
         list = answer_dao.getAnswer(49,"1");
         System.out.println(list.get(0).getNoiDung());
         
    }
}
