package boots.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import boots.service.AccountService;
import boots.service.CustomerService;
import boots.service.DesingService;
import boots.service.DevelopmentService;
import boots.service.DistributorService;
import boots.service.JobService;
import boots.service.ManagerService;
import boots.service.ProviderService;
import boots.service.PublisherService;
import boots.service.TaskService;
import boots.service.TesterService;

@RestController
public class Controller {
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private DesingService desingService;
	
	@Autowired
	private DevelopmentService developmentService;
	
	@Autowired
	private PublisherService publisherService;
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private DistributorService distributorService;
	
	@Autowired
	private ManagerService managerService;
	
	@Autowired
	private TesterService testerService;
	
	@Autowired
	private ProviderService providerService;
	
	@Autowired
	private JobService jobService;
	
	@GetMapping("/hello")
	public String hello(){
		return "Hello World forever";
		
	}
	/*
	@GetMapping("/all-tasks")
	public String allTasks(){
		return taskService.findAll().toString();
		
	}
	
	@GetMapping("/save")
	public String allTasks(@RequestParam String name, @RequestParam String desc){
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		return "Task saved!";
		
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam int id){
		taskService.delete(id);
		return "Task deleted!";
		
	}
*/
}
