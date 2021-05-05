package com.vodafone.iot.tracking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.iot.tracking.model.Device;
import com.vodafone.iot.tracking.model.SIMCard;
import com.vodafone.iot.tracking.persistence.DeviceRepository;

@Service
public class DeviceServiceImp implements DeviceService{
	
	@Autowired
	private DeviceRepository deviceRepository;

	@Override
	public void createDevice(Device d) {
		
		try {
			deviceRepository.save(d);
		} catch (Exception e) {
			System.out.println("can't create device");
		}
		
	}

	@Override
	public void addSIMCardToDevice(long deviceId, SIMCard card) {
		
		Device device = deviceRepository.getOne(deviceId);
		
		
		device.setSimCard(card);
		
	}

}
