package com.micro.ex.account.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/accounts")
public class AccountManagementController {

	@GetMapping("/status/check")
	public String status() {
		return "working...";
	}
}
