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

import boots.model.Account;
import boots.service.AccountService;


@Controller
public class AccountController {

	@Autowired
	private AccountService accountService;

		
	@GetMapping("/all-accounts")
	public String allAccount(HttpServletRequest request){
		request.setAttribute("accounts", accountService.findAll());
		request.setAttribute("mode", "MODE_ACCOUNTS");
		return "account";
	}
	
	@GetMapping("/new-account")
	public String newAccount(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "account";
	}
	
	@PostMapping("/save-account")
	public String saveAccount(@ModelAttribute Account account, BindingResult bindingResult, HttpServletRequest request){
		account.setLastUpdate(new Date());
		accountService.save(account);
		request.setAttribute("accounts", accountService.findAll());
		request.setAttribute("mode", "MODE_ACCOUNTS");
		return "account";
	}
	
	@GetMapping("/update-account")
	public String updateAccount(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("account", accountService.findAccount(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "account";
	}
	
	@GetMapping("/delete-account")
	public String deleteAccount(@RequestParam int id, HttpServletRequest request){
		accountService.delete(id);
		request.setAttribute("accounts", accountService.findAll());
		request.setAttribute("mode", "MODE_ACCOUNTS");
		return "account";
	}
}
