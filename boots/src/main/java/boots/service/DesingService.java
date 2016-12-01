package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.DesingRepository;
import boots.model.Desing;



@Service @Transactional
public class DesingService {

	private final DesingRepository desingRepository;

	public DesingService(DesingRepository desingRepository) {
		super();
		this.desingRepository = desingRepository;
	}
	
	public List <Desing> findAll(){
		List <Desing> desings= new ArrayList<>();
		for(Desing desing: desingRepository.findAll()){
			desings.add(desing);
			
		}
		return desings;
	}
	
	public Desing findDesing(int id){
		return desingRepository.findOne(id);
	}

	public void save(Desing desing){
		desingRepository.save(desing);
	}
	
	public void delete(int id){
		desingRepository.delete(id);
	}
}
