/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.DBI202;

import Model.Answer;
import Model.AnswerDAO;
import Model.Question;
import Model.QuestionDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class ListDBI202 extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String indexPage = req.getParameter("index");
        if(indexPage == null){
            indexPage ="1";
        }
        int index = Integer.parseInt(indexPage);
        AnswerDAO answer_dao = new AnswerDAO();
        QuestionDAO question_dao = new QuestionDAO();
        int count = question_dao.getTotalQuestion("DBI202");
        int endPage = count/5;
        if(count % 5 !=0){
            endPage++;
        }
        ArrayList<Question> list = question_dao.pagingQuestion(index,"DBI202");
        req.setAttribute("endPage", endPage);
        for(int i=0;i<list.size();i++){
            if(list.get(i).getHinhThucCh().contains("1")){
                ArrayList<Answer> list_answer = answer_dao.getAnswer(list.get(i).getMaCh(), "0");
                String first_answer = list_answer.get(0).getNoiDung();
                String second_answer = list_answer.get(1).getNoiDung();
                String third_answer = list_answer.get(2).getNoiDung();
                list_answer = answer_dao.getAnswer(list.get(i).getMaCh(), "1");
                String true_answer = list_answer.get(0).getNoiDung();
                req.setAttribute("first_answer", first_answer);
                req.setAttribute("second_answer", second_answer);
                req.setAttribute("third_answer", third_answer);
                req.setAttribute("true_answer", true_answer);
            }else if(list.get(i).getHinhThucCh().contains("2")){
                 ArrayList<Answer> list_answer = answer_dao.getAnswer(list.get(i).getMaCh(), "0");
                String first_answer = list_answer.get(0).getNoiDung();
                String second_answer = list_answer.get(1).getNoiDung();
                list_answer = answer_dao.getAnswer(list.get(i).getMaCh(), "1");
                String third_answer = list_answer.get(0).getNoiDung();
                String four_answer = list_answer.get(1).getNoiDung();
                req.setAttribute("first_answer", first_answer);
                req.setAttribute("second_answer", second_answer);
                req.setAttribute("third_answer", third_answer);
                req.setAttribute("four_answer", four_answer);
            }
        }
        req.setAttribute("list", list);
        req.getRequestDispatcher("List_DBI202.jsp").forward(req, resp);
    }
    
}
