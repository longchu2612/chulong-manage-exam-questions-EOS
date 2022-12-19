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
public class AddShortAnswer extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String button = req.getParameter("button");
        resp.getWriter().println(button);
        String subject = req.getParameter("subject");
        String level = req.getParameter("level");
        String question = req.getParameter("question");
        String first_answer = req.getParameter("first_answer");
       
        String message = "";
        if (question == "") {
            message += "Question is empty";
        } else if (first_answer == ""){
            message += "Answer is empty";
        }else {
            QuestionDAO question_dao = new QuestionDAO();
            AnswerDAO answer_dao = new AnswerDAO();
            question_dao.insertQuestion("3", question, subject, level);
            int maCh = question_dao.findQuestion(question);
            answer_dao.insertAnswer(maCh, first_answer, 1);
            message ="Add successful";
        }

        SubjectDAO subject_dao = new SubjectDAO();
        ArrayList<Subject> list = subject_dao.getAllSubject();
        req.setAttribute("list", list);
        req.setAttribute("message", message);
        req.getRequestDispatcher("AddShortAnswer.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
