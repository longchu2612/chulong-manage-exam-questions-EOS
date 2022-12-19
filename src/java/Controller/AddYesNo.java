/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AnswerDAO;
import Model.QuestionDAO;
import Model.Subject;
import Model.SubjectDAO;
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
public class AddYesNo extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        String subject = req.getParameter("subject");
        String level = req.getParameter("level");
        String question = req.getParameter("question");
        String  answer= req.getParameter("answer");
       
        String message = "";
        if (question == "") {
            message += "Question is empty";
        }else{
            QuestionDAO question_dao = new QuestionDAO();
            AnswerDAO answer_dao = new AnswerDAO();
            question_dao.insertQuestion("4", question, subject, level);
            int maCh = question_dao.findQuestion(question);
            if(answer.equals("Yes")){
                answer_dao.insertAnswer(maCh,"Yes", 1);
            }else{
                answer_dao.insertAnswer(maCh,"No", 1);
            }
            
            message ="Add successful";
        }

        SubjectDAO subject_dao = new SubjectDAO();
        ArrayList<Subject> list = subject_dao.getAllSubject();
        req.setAttribute("list", list);
        req.setAttribute("message", message);
        req.getRequestDispatcher("YesNoQuestion.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
