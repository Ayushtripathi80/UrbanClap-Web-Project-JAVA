package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import utility.DBConnect;
import java.sql.*;

public final class ServitorProfileUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String email=""; 
 String name=""; 
 String password=""; 
 String mobile=""; 
 String city=""; 
 String address=""; 
 String photo=""; 
 String experience=""; 
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "servitorHeader.jspf", out, false);
      out.write("\n");
      out.write("        <h1>Welcome !\n");
      out.write("            ");
      out.print( session.getAttribute("username"));
      out.write("\n");
      out.write("        </h1>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

        try{
                if(session.getAttribute("username")==null)
                {
                    response.sendRedirect("login.jsp");
                }
            }
        catch(Exception ex)
        {
            
        }
        
      out.write("\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("         ");
      out.write("\n");
      out.write("          ");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("              ");
      out.write("\n");
      out.write("\n");
      out.write("       ");

        try{
            String sql = "select * from registration1 where trim(email)='"+
                    session.getAttribute("useremail")+"'";
            DBConnect x= new DBConnect();
            ResultSet rs = x.queryReturner(sql);
           while( rs.next())
           {
            email = rs.getString(2);
            password = rs.getString(3);
            name = rs.getString(1);
            mobile = rs.getString(5);
            city = rs.getString(6);
            address = rs.getString(7);
             photo = rs.getString(8);
              experience = rs.getString(9);
           }
           
        }
        catch(Exception ex)
        {
            
        }
        
      out.write("\n");
      out.write("        <form action=\"./UpdateSubmit\" method=\"post\">\n");
      out.write("            <table border=\"0\" cellspacing=\"3\">\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><imgage src=\"");
      out.print(photo);
      out.write("\"/>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email</td>\n");
      out.write("                        <td><input type=\"text\" name=\"t0\"  value=\"");
      out.print(email);
      out.write("\" readonly /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"t1\" value=\"");
      out.print(name);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" name=\"t2\" value=\"");
      out.print(password);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Mobile</td>\n");
      out.write("                        <td><input type=\"text\" name=\"t3\" value=\"");
      out.print(mobile);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>City</td>\n");
      out.write("                        <td><input  list=\"t4\" name=\"t44\" value=\"");
      out.print(city);
      out.write("\"/>\n");
      out.write("                            <datalist id=\"t4\">\n");
      out.write("                                <option value=\"Pune\">\n");
      out.write("                                    <option value=\"Bhopal\">\n");
      out.write("                                        <option value=\"Delhi\">\n");
      out.write("                                            <option value=\"Mumbai\">\n");
      out.write("                                                <option value=\"Banglore\">\n");
      out.write("                            </datalist>\n");
      out.write("                                </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Address</td>\n");
      out.write("                        <td><input name=\"t5\" value=\"");
      out.print(address);
      out.write("\" rows=\"4\" cols=\"20\"\n");
      out.write("                            /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                   <tr>\n");
      out.write("                        <td>Experience</td>\n");
      out.write("                        <td><input  list=\"t7\" name=\"t77\" value=\"");
      out.print(experience);
      out.write("\"/>\n");
      out.write("                            <datalist id=\"t7\">\n");
      out.write("                                <option value=\"Pune\">\n");
      out.write("                                    <option value=\"Bhopal\">\n");
      out.write("                                        <option value=\"Delhi\">\n");
      out.write("                                            <option value=\"Mumbai\">\n");
      out.write("                                                <option value=\"Banglore\">\n");
      out.write("                            </datalist>\n");
      out.write("                                </td>\n");
      out.write("                    </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <td>Photo</td>\n");
      out.write("                        <td><input type=\"file\" name=\"t6\" value=\"");
      out.print(photo);
      out.write("\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                      \n");
      out.write("                    <tr>\n");
      out.write("                        <td></td>\n");
      out.write("                        <td><input type=\"submit\" name=\"b2\" value=\"Update\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
