import java.io.*;


class MainClass{
	public static void main()   {
public void index(HttpServletResponse res, String value) {
 res.setHeader("Set-Cookie", value);
 Cookie cookie = new Cookie("jsessionid", value);
 res.addCookie(cookie);
 }
	}
}
