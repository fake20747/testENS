import testcasesupport.*;

import javax.servlet.http.*;


import java.util.StringTokenizer;
import java.util.logging.Level;

public class bnmasbdoe extends AbstractTestCaseServlet
{
    public void jahsdhped(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        int data;
        if (IO.staticReturnsTrue())
        {
            data = Integer.MIN_VALUE; 
            
            {
                StringTokenizer tokenizer = new StringTokenizer(request.getQueryString(), "&");
                while (tokenizer.hasMoreTokens())
                {
                    String token = tokenizer.nextToken(); 
                    if(token.startsWith("id=")) 
                    {
                        try
                        {
                            data = Integer.parseInt(token.substring(3)); 
                        }
                        catch(NumberFormatException exceptNumberFormat)
                        {
                            IO.logger.log(Level.WARNING, "Number format exception reading id from query string", exceptNumberFormat);
                        }
                        break; 
                    }
                }
            }
        }
        else
        {
            
            data = 0;
        }

        if(IO.staticReturnsTrue())
        {
            
            int result = (int)(--data);
            IO.writeLine("result: " + result);
        }
    }
}
