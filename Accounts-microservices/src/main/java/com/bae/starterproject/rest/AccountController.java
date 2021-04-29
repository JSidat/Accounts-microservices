package com.bae.starterproject.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.starterproject.domain.Account;
import com.bae.starterproject.service.AccountService;

@RestController
public class AccountController {

	private AccountService service;

	public AccountController(AccountService service) {
		super();
		this.service = service;
	}

	@PostMapping("/register")
	public ResponseEntity<Account> createAccount(@RequestBody Account account) {
		Account registeredAccount = this.service.register(account);
		return new ResponseEntity<Account>(registeredAccount, HttpStatus.CREATED);
	}

	@PutMapping("/addToQ/{message}")
	public void sendToQ(@PathVariable Account account) {
		this.service.register(account);
	}

}
