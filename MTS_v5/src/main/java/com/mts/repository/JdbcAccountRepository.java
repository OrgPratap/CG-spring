package com.mts.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.mts.model.Account;

@Repository("jdbcAccRepo")
public class JdbcAccountRepository implements AccountRepository {

	private JdbcTemplate jdbcTemplate = null;

	@Autowired
	public JdbcAccountRepository(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Account load(String num) {
		String sql = "select * from mts.ACCOUNTS acc where acc.num=?";
		return jdbcTemplate.queryForObject(sql, new RowMapper<Account>() {
			@Override
			public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
				Account account = new Account();
				account.setNum(rs.getString(1));
				account.setName(rs.getString(2));
				account.setBalance(rs.getDouble(3));
				return account;
			}
		}, num);

	}

	@Override
	public void update(Account account) {
		String sql = "update mts.ACCOUNTS set balance=? where num=?";
		jdbcTemplate.update(sql, new Object[] { account.getBalance(), account.getNum() });
	}

}
