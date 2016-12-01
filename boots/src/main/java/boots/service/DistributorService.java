package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.DistributorRepository;
import boots.model.Distributor;


@Service @Transactional
public class DistributorService {

	private final DistributorRepository distributorRepository;

	public DistributorService(DistributorRepository distributorRepository) {
		super();
		this.distributorRepository = distributorRepository;
	}
	
	public List <Distributor> findAll(){
		List <Distributor> distributors= new ArrayList<>();
		for(Distributor distributor: distributorRepository.findAll()){
			distributors.add(distributor);
			
		}
		return distributors;
	}
	
	public Distributor findDistributor(int id){
		return distributorRepository.findOne(id);
	}

	public void save(Distributor distributor){
		distributorRepository.save(distributor);
	}
	
	public void delete(int id){
		distributorRepository.delete(id);
	}
}
