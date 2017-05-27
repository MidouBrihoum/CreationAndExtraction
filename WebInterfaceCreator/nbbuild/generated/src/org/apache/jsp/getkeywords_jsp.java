package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class getkeywords_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html >\n");
      out.write("    \n");
      out.write("    ");
 
Integer i ;	
if (null == session.getAttribute("numberkeywords")){
    
    i=0;
session.setAttribute("numberkeywords",i) ;}
else{
       i= (Integer)session.getAttribute("numberkeywords");
       i++;
        session.setAttribute("numberkeywords",i);
        }


      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <title>Simple HTML/CSS Contact Form</title>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("      <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"stepwizard\">\n");
      out.write("    <div class=\"stepwizard-row\">\n");
      out.write("\n");
      out.write("        <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-primary btn-circle\"disabled=\"disabled\">1</button>\n");
      out.write("            <p>keywords  (");
 out.print(i);
      out.write(")</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default btn-circle\"disabled=\"disabled\">2</button>\n");
      out.write("            <p>inputs</p>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default btn-circle\" disabled=\"disabled\">3</button>\n");
      out.write("            <p>outputs</p>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("         <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default btn-circle\" disabled=\"disabled\">4</button>\n");
      out.write("            <p>preconditions</p>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("         <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default btn-circle\" disabled=\"disabled\">5</button>\n");
      out.write("            <p>postconditions</p>\n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("         <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\" class=\"btn btn-default btn-circle\" disabled=\"disabled\">6</button>\n");
      out.write("            <p>operation</p>\n");
      out.write("        </div> \n");
      out.write("        \n");
      out.write("        <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\"  class=\"btn btn-default btn-circle\" disabled=\"disabled\">7</button>\n");
      out.write("            <p>confirmation</p>\n");
      out.write("        </div>   \n");
      out.write("        <div class=\"stepwizard-step\">\n");
      out.write("            <button type=\"button\"  class=\"btn btn-default btn-circle\" disabled=\"disabled\">8</button>\n");
      out.write("            <p>service</p>\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div class=\"container\"> \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <form id=\"contact\" action=\"addkeywords1\" method=\"get\">\n");
      out.write("    <h3>Keywords (");
 out.print(i);
      out.write(")</h3>\n");
      out.write("    <h4>veuillez introduire un mot clé</h4>\n");
      out.write("    <fieldset>\n");
      out.write("      <input placeholder=\"mot clé\" type=\"text\" tabindex=\"1\" name=\"keyword\" required autofocus>\n");
      out.write("    </fieldset>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    <fieldset>\n");
      out.write("      <button name=\"other\" value=\"other\" type=\"submit\" id=\"contact-submit\" data-submit=\"...Sending\">ajouter</button>\n");
      out.write("    </fieldset>\n");
      out.write("   \n");
      out.write("    <fieldset>\n");
      out.write("      <button name=\"fin\" value=\"fin\" type=\"submit\" id=\"contact-submit2\" formnovalidate>suivant</button>\n");
      out.write("    </fieldset>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");
      out.write("    <p class=\"copyright\">ICE Creator</a></p>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("</body>\n");
      out.write("</html>");
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
