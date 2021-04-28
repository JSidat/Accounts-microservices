package com.bae.starterproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bae.starterproject.domain.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {

	Account findByUsername(String username);

}
