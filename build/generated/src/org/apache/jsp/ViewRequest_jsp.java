package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import utility.DBConnect;

public final class ViewRequest_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("       ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "servitorHeader.jspf", out, false);
      out.write("\n");
      out.write("       \n");
      out.write("       <h2 align=\"center\">Requests\n");
      out.write("           ");
      out.print(session.getAttribute("usercity"));
      out.write("\n");
      out.write("           ");
      out.print(session.getAttribute("usertype"));
      out.write("\n");
      out.write("       </h2>\n");
      out.write("       <form method=\"POST\" action=\"Reply.jsp\">\n");
      out.write("                  \n");
      out.write("           <table align=\"center\"border=\"1\">\n");
      out.write("               <thead>\n");
      out.write("                   <tr>\n");
      out.write("                      <th>PHOTO</th>\n");
      out.write("                       <th>NAME</th>\n");
      out.write("                       <th>DESCRIPTION</th>\n");
      out.write("                       <th>REQUIRED ON</th>\n");
      out.write("                         <th>ADDRESS</th>\n");
      out.write("                       <th>CONTACT NO</th>\n");
      out.write("                       <th>BOOK</th>\n");
      out.write("                 \n");
      out.write("                   </tr>\n");
      out.write("               </thead>\n");
      out.write("               <tbody>\n");
      out.write("                  ");

                   String type= session.getAttribute("usertype").toString().trim();
                  
                    try {
                        String sql = "select * from requirements where servitortype='"+type+"'";
                       
                        DBConnect x = new DBConnect();
                        ResultSet rs = x.queryReturner(sql);
                      
                     while (rs.next() ) {
             
               String email=rs.getString(2).trim();
                        String sql1 = "select * from registration1 where trim(email)='"+email
                                +"' and trim(city)=(select trim(city) from registration1 where trim(email)='"+
                            email+"')"    
                                ;
                        ResultSet rs1 = x.queryReturner(sql1);
                        while(rs1.next()){
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td><img src=\"photos/");
      out.print(rs1.getString(8).trim());
      out.write("\" height=\"150\" width=\"150\"  />      </td>\n");
      out.write("                   \n");
      out.write("                     <td>");
      out.print(rs1.getString(1));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                     <td>");
      out.print(rs1.getString(7));
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(rs1.getString(5));
      out.write("</td>\n");
      out.write("                    <td><input type=\"submit\" value=\"REPLY\" name=\"b1\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                      }
                     }
                       }
                       catch(Exception ex)
                       {
                           out.println(ex);
                       }
                
                
      out.write("\n");
      out.write("               </tbody>\n");
      out.write("           </table>\n");
      out.write("       </form>\n");
      out.write("\n");
      out.write("       </form>\n");
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
