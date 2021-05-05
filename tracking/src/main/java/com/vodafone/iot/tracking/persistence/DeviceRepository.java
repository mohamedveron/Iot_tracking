package com.vodafone.iot.tracking.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vodafone.iot.tracking.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long>{

}
