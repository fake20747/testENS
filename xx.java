import java.sql.*;

 class MainClass{ 
	 public static void main(String[] args) {
Class.forName("com.mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xxxx","root","root");
 Statement stmt=con.createStatement();

try {
   ResultSet rs=stmt.executeQuery("SELECT user_id FROM user_data WHERE user_name ='" + args[0] + "' and user_password='" + args[1] + "'");
 }
   catch(Exception e) {
 System.out.println(e);
  }
 
}	}
