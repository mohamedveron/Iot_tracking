package com.vodafone.iot.tracking.service;

import java.util.List;

import com.vodafone.iot.tracking.model.Device;
import com.vodafone.iot.tracking.model.SIMCard;

public interface DeviceService {
	
	public long createDevice(Device d);
	public void addSIMCardToDevice(long deviceId, SIMCard card);
	public List<Device>	getpendingDevices();
}
