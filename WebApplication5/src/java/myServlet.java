/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.IOException;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author vedan
 */
public class myServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
      @Override
      protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String uid=request.getParameter("d");
         String pwd=request.getParameter("e");
         
            dataCheck dc=new dataCheck();
            boolean b1=dc.ch(uid,pwd);
            out.print("lllllllllllllllllllllllll"+b1);
            	if(b1)
		{
			response.sendRedirect("detail.html");
                        
		}
		else
		{
			RequestDispatcher reqd=request.getRequestDispatcher("login.html");
			reqd.include(request, response);
			out.println("invalid id and pwd");
		}

}
}
