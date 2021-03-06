package com.mito.webflux2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
	private Long base_stat;
	private Stat stat;

	public Long getBase_stat() {
		return base_stat;
	}

	public void setBase_stat(Long base_stat) {
		this.base_stat = base_stat;
	}

	public Stat getStat() {
		return stat;
	}

	public void setStat(Stat stat) {
		this.stat = stat;
	}

}
