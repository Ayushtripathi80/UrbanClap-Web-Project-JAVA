/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.DataCheck;

/**
 *
 * @author Hp
 */
@WebServlet(urlPatterns = {"/RegSubmit"})
public class RegSubmit extends HttpServlet {

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
            out.println("<title>Servlet RegSubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            
//.println("<h1>Servlet RegSubmit at " + request.getContextPath() + "</h1>");
try
{
    String name =request.getParameter("t1");
    String email=request.getParameter("t2");
    String pass=request.getParameter("t3");
    String utype=request.getParameter("t4");
    String mobile=request.getParameter("t5");
    String city=request.getParameter("t6");
    String address=request.getParameter("t7");
    String photo=request.getParameter("t8");
    String experience=request.getParameter("t9");
    
    DataCheck r= new DataCheck(name, email, pass, utype, mobile, city, address, photo,experience);
    boolean res=r.CreateUser();
    
     if(res==true)
               {
                 HttpSession session=request.getSession();
                session.setAttribute("useremail",email);
                session.setAttribute("username",name);    
                 session.setAttribute("usercity",r.getCity());
                session.setAttribute("usermobile",r.getMobile());    
                 session.setAttribute("usertype",r.getUtype());
                 session.setAttribute("userphoto", r.getPhoto().trim());
             
                
         if(utype.equals("Electrician")||utype.equals("Medical")||utype.equals("Plumber")||utype.equals("Painter")||utype.equals("Carpenter")||utype.equals("Other"))
                {
                    response.sendRedirect("ServitorHome.jsp");
                }
          
       if(utype.equals("Customer"))
                {
                    response.sendRedirect("CustomerHome.jsp");
                }
                
               }
               else
               {
                   out.println("Error");
               }
}
catch(Exception ex)
{
   out.println("Error :"+ex.toString()); 
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
