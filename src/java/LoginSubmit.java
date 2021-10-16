/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.*;
import utility.*;

/**
 *
 * @author Hp
 */
@WebServlet(urlPatterns = {"/LoginSubmit"})
public class LoginSubmit extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginSubmit</title>");            
            out.println("</head>");
            out.println("<body>");
           
// out.println("<h1>Servlet LoginSubmit at " + request.getContextPath() + "</h1>");

try
          {
              String email=request.getParameter("t2");
              String pass=request.getParameter("t3");
              DataCheck r=new DataCheck(email,pass);
              boolean res=r.LoginCheck();
              if(res==true)
              {
                HttpSession session=request.getSession();
                //changes
                session.setAttribute("useremail",email);
                session.setAttribute("username",r.getName());    
                session.setAttribute("usertype",r.getUtype());
               session.setAttribute("usermobile", r.getMobile());
                 session.setAttribute("usercity", r.getCity());
                 session.setAttribute("userphoto", r.getPhoto().trim());
                
                
            if(r.getUtype().trim().equals("Electrician")||r.getUtype().trim().equals("Plumber")||r.getUtype().trim().equals("Painter")||r.getUtype().trim().equals("Carpenter")||r.getUtype().trim().equals("Medical")||r.getUtype().trim().equals("Other"))
                {
                   RequestDispatcher rd=request.getRequestDispatcher("ServitorHome.jsp");
                    rd.forward(request,response);
                }
                
                      
                if(r.getUtype().trim().equals("Customer"))
                {
                    RequestDispatcher rd=request.getRequestDispatcher("CustomerHome.jsp");
                    rd.forward(request,response);
                }
              }
              
              else
              {
                  out.println("invalid id or pass!!");
                    RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
                    rd.include(request,response);
              }
          }
          catch(Exception ex)
          {
              out.println("invalid !"+ex.toString());
          }

out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
