package com.lottery.service;

import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lottery.entity.Slot;
import com.lottery.model.SlotTo;
import com.lottery.repository.SlotRepository;

@Service
public class SlotService {

	@Autowired
	private SlotRepository slotRepository;

         public void update() {
              Slot userSlot=slotRepository.updateQuantity(Integer);
              
              
         }
         

}
