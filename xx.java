import com.sun.net.httpserver.HttpExchange;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;

import java.io.*;
import java.sql.SQLException;
import java.util.*;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;
import javax.xml.xpath.XPathConstants;
        
public class MyServlet extends HttpServlet {
    
    static Logger logger = Logger.getLogger(MyServlet.class);

    private static NamingEnumeration<SearchResult> search(String ousystem, String filter, SearchControls searchControls) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, NamingException {
        response.setContentType("text/html;charset=UTF-8");
        
        try ( PrintWriter out = response.getWriter() ) 
        { 

            String userName = request.getParameter("userName");
            String userPass = request.getParameter("userPass");
            
            String filter = "(&(uid=" + userName + ")(userPassword=" + userPass + "))"; 

            NamingEnumeration<SearchResult> results = MyServlet.search("ou=system", filter, new SearchControls()); // Noncompliant
            var x = results.hasMore();
            
           
        } catch (IOException ex) {
            //Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            java.util.logging.Logger.getLogger(MyServlet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (NamingException ex) {
            java.util.logging.Logger.getLogger(MyServlet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
