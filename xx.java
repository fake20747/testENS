import testcasesupport.*;

import javax.servlet.http.*;


public class boqiugwb extends AbstractTestCaseServlet
{
    
    public void oiqywbmks(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;
        if (true)
        {
            data = ""; 
            
            {
                Cookie cookieSources[] = request.getCookies();
                if (cookieSources != null)
                {
                    
                    data = cookieSources[0].getValue();
                }
            }
        }
        else
        {
            
            data = null;
        }

        String osCommand;
        if(System.getProperty("os.name").toLowerCase().indexOf("win") >= 0)
        {
            
            osCommand = "c:\\WINDOWS\\SYSTEM32\\cmd.exe /c dir ";
        }
        else
        {
            
            osCommand = "/bin/ls ";
        }

        
        Process process = Runtime.getRuntime().exec(osCommand + data);
        process.waitFor();

    }
}
