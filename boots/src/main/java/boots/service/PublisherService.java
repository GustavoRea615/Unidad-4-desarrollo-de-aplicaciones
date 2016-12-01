package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import boots.dao.PublisherRepository;
import boots.model.Publisher;

@Service @Transactional
public class PublisherService {
	
	private final PublisherRepository publisherRepository;

	public PublisherService(PublisherRepository publisherRepository) {
		super();
		this.publisherRepository = publisherRepository;
	}
	
	public List <Publisher> findAll(){
		List <Publisher> publishers= new ArrayList<>();
		for(Publisher publisher: publisherRepository.findAll()){
			publishers.add(publisher);
			
		}
		return publishers;
	}
	
	public Publisher findPublisher(int id){
		return publisherRepository.findOne(id);
	}

	public void save(Publisher publisher){
		publisherRepository.save(publisher);
	}
	
	public void delete(int id){
		publisherRepository.delete(id);
	}

}
