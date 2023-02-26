package mvcBasics;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class AddController {
	
	@RequestMapping(value = "/add", method= RequestMethod.GET)  
	public void add() {
		
		System.out.println("Proj is created");
	}

}
