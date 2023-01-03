import testcasesupport.*;

import javax.servlet.http.*;


public class lkhjasow extends AbstractTestCaseServlet
{
    private String dataB;

    private void asdfqwer(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data = dataB;

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

    
    public void lkjhyuiw(HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        String data;

        
        data = request.getParameter("name");

        dataBad = data;
        asdfqwer(request, response);
    }
}
