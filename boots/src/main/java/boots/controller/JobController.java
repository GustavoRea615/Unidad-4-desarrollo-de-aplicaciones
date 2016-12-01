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

import boots.model.Job;
import boots.service.JobService;

@Controller
public class JobController {

	@Autowired
	private JobService jobService;

		
	@GetMapping("/all-jobs")
	public String allJobs(HttpServletRequest request){
		request.setAttribute("jobs", jobService.findAll());
		request.setAttribute("mode", "MODE_JOBS");
		return "job";
	}
	
	@GetMapping("/new-job")
	public String newJob(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "job";
	}
	
	@PostMapping("/save-job")
	public String saveJob(@ModelAttribute Job job, BindingResult bindingResult, HttpServletRequest request){
		jobService.save(job);
		request.setAttribute("jobs", jobService.findAll());
		request.setAttribute("mode", "MODE_JOBS");
		return "job";
	}
	
	@GetMapping("/update-job")
	public String updateJob(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("job", jobService.findJob(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "job";
	}
	
	@GetMapping("/delete-job")
	public String deleteJob(@RequestParam int id, HttpServletRequest request){
		jobService.delete(id);
		request.setAttribute("jobs", jobService.findAll());
		request.setAttribute("mode", "MODE_JOBS");
		return "job";
	}
}
