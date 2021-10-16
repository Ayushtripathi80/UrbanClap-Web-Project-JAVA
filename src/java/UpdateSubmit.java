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
import model.DataCheck;

/**
 *
 * @author 2k
 */
@WebServlet(urlPatterns = {"/UpdateSubmit"})
public class UpdateSubmit extends HttpServlet {

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
            out.println("<title>Servlet UpdateSubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
        //    out.println("<h1>Servlet UpdateSubmit at " + request.getContextPath() + "</h1>");
            
            
            
            
             try{
                 String email=request.getParameter("t0");
    String name =request.getParameter("t1");
    String pass=request.getParameter("t2");
    String utype=request.getParameter("t8");
    String mobile=request.getParameter("t3");
    String city=request.getParameter("t44");
    String address=request.getParameter("t5");
    String photo=request.getParameter("t6");
  
   DataCheck r=new DataCheck(name,email,pass,utype,mobile,city,address,photo);
   boolean res=r.updateCheck();
              if(res==true)
              {
                   HttpSession session=request.getSession();
                
               session.setAttribute("username",name);  
              
               session.setAttribute("usermobile",mobile);
               session.setAttribute("usercity",city);
               session.setAttribute("useraddress",address);
     
                              session.setAttribute("userphoto",photo);
              RequestDispatcher rd=request.getRequestDispatcher("CustomerHome.jsp");
                    rd.forward(request,response);
            }
             }
            catch(Exception ex)
            {
                System.out.println(ex);
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
