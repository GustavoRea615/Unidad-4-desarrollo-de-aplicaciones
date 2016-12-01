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

import boots.model.Desing;
import boots.service.DesingService;

@Controller
public class DesingController {


	@Autowired
	private DesingService desingService;

	
	
	@GetMapping("/all-desings")
	public String allDesings(HttpServletRequest request){
		request.setAttribute("desings", desingService.findAll());
		request.setAttribute("mode", "MODE_DESINGS");
		return "desing";
	}
	
	@GetMapping("/new-desing")
	public String newDesing(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "desing";
	}
	
	@PostMapping("/save-desing")
	public String saveDesing(@ModelAttribute Desing desing, BindingResult bindingResult, HttpServletRequest request){
		desing.setLastUpdate(new Date());
		desingService.save(desing);
		request.setAttribute("desings", desingService.findAll());
		request.setAttribute("mode", "MODE_DESINGS");
		return "desing";
	}
	
	@GetMapping("/update-desing")
	public String updateDesing(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("desing", desingService.findDesing(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "desing";
	}
	
	@GetMapping("/delete-desing")
	public String deleteDesing(@RequestParam int id, HttpServletRequest request){
		desingService.delete(id);
		request.setAttribute("desings", desingService.findAll());
		request.setAttribute("mode", "MODE_DESINGS");
		return "desing";
	}
}
