package com.vodafone.iot.tracking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="card")
public class SIMCard {
	
	@Id
	@GeneratedValue
	@Getter
	private Long id;
	@Getter
	@Setter
	private String status;
	@Getter
	@Setter
	private String code;
	@Getter
	@Setter
	private String country;
	
	
	public SIMCard() {
	}
	
	public SIMCard(String status, String code, String country) {
		super();
		this.status = status;
		this.code = code;
		this.country = country;
	}
	
	

}
