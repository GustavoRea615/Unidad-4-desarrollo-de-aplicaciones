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

import boots.model.Distributor;
import boots.service.DistributorService;

@Controller
public class DistributorController {

	@Autowired
	private DistributorService distributorService;

		
	@GetMapping("/all-distributors")
	public String allDistributors(HttpServletRequest request){
		request.setAttribute("distributors", distributorService.findAll());
		request.setAttribute("mode", "MODE_DISTRIBUTORS");
		return "distributor";
	}
	
	@GetMapping("/new-distributor")
	public String newDistributor(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "distributor";
	}
	
	@PostMapping("/save-distributor")
	public String saveDistributor(@ModelAttribute Distributor distributor, BindingResult bindingResult, HttpServletRequest request){
		distributor.setLastUpdate(new Date());
		distributorService.save(distributor);
		request.setAttribute("distributors", distributorService.findAll());
		request.setAttribute("mode", "MODE_DISTRIBUTORS");
		return "distributor";
	}
	
	@GetMapping("/update-distributor")
	public String updateDistributor(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("distributor", distributorService.findDistributor(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "distributor";
	}
	
	@GetMapping("/delete-distributor")
	public String deleteDistributor(@RequestParam int id, HttpServletRequest request){
		distributorService.delete(id);
		request.setAttribute("distributors", distributorService.findAll());
		request.setAttribute("mode", "MODE_DISTRIBUTORS");
		return "distributor";
	}
}
