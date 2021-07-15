package restapp.models;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import restapp.entities.Account;

@Component
public class AccountOperations {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//transactional is used only for create and update
	@Transactional
	public void createAccount(Account account) {
		
		this.hibernateTemplate.save(account);
	}
	
	//get all account
	public List<Account> getAccounts(){
		List<Account> accounts = this.hibernateTemplate.loadAll(Account.class);
		
		return accounts;
	}
	
	//delete any account 
	@Transactional
	public void deleteAccount(int accno) {
		Account acc = this.hibernateTemplate.load(Account.class,accno);
		this.hibernateTemplate.delete(acc);
		
	}
	
	//get details of any account
	public Account getAccount(int accno) {
		return this.hibernateTemplate.get(Account.class	,accno);
	}
	
	
}
