package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.TesterRepository;
import boots.model.Tester;

@Service @Transactional
public class TesterService {

	private final TesterRepository testerRepository;

	public TesterService(TesterRepository testerRepository) {
		super();
		this.testerRepository = testerRepository;
	}
	
	public List <Tester> findAll(){
		List <Tester> testers= new ArrayList<>();
		for(Tester tester: testerRepository.findAll()){
			testers.add(tester);
			
		}
		return testers;
	}
	
	public Tester findTester(int id){
		return testerRepository.findOne(id);
	}

	public void save(Tester tester){
		testerRepository.save(tester);
	}
	
	public void delete(int id){
		testerRepository.delete(id);
	}
}
