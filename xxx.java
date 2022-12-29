import com.sun.net.httpserver.HttpExchange;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
//import java.util.logging.Level;
//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
        
public class MyServlet extends HttpServlet {
    
    static Logger logger = Logger.getLogger(MyServlet.class);
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        
        try ( PrintWriter out = response.getWriter() ) 
        { 
           String name = request.getParameter("name");
           out.write("Hello " + name);
        } catch (IOException ex) {
            //Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyServlet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyServlet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
