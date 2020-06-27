/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author vedan
 */
public class myServlet2 extends HttpServlet {

 @Override
 protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String nam=request.getParameter("a");
            String phn=request.getParameter("b");
            String mal=request.getParameter("c");
            String pwd=request.getParameter("e");
            Registration rg=new Registration();
            
            rg.setMail(mal);
            rg.setPhone(phn);
            rg.setUserName(nam);
            Login lg=new Login();
            lg.setUserpw(pwd);
            LoginPass dt=new LoginPass();
            dt.insert(lg);
            
            RegData rd=new RegData();
            rd.create(rg); 
            response.sendRedirect("signUp.html");
        }
}
