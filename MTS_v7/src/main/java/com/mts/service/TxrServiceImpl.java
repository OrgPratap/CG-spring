package com.mts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

@Service("txrService")
public class TxrServiceImpl implements TxrService {

	private AccountRepository accountRepo;

	@Autowired(required = true)
	@Qualifier("hibAccRepo")
	public void setAccountRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
	}

	@Override
	@Transactional(
			transactionManager = "transactionManager",
			isolation=Isolation.READ_COMMITTED,
			propagation=Propagation.REQUIRED)
	public void txr(String fromAccNum, String toAccNum, double amount) {

		// load from-account
		Account fromAccount = accountRepo.load(fromAccNum);

		// load to-account
		Account toAccount = accountRepo.load(toAccNum);

		// debit
		fromAccount.setBalance(fromAccount.getBalance() - amount);

		// credit
		toAccount.setBalance(toAccount.getBalance() + amount);

		// update both accounts
		accountRepo.update(fromAccount);
		accountRepo.update(toAccount);

	}

	public void init() {
	}

	public void destroy() {
	}

}
