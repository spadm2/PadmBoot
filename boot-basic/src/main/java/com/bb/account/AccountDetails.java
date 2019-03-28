package com.bb.account;

import java.util.UUID;

public class AccountDetails {
	public String getAccountNo(String name) {
		return "Padm" + UUID.randomUUID().toString();
	}
}
