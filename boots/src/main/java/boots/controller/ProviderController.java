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

import boots.model.Provider;
import boots.service.ProviderService;

@Controller
public class ProviderController {
	
	@Autowired
	private ProviderService providerService;

		
	@GetMapping("/all-providers")
	public String allProviders(HttpServletRequest request){
		request.setAttribute("providers", providerService.findAll());
		request.setAttribute("mode", "MODE_PROVIDERS");
		return "provider";
	}
	
	@GetMapping("/new-provider")
	public String newProvider(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "provider";
	}
	
	@PostMapping("/save-provider")
	public String saveProvider(@ModelAttribute Provider provider, BindingResult bindingResult, HttpServletRequest request){
		provider.setLastUpdate(new Date());
		providerService.save(provider);
		request.setAttribute("providers", providerService.findAll());
		request.setAttribute("mode", "MODE_PROVIDERS");
		return "provider";
	}
	
	@GetMapping("/update-provider")
	public String updateProvider(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("provider", providerService.findProvider(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "provider";
	}
	
	@GetMapping("/delete-provider")
	public String deleteProvider(@RequestParam int id, HttpServletRequest request){
		providerService.delete(id);
		request.setAttribute("providers", providerService.findAll());
		request.setAttribute("mode", "MODE_PROVIDERS");
		return "provider";
	}

}
