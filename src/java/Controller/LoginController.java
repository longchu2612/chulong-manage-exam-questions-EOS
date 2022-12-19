/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Employee;
import Model.EmployeeDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class LoginController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String email = req.getParameter("email");
       String password = req.getParameter("password");
       
       EmployeeDAO employee_dao = new EmployeeDAO();
       Employee employee = employee_dao.checkUser(email, password);
       if(employee!=null){
            HttpSession session = req.getSession();
            session.setAttribute("email",email);
           
            req.getRequestDispatcher("HomePage_2.jsp").forward(req, resp);
           
           
       }else{
           req.getRequestDispatcher("login.jsp").forward(req, resp);
            
       }    
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
    }
    
}
