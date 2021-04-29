package com.bae.starterproject.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

	@JmsListener(destination = "accountQ")
	public void receiveMessage(String message) {
		try {
			Thread.sleep(10_000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("RECEIVED: <" + message + ">");
	}
}
