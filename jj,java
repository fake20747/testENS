import java.sql.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
        response.setContentType("text/html;charset=UTF-8");
        
        try ( PrintWriter out = response.getWriter() ) 
        {
            String userName = request.getParameter("userName");
            String userPass = request.getParameter("userPass");

            MyDb db = new MyDb();
            Connection con = db.getCon();
  
            Statement stmt = con.createStatement();  
            ResultSet resultSet = stmt.executeQuery("select * from users where name='" + userName + "' and password='" + userPass + "'");
            
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();

            out.println("<pre><table>");
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) 
                        out.println("\n\n");
                    
                    String columnValue = resultSet.getString(i);
                    out.println("<tr><td>" + rsmd.getColumnName(i) + "</td><td>" + columnValue + "</td></tr>");
                }
            }
            out.println("</table></pre>");
        } catch (IOException | SQLException ex) {
            Logger.getLogger(MyServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
