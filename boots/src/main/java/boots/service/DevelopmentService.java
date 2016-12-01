package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.DevelopmentRepository;
import boots.model.Development;


@Service @Transactional
public class DevelopmentService {
	
	private final DevelopmentRepository developmentRepository;

	public DevelopmentService(DevelopmentRepository developmentRepository) {
		super();
		this.developmentRepository = developmentRepository;
	}
	
	public List <Development> findAll(){
		List <Development> developments= new ArrayList<>();
		for(Development development: developmentRepository.findAll()){
			developments.add(development);
			
		}
		return developments;
	}
	
	public Development findDevelopment(int id){
		return developmentRepository.findOne(id);
	}

	public void save(Development development){
		developmentRepository.save(development);
	}
	
	public void delete(int id){
		developmentRepository.delete(id);
	}
}
