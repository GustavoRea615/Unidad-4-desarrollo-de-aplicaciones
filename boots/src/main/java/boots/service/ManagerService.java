package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.ManagerRepository;
import boots.model.Manager;

@Service @Transactional
public class ManagerService {

	private final ManagerRepository managerRepository;

	public ManagerService(ManagerRepository managerRepository) {
		super();
		this.managerRepository = managerRepository;
	}
	
	public List <Manager> findAll(){
		List <Manager> managers= new ArrayList<>();
		for(Manager manager: managerRepository.findAll()){
			managers.add(manager);
			
		}
		return managers;
	}
	
	public Manager findManager(int id){
		return managerRepository.findOne(id);
	}

	public void save(Manager manager){
		managerRepository.save(manager);
	}
	
	public void delete(int id){
		managerRepository.delete(id);
	}
}
