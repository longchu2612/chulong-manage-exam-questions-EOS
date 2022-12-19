/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.PRN211;

import Model.Answer;
import Model.AnswerDAO;
import Model.Question;
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
public class EditPRN211Controller extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String id = req.getParameter("id");
        String mod = req.getParameter("mod");
        int maCh = Integer.parseInt(id);
        QuestionDAO q = new QuestionDAO();
        AnswerDAO a = new AnswerDAO();
        if (mod.equals("0")) {
            String button = "Save";
            Question question = new Question();
            question = q.getQuestion(maCh);
            String type = question.getHinhThucCh();
            SubjectDAO subject_dao = new SubjectDAO();
            AnswerDAO answer_dao = new AnswerDAO();
            ArrayList<Subject> list = subject_dao.getAllSubject();
            if (type.contains("1")) {
                ArrayList<Answer> list_answer = answer_dao.getAnswer(maCh, "0");
                String first_answer = list_answer.get(0).getNoiDung();
                String second_answer = list_answer.get(1).getNoiDung();
                String third_answer = list_answer.get(2).getNoiDung();
                list_answer = answer_dao.getAnswer(maCh, "1");
                String true_answer = list_answer.get(0).getNoiDung();
                req.setAttribute("first_answer", first_answer);
                req.setAttribute("second_answer", second_answer);
                req.setAttribute("third_answer", third_answer);
                req.setAttribute("true_answer", true_answer);
                req.setAttribute("question", question);
                req.setAttribute("list", list);
                req.setAttribute("button", button);
                req.getRequestDispatcher("forms_multichoice_one.jsp").forward(req, resp);
            } else if (type.contains("2")) {
                ArrayList<Answer> list_answer = answer_dao.getAnswer(maCh, "0");
                String first_answer = list_answer.get(0).getNoiDung();
                String second_answer = list_answer.get(1).getNoiDung();
                list_answer = answer_dao.getAnswer(maCh, "1");
                String third_answer = list_answer.get(0).getNoiDung();
                String four_answer = list_answer.get(1).getNoiDung();
                req.setAttribute("first_answer", first_answer);
                req.setAttribute("second_answer", second_answer);
                req.setAttribute("third_answer", third_answer);
                req.setAttribute("four_answer", four_answer);
                req.setAttribute("question", question);
                req.setAttribute("list", list);
                req.setAttribute("button", button);
                req.getRequestDispatcher("Multichoice_two.jsp").forward(req, resp);
            } else if (type.contains("3")) {
                ArrayList<Answer> list_answer = answer_dao.getAnswer(maCh, "1");
                String true_answer = list_answer.get(0).getNoiDung();
                req.setAttribute("true_answer", true_answer);
                req.setAttribute("question", question);
                req.setAttribute("list", list);
                req.setAttribute("button", button);
                req.getRequestDispatcher("AddShortAnswer.jsp").forward(req, resp);
            } else {
                ArrayList<Answer> list_answer = answer_dao.getAnswer(maCh, "1");
                String true_answer = list_answer.get(0).getNoiDung();
                req.setAttribute("true_answer", true_answer);
                req.setAttribute("question", question);
                req.setAttribute("list", list);
                req.setAttribute("button", button);
                req.getRequestDispatcher("YesNoQuestion.jsp").forward(req, resp);
            }

        } else {
            a.deleteById(maCh);
            q.deleteById(maCh);
            String indexPage = req.getParameter("index");
            if (indexPage == null) {
                indexPage = "1";
            }
            int index = Integer.parseInt(indexPage);

            QuestionDAO question_dao = new QuestionDAO();
            int count = question_dao.getTotalQuestion("PRN211");
            int endPage = count / 5;
            if (count % 5 != 0) {
                endPage++;
            }
            ArrayList<Question> list = question_dao.pagingQuestion(index, "PRN211");
            req.setAttribute("endPage", endPage);
            req.setAttribute("list", list);
//            ArrayList<Question> list = new ArrayList<Question>();
//            list = q.getALlQuestion("DBI202");
//            req.setAttribute("list", list);
            req.getRequestDispatcher("List_PRN211.jsp").forward(req, resp);
        }
    }
    
}
