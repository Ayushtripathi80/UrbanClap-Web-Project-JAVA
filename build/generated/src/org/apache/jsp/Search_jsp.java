package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import utility.DBConnect;

public final class Search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("    </head>\n");
      out.write("    <body align='center'>\n");
      out.write("        ");
 if(session.getAttribute("username")==null)
        {
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MainHeader.jspf", out, false);
      out.write(" \n");
      out.write("       ");
 }
else
{

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "customerHeader.jspf", out, false);
      out.write(' ');
      out.write('\n');
}
                  
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("        <h1>Search Service Provider</h1>\n");
      out.write("        <hr>\n");
      out.write("       \n");
      out.write("        <form>\n");
      out.write("            <table align='center'>\n");
      out.write("               \n");
      out.write("                 <td>Type</td>\n");
      out.write("                        <td><select name=\"t4\" required>\n");
      out.write("                                <option>Electrician</option>\n");
      out.write("                                <option>Plumber</option>\n");
      out.write("                                <option>Painter</option>\n");
      out.write("                                <option>Carpenter</option>\n");
      out.write("                                <option>Medical</option>\n");
      out.write("                                <option>Other</option>\n");
      out.write("\n");
      out.write("                             </select></td>\n");
      out.write("             \n");
      out.write("                   <td>City</td>\n");
      out.write("                        <td><select name=\"t6\" required=\"\">\n");
      out.write("                                <option>Jabalpur</option>\n");
      out.write("                                <option>Bhopal</option>\n");
      out.write("                                <option>Indore</option>\n");
      out.write("                                <option>Delhi</option>\n");
      out.write("                                <option>Mumbai</option>\n");
      out.write("                                <option>Pune</option>\n");
      out.write("                                <option>Bangalore</option>\n");
      out.write("                            </select></td>\n");
      out.write("             \n");
      out.write("                    <td>\n");
      out.write("            <input type=\"submit\" value=\"SEARCH\" name=\"b2\" />\n");
      out.write("                 </td>\n");
      out.write("             \n");
      out.write("              \n");
      out.write("            \n");
      out.write("            </tbody>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <table align='center'>\n");
      out.write("            <tr>\n");
      out.write("                <td>Photo</td>\n");
      out.write("                <td>Name</td>\n");
      out.write("                <td>Mobile</td>\n");
      out.write("                <td>Address</td>\n");
      out.write("                <td>City</td>     \n");
      out.write("                <td>Experience</td>\n");
      out.write("    \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            ");

                if(request.getParameter("b2")!=null)
                {
                    try
                    {
                        String sql="select * from registration1 where trim(utype)='"
                                +request.getParameter("t4")+"' "
                                + " and trim(City)='"+request.getParameter("t6")+"'";
                        
                         DBConnect x=new DBConnect();
                        ResultSet rs=x.queryReturner(sql);
                        while(rs.next())
                        {
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                             <td> <img src = \"photos/");
      out.print(rs.getString(8).trim());
      out.write("\" height =100 width=100 ></td>\n");
      out.write("                   \n");
      out.write("                           <td>");
      out.print(rs.getString(1));
      out.write("</td>\n");
      out.write("                       <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                           <td>");
      out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                             <td>");
      out.print(rs.getString(9));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");


                        }
                    }
                    catch(Exception ex)
                    {
                        out.println(ex);
                    }
                }
                
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
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
