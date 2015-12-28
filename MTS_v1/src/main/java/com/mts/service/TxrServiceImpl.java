package com.mts.service;

import org.apache.log4j.Logger;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;

public class TxrServiceImpl implements TxrService {

	private static Logger logger = Logger.getLogger(TxrService.class);

	private AccountRepository accountRepo;

	public TxrServiceImpl(AccountRepository accountRepo) {
		super();
		this.accountRepo = accountRepo;
		logger.info("accRepo injected to txrService thru constructor");
		logger.info("New txrService instance created");
	}

	@Override
	public void txr(String fromAccNum, String toAccNum, double amount) {

		logger.info("txr initiated...");

		// load from-account
		Account fromAccount = accountRepo.load(fromAccNum);

		// load to-account
		Account toAccount = accountRepo.load(toAccNum);

		// debit

		// credit

		// update both accounts
		accountRepo.update(fromAccount);
		accountRepo.update(toAccount);

		logger.info("txr successfull");

	}

}
