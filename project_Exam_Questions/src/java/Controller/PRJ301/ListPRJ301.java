/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller.PRJ301;

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
public class ListPRJ301 extends HttpServlet{

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
        
        QuestionDAO question_dao = new QuestionDAO();
        int count = question_dao.getTotalQuestion("PRJ301");
        int endPage = count/5;
        if(count % 5 !=0){
            endPage++;
        }
        ArrayList<Question> list = question_dao.pagingQuestion(index,"PRJ301");
        req.setAttribute("endPage", endPage);
        req.setAttribute("list", list);
        req.getRequestDispatcher("List_PRJ301.jsp").forward(req, resp);
    }
    
}
