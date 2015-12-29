package com.mts.repository;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

//@Component("jdbcAccRepo")
@Repository("jdbcAccRepo")
public class JdbcAccountRepository implements AccountRepository {

	private static Logger logger = Logger.getLogger(AccountRepository.class);

	private DataSource dataSource;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
		logger.info("dataSource injected to jdbcAccRepo thru constructor");
		logger.info("jdbcAccRep instance created....");
	}

	@Override
	public Account load(String num) {
		logger.info("loading account:" + num);
		return null;
	}

	@Override
	public void update(Account account) {
		logger.info("updaing account:");
	}

}
