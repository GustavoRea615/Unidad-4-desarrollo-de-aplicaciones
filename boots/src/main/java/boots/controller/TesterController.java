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

import boots.model.Tester;
import boots.service.TesterService;

@Controller
public class TesterController {

	@Autowired
	private TesterService testerService;

		
	@GetMapping("/all-testers")
	public String allTesters(HttpServletRequest request){
		request.setAttribute("testers", testerService.findAll());
		request.setAttribute("mode", "MODE_TESTERS");
		return "tester";
	}
	
	@GetMapping("/new-tester")
	public String newTester(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "tester";
	}
	
	@PostMapping("/save-tester")
	public String saveTester(@ModelAttribute Tester tester, BindingResult bindingResult, HttpServletRequest request){
		tester.setLastUpdate(new Date());
		testerService.save(tester);
		request.setAttribute("testers", testerService.findAll());
		request.setAttribute("mode", "MODE_TESTERS");
		return "tester";
	}
	
	@GetMapping("/update-tester")
	public String updateTester(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("tester", testerService.findTester(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "tester";
	}
	
	@GetMapping("/delete-tester")
	public String deleteTester(@RequestParam int id, HttpServletRequest request){
		testerService.delete(id);
		request.setAttribute("testers", testerService.findAll());
		request.setAttribute("mode", "MODE_TESTERS");
		return "tester";
	}
}
