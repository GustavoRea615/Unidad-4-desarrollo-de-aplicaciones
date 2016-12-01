package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Account;

public interface AccountRepository extends CrudRepository<Account, Integer>{

}
