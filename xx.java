import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.*;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Claims;

public class MyServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException {
        response.setContentType("text/html;charset=UTF-8");
        
        public static HashMap<String, String> accountLookup(String accountId, String jwt) throws Exception{

        if (jwt == null) { ;
            throw new LoggedOutException("User is not logged in");
        } else {
            Claims claims = Jwts.parser()
                    .setSigningKey("Key".getBytes("UTF-8"))
                    .parseClaimsJws(jwt).getBody();

            if ((claims.get("logged_in")).toString().equals("true")) {
                Statement stmt = con.createStatement();
                ResultSet rs=stmt.executeQuery("SELECT username FROM tbl_user WHERE id = '" + accountId + "';");

                if (!rs.next()) {
                    con.close();
                    throw new Exception("Account not found");
                }

                String user = new String();
                user = rs.getString("username");
                rs=stmt.executeQuery("SELECT balance, dob FROM tbl_account WHERE user_id = '" + accountId + "';");
                HashMap<String, String> results = new HashMap<String, String>();

                if(rs.next()){
                    results.put("balance", rs.getString("balance").toString());
                    results.put("dob", rs.getString("dob").toString());
                    results.put("username", user);

                }
                con.close();

                return results;
            } else {
                throw new LoggedOutException("User is not logged in");
            }
        }
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
