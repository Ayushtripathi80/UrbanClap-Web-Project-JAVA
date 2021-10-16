package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<link href='http://fonts.googleapis.com/css?family=Bitter' rel='stylesheet' type='text/css'>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".form-style-10{\n");
      out.write("\twidth:450px;\n");
      out.write("\tpadding:30px;\n");
      out.write("\tmargin:40px auto;\n");
      out.write("\tbackground: #FFF;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\t-webkit-border-radius:10px;\n");
      out.write("\t-moz-border-radius: 10px;\n");
      out.write("\tbox-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);\n");
      out.write("\t-moz-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);\n");
      out.write("\t-webkit-box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.13);\n");
      out.write("}\n");
      out.write(".form-style-10 .inner-wrap{\n");
      out.write("\tpadding: 30px;\n");
      out.write("\tbackground: #F8F8F8;\n");
      out.write("\tborder-radius: 6px;\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("}\n");
      out.write(".form-style-10 h1{\n");
      out.write("\tbackground: #2A88AD;\n");
      out.write("\tpadding: 20px 30px 15px 30px;\n");
      out.write("\tmargin: -30px -30px 30px -30px;\n");
      out.write("\tborder-radius: 10px 10px 0 0;\n");
      out.write("\t-webkit-border-radius: 10px 10px 0 0;\n");
      out.write("\t-moz-border-radius: 10px 10px 0 0;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);\n");
      out.write("\tfont: normal 30px 'Bitter', serif;\n");
      out.write("\t-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\n");
      out.write("\t-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\n");
      out.write("\tbox-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\n");
      out.write("\tborder: 1px solid #257C9E;\n");
      out.write("}\n");
      out.write(".form-style-10 h1 > span{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tmargin-top: 2px;\n");
      out.write("\tfont: 13px Arial, Helvetica, sans-serif;\n");
      out.write("}\n");
      out.write(".form-style-10 label{\n");
      out.write("\tdisplay: block;\n");
      out.write("        \n");
      out.write("\tfont: 13px Arial, Helvetica, sans-serif;\n");
      out.write("\tcolor: #666;\n");
      out.write("\tmargin-bottom: 15px;\n");
      out.write("}\n");
      out.write(".form-style-10 input[type=\"text\"],\n");
      out.write(".form-style-10 input[type=\"date\"],\n");
      out.write(".form-style-10 input[type=\"datetime\"],\n");
      out.write(".form-style-10 input[type=\"email\"],\n");
      out.write(".form-style-10 input[type=\"number\"],\n");
      out.write(".form-style-10 input[type=\"search\"],\n");
      out.write(".form-style-10 input[type=\"time\"],\n");
      out.write(".form-style-10 input[type=\"url\"],\n");
      out.write(".form-style-10 input[type=\"password\"],\n");
      out.write(".form-style-10 textarea,\n");
      out.write(".form-style-10 select {\n");
      out.write("\tdisplay: block;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("\t-webkit-box-sizing: border-box;\n");
      out.write("\t-moz-box-sizing: border-box;\n");
      out.write("\twidth: 100%;\n");
      out.write("\tpadding: 8px;\n");
      out.write("\tborder-radius: 6px;\n");
      out.write("\t-webkit-border-radius:6px;\n");
      out.write("\t-moz-border-radius:6px;\n");
      out.write("\tborder: 2px solid #fff;\n");
      out.write("\tbox-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);\n");
      out.write("\t-moz-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);\n");
      out.write("\t-webkit-box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.33);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-style-10 .section{\n");
      out.write("\tfont: normal 20px 'Bitter', serif;\n");
      out.write("\tcolor: #2A88AD;\n");
      out.write("\tmargin-bottom: 5px;\n");
      out.write("}\n");
      out.write(".form-style-10 .section span {\n");
      out.write("\tbackground: #2A88AD;\n");
      out.write("\tpadding: 5px 10px 5px 10px;\n");
      out.write("\tposition: absolute;\n");
      out.write("\tborder-radius: 50%;\n");
      out.write("\t-webkit-border-radius: 50%;\n");
      out.write("\t-moz-border-radius: 50%;\n");
      out.write("\tborder: 4px solid #fff;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tmargin-left: -45px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\tmargin-top: -3px;\n");
      out.write("}\n");
      out.write(".form-style-10 input[type=\"button\"], \n");
      out.write(".form-style-10 input[type=\"submit\"]{\n");
      out.write("\tbackground: #2A88AD;\n");
      out.write("\tpadding: 8px 20px 8px 20px;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\t-webkit-border-radius: 5px;\n");
      out.write("\t-moz-border-radius: 5px;\n");
      out.write("\tcolor: #fff;\n");
      out.write("\ttext-shadow: 1px 1px 3px rgba(0, 0, 0, 0.12);\n");
      out.write("\tfont: normal 30px 'Bitter', serif;\n");
      out.write("\t-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\n");
      out.write("\t-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\n");
      out.write("\tbox-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.17);\n");
      out.write("\tborder: 1px solid #257C9E;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("}\n");
      out.write(".form-style-10 input[type=\"button\"]:hover, \n");
      out.write(".form-style-10 input[type=\"submit\"]:hover{\n");
      out.write("\tbackground: #2A6881;\n");
      out.write("\t-moz-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);\n");
      out.write("\t-webkit-box-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);\n");
      out.write("\tbox-shadow: inset 0px 2px 2px 0px rgba(255, 255, 255, 0.28);\n");
      out.write("}\n");
      out.write(".form-style-10 .privacy-policy{\n");
      out.write("\tfloat: right;\n");
      out.write("\twidth: 250px;\n");
      out.write("\tfont: 12px Arial, Helvetica, sans-serif;\n");
      out.write("\tcolor: #4D4D4D;\n");
      out.write("\tmargin-top: 10px;\n");
      out.write("\ttext-align: right;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "MainHeader.jspf", out, false);
      out.write("\n");
      out.write("       <div class=\"form-style-10\">\n");
      out.write("<h1>LOGIN<span>Login and Enjoy Our Service!</span></h1>\n");
      out.write("<form action=\"./LoginSubmit\" method=\"post\">\n");
      out.write("    <div class=\"section\"><span>:)</span>Login</div>\n");
      out.write("    <div class=\"inner-wrap\">\n");
      out.write("        <label>Email <input type=\"text\" name=\"t2\" placeholder=\"Enter Your Email\"  pattern=\"[^ @]*@[^ @]*\"/></label>\n");
      out.write("        <label>Password <input type=\"password\" name=\"t3\" placeholder=\"Enter Your Password\"/></label>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"button-section\">\n");
      out.write("     <input type=\"submit\" name=\"b1\" />\n");
      out.write("     <span class=\"privacy-policy\">\n");
      out.write("         <a href=\"registration.jsp\">New User??</a> \n");
      out.write("     </span>\n");
      out.write("    </div>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
