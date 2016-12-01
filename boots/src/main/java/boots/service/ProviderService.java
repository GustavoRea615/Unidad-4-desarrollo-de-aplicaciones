package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.ProviderRepository;
import boots.model.Provider;

@Service @Transactional
public class ProviderService {

	private final ProviderRepository providerRepository;

	public ProviderService(ProviderRepository providerRepository) {
		super();
		this.providerRepository = providerRepository;
	}
	
	public List <Provider> findAll(){
		List <Provider> providers= new ArrayList<>();
		for(Provider provider: providerRepository.findAll()){
			providers.add(provider);
			
		}
		return providers;
	}
	
	public Provider findProvider(int id){
		return providerRepository.findOne(id);
	}

	public void save(Provider provider){
		providerRepository.save(provider);
	}
	
	public void delete(int id){
		providerRepository.delete(id);
	}
}
