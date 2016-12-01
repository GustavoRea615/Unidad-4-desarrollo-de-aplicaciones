package boots.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
	

	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("desing")
	public String desing(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "desing";
	}
	
	@GetMapping("task")
	public String task(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "task";
		
		
	}
	@GetMapping("customer")
	public String customer(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "customer";
	}
	
	@GetMapping("development")
	public String development(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "development";
	}
	
	@GetMapping("publisher")
	public String publisher(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "publisher";
	}
	
	@GetMapping("account")
	public String account(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "account";
	}
	
	@GetMapping("distributor")
	public String distributor(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "distributor";
	}
	
	@GetMapping("manager")
	public String manager(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "manager";
	}
	
	@GetMapping("provider")
	public String provider(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "provider";
	}
	
	@GetMapping("tester")
	public String tester(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "tester";
	}
	
	@GetMapping("job")
	public String job(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "job";
	}
}

