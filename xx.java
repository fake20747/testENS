import testcasesupport.*;

import javax.servlet.http.*;

import java.net.URLEncoder;

public class kahsdlfp extends AbstractTestCaseServlet
{
    
    private static final int PRIVATE_STATIC_FINAL_FIVE = 5;

    public void lkasdpoe(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (PRIVATE_STATIC_FINAL_FIVE==5)
        {
            
            
            data = System.getProperty("user.home");
        }
        else
        {
            
            data = null;
        }

        if (PRIVATE_STATIC_FINAL_FIVE==5)
        {
            
            if (data != null)
            {
                response.addHeader("Location", "/author.jsp?lang=" + data);
            }
        }
    }
}
