package com.mts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NEW_ACCOUNTS", schema = "MTS")
public class Account {

	@Id
	@Column(name = "NUM")
	private String num;
	@Column(name = "NAME")
	private String name;
	private double balance;
	@Enumerated(EnumType.STRING)
	private AccountType type;
	@Enumerated(EnumType.STRING)
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
