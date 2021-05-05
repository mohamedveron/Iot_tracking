package com.vodafone.iot.tracking.service;

import com.vodafone.iot.tracking.model.Device;
import com.vodafone.iot.tracking.model.SIMCard;

public interface DeviceService {
	
	public void createDevice(Device d);
	public void addSIMCardToDevice(long deviceId, SIMCard card);
}
