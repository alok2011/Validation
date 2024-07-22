package spring_web_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController 
{
	@RequestMapping("/")
	public String adminPage() {
		System.out.println("WebController.adminPage()");
		
		return "index.jsp";
	}

}
