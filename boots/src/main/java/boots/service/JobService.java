package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.JobRepository;
import boots.model.Job;


@Service @Transactional
public class JobService {

	private final JobRepository jobRepository;

	public JobService(JobRepository jobRepository) {
		super();
		this.jobRepository = jobRepository;
	}
	
	public List <Job> findAll(){
		List <Job> jobs= new ArrayList<>();
		for(Job job: jobRepository.findAll()){
			jobs.add(job);
			
		}
		return jobs;
	}
	
	public Job findJob(int id){
		return jobRepository.findOne(id);
	}

	public void save(Job job){
		jobRepository.save(job);
	}
	
	public void delete(int id){
		jobRepository.delete(id);
	}
}
