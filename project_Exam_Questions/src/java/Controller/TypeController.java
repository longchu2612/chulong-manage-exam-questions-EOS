/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
public class TypeController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String type = req.getParameter("select");
       if(type == null){
           type = "1";
       }
       int number = Integer.parseInt(type);
       
       String button ="Add";
       SubjectDAO subject_dao = new SubjectDAO();
       ArrayList<Subject> list = subject_dao.getAllSubject();
       switch (number) {
            case 1:
                req.setAttribute("button", button);
                req.setAttribute("list",list);
                req.getRequestDispatcher("forms_multichoice_one.jsp").forward(req, resp);
                break;
            case 2: 
                req.setAttribute("button", button);
                req.setAttribute("list",list);
                req.getRequestDispatcher("Multichoice_two.jsp").forward(req, resp);
                break;
            case 3:
                req.setAttribute("button", button);
                req.setAttribute("list",list);
                req.getRequestDispatcher("AddShortAnswer.jsp").forward(req, resp);
                break;
            case 4:
                 req.setAttribute("button", button);
                 req.setAttribute("list",list);
                 req.getRequestDispatcher("YesNoQuestion.jsp").forward(req, resp);
                 break;
            
                
        }
           
       
       
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
    }
    
}
