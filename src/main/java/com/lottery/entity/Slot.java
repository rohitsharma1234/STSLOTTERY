package com.lottery.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

@Entity
@Table(name = "SLOT", schema = "LOTTERYFIRM")
public class Slot implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="slot_id")
	private Integer slotId;
	
	@Column(name="date")
	private Integer date;
	
	@Column(name="archive_flag")
	private Integer archiveFlag;
	
    @Column(name = "price")
	private Integer price;
	
	@Column(name="quantity")
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
