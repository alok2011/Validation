package spring_web_app.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import spring_web_app.condition.User;

@Controller
public class login
{
	User u = new User();
	
	@RequestMapping("/login")
	public String login_user()
	{
		System.out.println("login.login_user()");
		return "login.jsp";
	}
	
	@PostMapping("/userlogin")
	public String Userdata(@RequestParam("name")String username , @RequestParam("password")String password , Model model  ) 
	{
		for(User user: u.list)
		{
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) 
			{
				System.out.println("login.Userdata()");
//				String s =user.getName();
				model.addAttribute("user",user);
				return "profile.jsp";
			}
		
		}
		return "error.jsp";
	
		
	}
	
	@RequestMapping("/registration")
	public String regis() 
	{
		return "registration.jsp";
	}
	
	@PostMapping("/registerUser")
	public String registered(@ModelAttribute User user)
	{
		u.list.add(user);
		System.out.println(user);
		return "succes.jsp";
	}

	
	

}
