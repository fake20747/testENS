import java.io.*;


class MainClass{
	public static void main() throws Exception {
auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("SELECT * FROM users WHERE username = ?").passwordEncoder(new StandardPasswordEncoder());
 auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("SELECT * FROM users WHERE username = ?");
 auth.userDetailsService(...);
 auth.userDetailsService(...).passwordEncoder(new StandardPasswordEncoder());
 
}	}
