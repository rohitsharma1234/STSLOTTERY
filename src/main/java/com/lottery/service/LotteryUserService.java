package com.lottery.service;

import java.util.Calendar;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lottery.entity.LotteryUser;
import com.lottery.model.LotteryUserLoginTo;
import com.lottery.model.LotteryUserTo;
import com.lottery.repository.LotteryUserRepository;

@Service
@Transactional
public class LotteryUserService {

	private final String BAD_CREDS = "Bad Credentials";
	private final String SUCCESS = "Successful Login";
	private final String DUPLICATE_USER = "Duplicate User";
	private final String USER_ADDED = "User Created Successfully";
	private final String PASSWORD_AND_CONFIRM_PASSWORD_MISMATCH = "Password and Confirm Password did not match.";

	@Autowired
	LotteryUserRepository lotteryUserRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	public String login(LotteryUserLoginTo userTo) {
		LotteryUser userJpa = lotteryUserRepository.findByPhoneNumber(userTo.getPhoneNumber());
		return userJpa != null && bCryptPasswordEncoder.matches(userTo.getPassword(), userJpa.getUserPassword())
				? SUCCESS
				: BAD_CREDS;
	}

	public String signUp(LotteryUserTo createUserTo) {
		if (!isPasswordAndConfmPasswordSame(createUserTo.getConfirmPassword(), createUserTo.getUserPassword())) {
			return PASSWORD_AND_CONFIRM_PASSWORD_MISMATCH;
		}
		LotteryUser existingUser = lotteryUserRepository.findByPhoneNumber(createUserTo.getPhoneNumber());
		if (existingUser == null) {
			existingUser = new LotteryUser();
			populateUserJpaFromCreateUserTo(createUserTo, existingUser);
			lotteryUserRepository.save(existingUser);
			return USER_ADDED;
		}
		return DUPLICATE_USER;
	}

	private boolean isPasswordAndConfmPasswordSame(String password, String confirmPassword) {
		return password.equals(confirmPassword);
	}

	private void populateUserJpaFromCreateUserTo(LotteryUserTo createUserTo, LotteryUser userJpa) {
		userJpa.setDateOfBirth(createUserTo.getDateOfBirth());
		userJpa.setEmailId(createUserTo.getEmailId());
		userJpa.setFirstName(createUserTo.getFirstName());
		userJpa.setLastName(createUserTo.getLastName());
		userJpa.setMiddleName(createUserTo.getMiddleName());
		userJpa.setMobileNo(createUserTo.getPhoneNumber());
		userJpa.setUserPassword(bCryptPasswordEncoder.encode(createUserTo.getUserPassword()));
		userJpa.setUpdatedDt(Calendar.getInstance().getTime());
	}
}
