package com.bae.starterproject.service;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bae.starterproject.domain.Account;
import com.bae.starterproject.repo.AccountRepo;

@Service
public class AccountService {

	private AccountRepo repo;

	private RestTemplate rest;

	private JmsTemplate jms;

	public AccountService(AccountRepo repo, RestTemplate rest, JmsTemplate jms) {
		super();
		this.repo = repo;
		this.rest = rest;
		this.jms = jms;
	}

	public Account register(Account account) {
		// replace with GET request
		String accNumber = this.rest.getForObject("http://num-gen-api/genNum", String.class);
		account.setAccountNumber(accNumber);
		// replace with GET request
		String prizeAsString = this.rest.getForObject("http://gen-prize-api/genPrize/" + accNumber, String.class);
		Integer prize = Integer.parseInt(prizeAsString);
		account.setPrize(prize);

		Account registeredAccount = this.repo.save(account);
		this.jms.convertAndSend("accountQ", registeredAccount.toString());
		return registeredAccount;
	}

}