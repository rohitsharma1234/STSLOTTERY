package com.lottery.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lottery.entity.Slot;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Integer> {
	@Modifying
	@Transactional
	@Query(value = "UPDATE Slot SET  quantity:=quantity  ")
	public void  updateQuantity(Integer quantity);
}
