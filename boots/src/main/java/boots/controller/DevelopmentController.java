package boots.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boots.model.Development;
import boots.service.DevelopmentService;

@Controller
public class DevelopmentController {

	@Autowired
	private DevelopmentService developmentService;

		
	@GetMapping("/all-developments")
	public String allDevelopments(HttpServletRequest request){
		request.setAttribute("developments", developmentService.findAll());
		request.setAttribute("mode", "MODE_DEVELOPMENTS");
		return "development";
	}
	
	@GetMapping("/new-development")
	public String newDevelopment(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "development";
	}
	
	@PostMapping("/save-development")
	public String saveDevelopment(@ModelAttribute Development development, BindingResult bindingResult, HttpServletRequest request){
		development.setLastUpdate(new Date());
		developmentService.save(development);
		request.setAttribute("developments", developmentService.findAll());
		request.setAttribute("mode", "MODE_DEVELOPMENTS");
		return "development";
	}
	
	@GetMapping("/update-development")
	public String updateDevelopment(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("development", developmentService.findDevelopment(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "development";
	}
	
	@GetMapping("/delete-development")
	public String deleteDevelopment(@RequestParam int id, HttpServletRequest request){
		developmentService.delete(id);
		request.setAttribute("developments", developmentService.findAll());
		request.setAttribute("mode", "MODE_DEVELOPMENTS");
		return "development";
	}
}
