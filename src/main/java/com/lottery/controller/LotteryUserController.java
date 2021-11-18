package com.lottery.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.model.LotteryUserLoginTo;
import com.lottery.model.LotteryUserTo;
import com.lottery.service.LotteryUserService;

@RestController
@RequestMapping("/users/v1")
public class LotteryUserController {

	@Autowired
	LotteryUserService lotteryUserService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ResponseEntity<String> login(@Valid @RequestBody LotteryUserLoginTo lotteryUserLoginTo) {
		return new ResponseEntity<String>(lotteryUserService.login(lotteryUserLoginTo), HttpStatus.OK);
	}

	@PostMapping("/signup")
	public ResponseEntity<String> signUp(@Valid @RequestBody LotteryUserTo lotteryUserTo) {
		return new ResponseEntity<String>(lotteryUserService.signUp(lotteryUserTo), HttpStatus.OK);
	}

}
