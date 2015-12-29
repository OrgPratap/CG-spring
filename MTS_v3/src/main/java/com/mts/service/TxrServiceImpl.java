package com.mts.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mts.model.Account;
import com.mts.repository.AccountRepository;
import com.mts.spring.RepositoryQualifer;

//@Component("txrService")
@Service("txrService")
public class TxrServiceImpl implements TxrService {
	private static Logger logger = Logger.getLogger(TxrService.class);

	private String txrType = null;

	private AccountRepository accountRepo;

	// @Required
	// public void setTxrType(String txrType) {
	// logger.info("txrType " + txrType + " , injected thru setter");
	// this.txrType = txrType;
	// }

	@Autowired(required = true)
	@Qualifier("jdbcAccRepo")
	public void setAccountRepo(AccountRepository accountRepo) {
		this.accountRepo = accountRepo;
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

	public void init() {
		logger.info("txrService :: init()");
	}

	public void destroy() {
		logger.info("txrService :: destroy");
	}

}
