package com.mts.repository;

import com.mts.model.Account;

public interface AccountRepository {

	// data-accessing methods for CRUD oprn on Account data

	Account load(String num);

	void update(Account account);

}
