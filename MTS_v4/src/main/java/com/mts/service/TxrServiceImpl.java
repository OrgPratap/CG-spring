package com.mts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

//@Component("txrService")
@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepo;

	@Autowired(required = true)
	@Qualifier("jdbcAccRepo")
	public void setAccountRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	public void txr(String fromAccNum, String toAccNum, double amount) {

		// load from-account
		Account fromAccount = accountRepo.load(fromAccNum);

		// load to-account
		Account toAccount = accountRepo.load(toAccNum);

		// debit
		
		// credit

		// update both accounts
		accountRepo.update(fromAccount);
		accountRepo.update(toAccount);

	}

	public void init() {
	}

	public void destroy() {
	}

}
