package com.vodafone.iot.tracking.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vodafone.iot.tracking.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long>{
	
	@Query("select d from Device d where d.simCard.status = 'waiting'")
	public List<Device>	getPendingDevices();
	@Query("select d from Device d where d.status = 'ready' and d.temperature between -25 and 80")
	public List<Device>	getReadyDevices();
}
