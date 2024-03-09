package com.postgres.lj88;

public class ShareDto {
	private String name;
    private Integer amount;

	public ShareDto(String name, Integer value) {
        this.setName(name);
        this.setAmount(value);
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
