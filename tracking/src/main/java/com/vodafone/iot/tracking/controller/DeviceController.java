package com.vodafone.iot.tracking.controller;

import java.util.ArrayList;
import java.util.List;

import org.openapitools.api.DevicesApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.vodafone.iot.tracking.client.model.Device;
import com.vodafone.iot.tracking.client.model.DeviceDetails;
import com.vodafone.iot.tracking.client.model.SIMCard;
import com.vodafone.iot.tracking.service.DeviceService;

@RestController
public class DeviceController implements DevicesApi{
	
	@Autowired
	private DeviceService deviceService;
	
	@Override
	public  ResponseEntity<Long> createDevice(Device device) {
		
		com.vodafone.iot.tracking.model.Device newDevice = new com.vodafone.iot.tracking.model.Device(device.getStatus(), device.getTemperature(), null);
		
		try {
			long deviceId = deviceService.createDevice(newDevice);
			return new ResponseEntity<Long>(deviceId, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Long>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	@Override
	 // Override this method
    public  ResponseEntity<Void> configureDevice(Long id, SIMCard simCard) {
        
		com.vodafone.iot.tracking.model.SIMCard card = new com.vodafone.iot.tracking.model.SIMCard(simCard.getStatus(), simCard.getOperatorCode(), simCard.getCountry());
		
		try {
			deviceService.addSIMCardToDevice(id, card);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

    }
	
	@Override
	public  ResponseEntity<List<DeviceDetails>> getPendingDevices() {
		
		List<DeviceDetails> response = new ArrayList<DeviceDetails>();
		
		try {
			List<com.vodafone.iot.tracking.model.Device> devices = deviceService.getPendingDevices();
			
			for(com.vodafone.iot.tracking.model.Device d : devices) {
				
				SIMCard card = SIMCard.builder()
						.operatorCode(d.getSimCard().getCode())
						.status(d.getSimCard().getStatus())
						.country(d.getSimCard().getCountry())
						.build();
				
				DeviceDetails device = DeviceDetails.builder()
						.id(d.getId())
						.temperature(d.getTemperature())
						.status(d.getStatus())
						.siMCard(card)
						.build();
				
				response.add(device);
			}
			return new ResponseEntity<List<DeviceDetails>>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<DeviceDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	@Override
	public  ResponseEntity<List<DeviceDetails>> getReadyDevices() {
        
		List<DeviceDetails> response = new ArrayList<DeviceDetails>();
		
		try {
			List<com.vodafone.iot.tracking.model.Device> devices = deviceService.getReadyForSaleDevices();
			
			for(com.vodafone.iot.tracking.model.Device d : devices) {
				
				SIMCard card = SIMCard.builder()
						.operatorCode(d.getSimCard().getCode())
						.status(d.getSimCard().getStatus())
						.country(d.getSimCard().getCountry())
						.build();
				
				DeviceDetails device = DeviceDetails.builder()
						.id(d.getId())
						.temperature(d.getTemperature())
						.status(d.getStatus())
						.siMCard(card)
						.build();
				
				response.add(device);
			}
			return new ResponseEntity<List<DeviceDetails>>(response, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<DeviceDetails>>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	
	@Override
	public  ResponseEntity<Void> updateDevice(Long deviceId, String status) {
		try {
			deviceService.changeDeviceStatus(deviceId, status);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

    }
}
