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
public class QuestionDAO extends DBContext {

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

    public QuestionDAO() {
        connect();
    }

    public void insertQuestion(String hinhThucCh, String noiDung, String maMon, String doKho) {

        try {
            String strinsert = "INSERT INTO dbo.CauHoi(HinhThucCH,NoiDung,MaMon,DoKho) VALUES (?,?,?,?)";

            stm = cnn.prepareStatement(strinsert);
            stm.setString(1, hinhThucCh);
            stm.setString(2, noiDung);
            stm.setString(3, maMon);
            stm.setString(4, doKho);
            stm.execute();

        } catch (Exception e) {
            System.out.println("Insert fail" + e.getMessage());
        }

    }

    public int findQuestion(String question) {
        int id = 0;
        try {
            String strSelect = "select * from dbo.CauHoi as c where c.NoiDung = ?";

            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, question);
            rs = stm.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (Exception e) {

        }
        return id;
    }

    public ArrayList<Question> getALlQuestion(String subject) {
        ArrayList<Question> list = new ArrayList<>();
        try {
            String strSelect = "select * from dbo.CauHoi where MaMon = ?";

            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, subject);
            rs = stm.executeQuery();
            while (rs.next()) {
                Question question = new Question();
                question.setMaCh(rs.getInt(1));
                question.setHinhThucCh(rs.getString(2));

                question.setNoiDung(rs.getString(3));
                question.setDoKho(rs.getString(6));
                list.add(question);

            }

        } catch (Exception e) {
            System.out.println("check User fail" + e.getMessage());
        }
        return list;
    }

    public void deleteById(int id) {
        try {
            String strdelete = "DELETE FROM dbo.CauHoi WHERE MaCH=?";

            stm = cnn.prepareStatement(strdelete);

            stm.setInt(1, id);
            stm.execute();

        } catch (Exception e) {
            System.out.println("Delete Question fail" + e.getMessage());
        }
    }

    public Question getQuestion(int id) {
        Question question = new Question();
        try {
            String strSelect = "  select * from dbo.CauHoi where MaCH = ?";

            stm = cnn.prepareStatement(strSelect);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            while (rs.next()) {
                question.setMaCh(rs.getInt(1));
                question.setHinhThucCh(rs.getString(2));
                question.setNoiDung(rs.getString(3));
                question.setMaMon(rs.getString(5));
                question.setDoKho(rs.getString(6));

            }

        } catch (Exception e) {
            System.out.println("check User fail" + e.getMessage());
        }
        return question;
    }

    public int getTotalQuestion(String subject) {
        try {
            String strSelect = "select count(*) from dbo.CauHoi where MaMon = ? ";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, subject);
            rs = stm.executeQuery();
            while (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {

        }
        return 0;
    }

    public ArrayList<Question> pagingQuestion(int index, String subject) {
        ArrayList<Question> list = new ArrayList<>();
        try {
            String strSelect = "select * from dbo.CauHoi where MaMon =?\n"
                    + "  order by MaCH \n"
                    + "  offset ? rows fetch next 5 rows only ";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, subject);
            stm.setInt(2, (index-1)*5);
            rs = stm.executeQuery();
            while(rs.next()){
                Question question = new Question();
                question.setMaCh(rs.getInt(1));
                question.setHinhThucCh(rs.getString(2));

                question.setNoiDung(rs.getString(3));
                question.setDoKho(rs.getString(6));
                list.add(question);
            }
        } catch (Exception e) {

        }
        return list;
    }

    public static void main(String[] args) {
        QuestionDAO question_dao = new QuestionDAO();

        System.out.println(question_dao.getTotalQuestion("DBI202"));
    }
}
