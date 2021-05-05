package com.vodafone.iot.tracking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vodafone.iot.tracking.model.Device;
import com.vodafone.iot.tracking.model.SIMCard;
import com.vodafone.iot.tracking.persistence.DeviceRepository;
import com.vodafone.iot.tracking.persistence.SIMCardRepository;

@Service
public class DeviceServiceImp implements DeviceService{
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Autowired
	private SIMCardRepository SimCardRepository;

	@Override
	public long createDevice(Device d) {
		
		Device device = d;
		try {
			 device = deviceRepository.save(d);
			 return device.getId();
		} catch (Exception e) {
			System.out.println("can't create device");
			return -1;
		}
		
	}

	@Override
	public void addSIMCardToDevice(long deviceId, SIMCard card) {
		
		
		try {
			Device device = deviceRepository.getOne(deviceId);
			SIMCard simCard = SimCardRepository.save(card);
			
			device.setSimCard(simCard);
			deviceRepository.save(device);
			
		} catch (Exception e) {
			System.out.println("can't add sim card to device");
		}
		
	}

	@Override
	public List<Device> getpendingDevices() {
		
		try {
			
			return deviceRepository.getpendingDevices();
			
		} catch (Exception e) {
			System.out.println("can't get pending device");
			return null;
		}
	}

}
