package com.postgres.lj88.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "lj88_homies_details")
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String date;
	private String spender;
	private long total_amount;
	private long share_amount;
	@Column(name = "shared_with")
    private String sharedWith;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getSpender() {
		return spender;
	}
	public void setSpender(String spender) {
		this.spender = spender;
	}
	public long getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(long total_amount) {
		this.total_amount = total_amount;
	}
	public long getShare_amount() {
		return share_amount;
	}
	public void setShare_amount(long share_amount) {
		this.share_amount = share_amount;
	}
	public String getShared_with() {
		return sharedWith;
	}
	public void setShared_with(String shared_with) {
		this.sharedWith = shared_with;
	}

    }
