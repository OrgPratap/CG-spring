package com.controller;

import com.anno.RequestMapping;

public class AccountController {

	@RequestMapping(url = "/account")
	public void getAccountDet() {
		System.out.println("Loading account details...");
	}

	@RequestMapping(url = "/update")
	public void updateAccount() {
		System.out.println("Updaing account details...");
	}

}
