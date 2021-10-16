package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reply_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "servitorHeader.jspf", out, false);
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body align=\"center\">\n");
      out.write("  <h2>Book Customer Request</h2>\n");
      out.write("  <table border=\"1\" align=\"center\">\n");
      out.write("      <thead>\n");
      out.write("          <tr>\n");
      out.write("              <th>RESPONSE</th>\n");
      out.write("          </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("          \n");
      out.write("          <tr>\n");
      out.write("              <td><textarea name=\"t1\" rows=\"4\" cols=\"20\">\n");
      out.write("                  </textarea></td>\n");
      out.write("          </tr>\n");
      out.write("               <tr>\n");
      out.write("              <th>CHARGES</th>\n");
      out.write("          </tr>\n");
      out.write("          <tr>\n");
      out.write("            <td><input  list=\"t2\" name=\"t2\" />\n");
      out.write("                    <label for=\"donation\">Donation Amount (USD):</label>\n");
      out.write("<input type=\"range\" name=\"donation\" id=\"donation\" list=\"donation_list\"\n");
      out.write("  step=\"5\" min=\"5\" max=\"200\">\n");
      out.write("<datalist id=\"donation_list\">\n");
      out.write("  <option>25</option>\n");
      out.write("  <option>50</option>\n");
      out.write("  <option>100</option>\n");
      out.write("  <option>200</option>\n");
      out.write("</datalist>\n");
      out.write("                </td>\n");
      out.write("         \n");
      out.write("          <tr>\n");
      out.write("              <td><input type=\"submit\" value=\"SUBMIT\" name=\"b2\" /></td>\n");
      out.write("          </tr>\n");
      out.write("      </tbody>\n");
      out.write("  </table>\n");
      out.write("\n");
      out.write("       \n");
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
