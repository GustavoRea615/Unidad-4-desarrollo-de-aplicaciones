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

import boots.model.Manager;
import boots.service.ManagerService;

@Controller
public class ManagerController {

	@Autowired
	private ManagerService managerService;

		
	@GetMapping("/all-managers")
	public String allManagers(HttpServletRequest request){
		request.setAttribute("managers", managerService.findAll());
		request.setAttribute("mode", "MODE_MANAGERS");
		return "manager";
	}
	
	@GetMapping("/new-manager")
	public String newManager(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "manager";
	}
	
	@PostMapping("/save-manager")
	public String saveManager(@ModelAttribute Manager manager, BindingResult bindingResult, HttpServletRequest request){
		manager.setLastUpdate(new Date());
		managerService.save(manager);
		request.setAttribute("managers", managerService.findAll());
		request.setAttribute("mode", "MODE_MANAGERS");
		return "manager";
	}
	
	@GetMapping("/update-manager")
	public String updateManager(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("manager", managerService.findManager(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "manager";
	}
	
	@GetMapping("/delete-manager")
	public String deleteManager(@RequestParam int id, HttpServletRequest request){
		managerService.delete(id);
		request.setAttribute("managers", managerService.findAll());
		request.setAttribute("mode", "MODE_MANAGERS");
		return "manager";
	}
}
