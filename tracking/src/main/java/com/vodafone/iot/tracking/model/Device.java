package com.vodafone.iot.tracking.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="device")
public class Device {
	
	@Id
	@GeneratedValue
	private Long id;
	@Getter
	@Setter
	private String status;
	@Getter
	@Setter
    private float temperature;
    
    @OneToOne
    @JoinColumn(name = "simcard_id", nullable=true)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private SIMCard simCard;

	public Device() {
	}

	public Device(Long id, String status, float temperature, SIMCard simCard) {
		super();
		this.id = id;
		this.status = status;
		this.temperature = temperature;
		this.simCard = simCard;
	}
    
    
}
