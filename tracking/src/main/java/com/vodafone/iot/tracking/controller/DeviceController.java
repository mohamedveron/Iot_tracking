package com.vodafone.iot.tracking.controller;

import org.openapitools.api.DevicesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.iot.tracking.client.model.Device;
import com.vodafone.iot.tracking.client.model.SIMCard;
import com.vodafone.iot.tracking.service.DeviceService;

@RestController
public class DeviceController implements DevicesApi{
	
	@Autowired
	private DeviceService deviceService;
	
	@Override
	public  ResponseEntity<Void> createDevice(Device device) {
		
		com.vodafone.iot.tracking.model.Device newDevice = new com.vodafone.iot.tracking.model.Device(device.getStatus(), device.getTemperature(), null);
		
		try {
			deviceService.createDevice(newDevice);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	@Override
	 // Override this method
    public  ResponseEntity<Void> configureDevice(Long id, SIMCard siMCard) {
        
		com.vodafone.iot.tracking.model.SIMCard card = new com.vodafone.iot.tracking.model.SIMCard();
		
		try {
			deviceService.addSIMCardToDevice(id, card);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

    }
}
