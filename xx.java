import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.Inject;
import javax.annotation.Resource;


class MainClass{
	public static void main()  {
private String name = null;
 @RequestMapping("/greet", method = GET) public String greet(String greetee) {
 if (greetee != null) {
 this.name = greetee;
}
 return "Hello " + this.name;
}
 
}	}
