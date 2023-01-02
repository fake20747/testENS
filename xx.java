import java.io.*;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;


class MainClass{
	public static void main()  {

}
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
 String input = req.getParameter("input");
 ScriptEngineManager manager = new ScriptEngineManager();
 ScriptEngine engine = manager.getEngineByName("JavaScript");
 engine.eval(input);
}
 
}
