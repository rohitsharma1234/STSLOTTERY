  package com.lottery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lottery.model.SlotTo;
import com.lottery.service.SlotService;

@RestController
@RequestMapping("/slots/v1")
public class SlotController {

	@Autowired
	private SlotService slotService;

	@GetMapping("/")
	public ResponseEntity<SlotTo> findNextSlot() {
		return new ResponseEntity<SlotTo>(slotService.findNextSlot(), HttpStatus.OK);
	}
}
