package com.lottery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.lottery.entity.LotteryUser;

@Repository
public interface LotteryUserRepository extends JpaRepository<LotteryUser, Integer> {

	@Query(value = "select user from LotteryUser user where user.phoneNumber = ?1")
	public LotteryUser findByPhoneNumber(String phoneNumber);

}