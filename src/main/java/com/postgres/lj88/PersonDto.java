package com.postgres.lj88;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class PersonDto {
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
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
}
