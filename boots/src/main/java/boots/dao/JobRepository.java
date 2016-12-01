package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Job;

public interface JobRepository extends CrudRepository<Job, Integer>{

}
