/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-10-26 04:24:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reregister_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"ISO-8859-1\">\r\n");
      out.write("    <script>\r\n");
      out.write("      alert(\" Registation Failed\");\r\n");
      out.write("    </script>\r\n");
      out.write("    <title>User Registration</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Reset some default styles */\r\n");
      out.write("        * {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            background-color: #f5f5f5;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav {\r\n");
      out.write("            background-color: #007BFF;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            display: flex;\r\n");
      out.write("            justify-content: space-between;\r\n");
      out.write("            align-items: center;\r\n");
      out.write("            padding: 10px 10px;\r\n");
      out.write("            margin-top: 0px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            font-size: 34px;\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("            font-family: \"Papyrus\", Cursive;\r\n");
      out.write("            color: #333;\r\n");
      out.write("            margin: 20px 0;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        nav a {\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            margin: 0px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            padding: 10px 10px;\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        form {\r\n");
      out.write("            width: 600px; /* Set the total width of the form */\r\n");
      out.write("            margin: 0 auto;\r\n");
      out.write("            background-color: #fff;\r\n");
      out.write("            padding: 20px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .form-col {\r\n");
      out.write("            width: 50%; /* Each column takes 50% width */\r\n");
      out.write("            float: left; /* Float columns left to create the two-column layout */\r\n");
      out.write("            box-sizing: border-box; /* Include padding and border in the width */\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        label {\r\n");
      out.write("            display: block;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"text\"],\r\n");
      out.write("        input[type=\"password\"],\r\n");
      out.write("        input[type=\"email\"],\r\n");
      out.write("        input[type=\"tel\"],\r\n");
      out.write("        select,\r\n");
      out.write("        textarea {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin: 5px 0;\r\n");
      out.write("            border: 1px solid #ccc;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        textarea {\r\n");
      out.write("            height: 80px; /* Set the desired height (4 rows) */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"submit\"] {\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            background-color: #007BFF;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-radius: 3px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=\"submit\"]:hover {\r\n");
      out.write("            background-color: #0056b3;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .checkbox-container {\r\n");
      out.write("            display: block;\r\n");
      out.write("            text-align: left;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .checkbox-container input {\r\n");
      out.write("            display: inline;\r\n");
      out.write("            margin-right: 5px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        footer {\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            color: #777;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav>\r\n");
      out.write("        <a href=\"#\" style=\"font-family: Brush Script MT, Cursive; font-size: 40px\">= MedicarePro.</a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <h1>User Registration</h1>\r\n");
      out.write("    \r\n");
      out.write("    <form action=\"insert\" method=\"post\">\r\n");
      out.write("        <div class=\"form-col\">\r\n");
      out.write("            <label for=\"firstName\">First Name:</label>\r\n");
      out.write("            <input type=\"text\" name=\"firstName\" required><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"surname\">Surname:</label>\r\n");
      out.write("            <input type=\"text\" name=\"surname\" required><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"gender\">Gender:</label>\r\n");
      out.write("            <select name=\"gender\" required>\r\n");
      out.write("                <option value=\"male\">Male</option>\r\n");
      out.write("                <option value=\"female\">Female</option>\r\n");
      out.write("                <option value=\"other\">Other</option>\r\n");
      out.write("            </select><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"address\">Address:</label>\r\n");
      out.write("            <textarea name=\"address\" rows=\"4\" required></textarea><br>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"checkbox-container\">\r\n");
      out.write("                <input type=\"checkbox\" id=\"terms\" required>\r\n");
      out.write("                Agree to <a href=\"terms.html\"  style=\"color: #007BFF\">terms</a> & <a href=\"condition.html\"  style=\"color: #007BFF\">conditions.</a></input>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"form-col\">\r\n");
      out.write("            <label for=\"email\">Email:</label>\r\n");
      out.write("            <input type=\"email\" name=\"email\" required><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"contactNumber\">Contact Number:</label>\r\n");
      out.write("            <input type=\"tel\" name=\"contactNumber\" required><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"username\">Username:</label>\r\n");
      out.write("            <input type=\"text\" name=\"username\" required><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"password\">Password:</label>\r\n");
      out.write("            <input type=\"password\" name=\"password\" required><br>\r\n");
      out.write("            \r\n");
      out.write("            <label for=\"confirmPassword\">Re-enter Password:</label>\r\n");
      out.write("            <input type=\"password\" name=\"confirmPassword\" required><br>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        <input type=\"submit\" value=\"Register\">\r\n");
      out.write("        <p style=\"font-size: 13px\">Already have an account <a href=\"login.jsp\" style=\"color: #007BFF\">Login</a></p>\r\n");
      out.write("    </form>\r\n");
      out.write("    <footer style=\"font-size: 10px\">\r\n");
      out.write("        &copy; 2023 MedicarePro Hospital Management System\r\n");
      out.write("    </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
