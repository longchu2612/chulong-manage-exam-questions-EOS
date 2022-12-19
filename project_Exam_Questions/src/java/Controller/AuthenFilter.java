/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 *
 * @author asus
 */
public class AuthenFilter implements Filter{

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)sr;
        HttpServletResponse respone =(HttpServletResponse) sr1;
        HttpSession session = request.getSession();
        //Check xem da login hay chua
        //Kiem tra xem trong Session co thong tin login hay chua 
        //Neu khong co di chuyen den trang access denied
        //Neu co roi thi tiep tuc chay
        if(session.getAttribute("email")==null){
             request.getRequestDispatcher("index.html").forward(request, respone);
        }
        fc.doFilter(sr, sr1);
    }
    
}
