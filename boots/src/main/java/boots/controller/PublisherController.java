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


import boots.model.Publisher;
import boots.service.PublisherService;

@Controller
public class PublisherController {

	@Autowired
	private PublisherService publisherService;

		
	@GetMapping("/all-publishers")
	public String allPublishers(HttpServletRequest request){
		request.setAttribute("publishers", publisherService.findAll());
		request.setAttribute("mode", "MODE_PUBLISHERS");
		return "publisher";
	}
	
	@GetMapping("/new-publisher")
	public String newPublisher(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "publisher";
	}
	
	@PostMapping("/save-publisher")
	public String savePublisher(@ModelAttribute Publisher publisher, BindingResult bindingResult, HttpServletRequest request){
		publisher.setLastUpdate(new Date());
		publisherService.save(publisher);
		request.setAttribute("publishers", publisherService.findAll());
		request.setAttribute("mode", "MODE_PUBLISHERS");
		return "publisher";
	}
	
	@GetMapping("/update-publisher")
	public String updatePublisher(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("publisher", publisherService.findPublisher(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "publisher";
	}
	
	@GetMapping("/delete-publisher")
	public String deletePublisher(@RequestParam int id, HttpServletRequest request){
		publisherService.delete(id);
		request.setAttribute("publishers", publisherService.findAll());
		request.setAttribute("mode", "MODE_PUBLISHERS");
		return "publisher";
	}
}
