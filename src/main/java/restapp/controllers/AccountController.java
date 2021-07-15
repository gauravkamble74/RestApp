package restapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import restapp.entities.Account;
import restapp.models.AccountOperations;


@RestController
public class AccountController {
	
	@Autowired
	AccountOperations AccountOperations;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	/*
	@ResponseBody
	@RequestMapping(value= "/getallacc" , method= RequestMethod.POST)
	public List<Account> getAccounts() {
		return "";
	}
	*/
	
	@PostMapping("/addAcc")
	public ResponseEntity<?> addAccount(@RequestBody Account account)
	{
		AccountOperations.createAccount(account);
		return new ResponseEntity<Account>(account,HttpStatus.OK);
	}
}
