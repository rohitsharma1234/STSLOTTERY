package com.lottery.model;

import java.io.Serializable;
import java.util.Date;

public class SlotTo implements Serializable {

	private static final long serialVersionUID = 1L;
      
	private Integer slotId;
	private  Integer date;
	private Integer archiveFlag;
	private Integer price;
	
	private Integer quantity;

	public Integer getSlotId() {
		return slotId;
	}

	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Integer getArchiveFlag() {
		return archiveFlag;
	}

	public void setArchiveFlag(Integer archiveFlag) {
		this.archiveFlag = archiveFlag;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	
	
	
	

	

}
