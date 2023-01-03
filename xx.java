import testcasesupport.*;

import javax.servlet.http.*;

import java.util.StringTokenizer;

public class lkajspcw extends AbstractTestCaseServlet
{
    
    private boolean privateTrue = true;
    private boolean privateFalse = false;

    
    public void mnvbjkee(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (privateTrue)
        {
            data = ""; 
            
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken(); 
                    if(token.startsWith("id=")) 
                    {
                        data = token.substring(3); 
                        break; 
                    }
                }
            }
        }
        else
        {
            
            data = null;
        }

        if (data != null)
        {
            
            response.sendError(404, "<br>uweygr() - Parameter name has value " + data);
        }

    }
}
