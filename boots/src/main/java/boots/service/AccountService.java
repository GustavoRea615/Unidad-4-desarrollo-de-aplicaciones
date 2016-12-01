package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.AccountRepository;
import boots.model.Account;

@Service @Transactional
public class AccountService {

	private final AccountRepository accountRepository;

	public AccountService(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}
	
	public List <Account> findAll(){
		List <Account> accounts= new ArrayList<>();
		for(Account account: accountRepository.findAll()){
			accounts.add(account);
			
		}
		return accounts;
	}
	
	public Account findAccount(int id){
		return accountRepository.findOne(id);
	}

	public void save(Account account){
		accountRepository.save(account);
	}
	
	public void delete(int id){
		accountRepository.delete(id);
	}
}
