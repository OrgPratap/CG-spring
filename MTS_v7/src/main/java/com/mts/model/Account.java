package com.mts.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

// bean / domain-obj / BO / entity/ DTO

@Entity
@Table(name = "ACCOUNTS", schema = "MTS")
public class Account {

	@Id
	private String num;
	private String name;
	private double balance;
	@Enumerated(EnumType.ORDINAL)
	private AccountType type;
	@Enumerated(EnumType.ORDINAL)
	private AccountStatus status;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

}
