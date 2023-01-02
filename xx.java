JSP Code:
<html>
 <head>
 <body>
 <title>Vulnerable Page</title>
 <form name="Vulnerable Form" method="POST" action"maliciousServlet">
 <label> Enter Text: </label>
 <input type="text" id="tBox">
 <input type="submit">
 </form>
 </body>
 </html>

Java Servlet:
package net.codejava.servlet;

import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/maliciousServlet")
 public class MaliciousServlet extends HttpServlet {
 static Logger log = Logger.getLogger(MaliciousServlet.class.getName());

protected void doPost(HttpServletRequest request, HttpServletResponse response) throwsServletException, IOException {
logger.info("MaliciousServlet's doPost() called");
String URL = request.getParameter("tbox");
 String path = getServletContext().getRealPath("/files");
 response.sendRedirect(path + URL);
  
}	}
