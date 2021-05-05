package com.vodafone.iot.tracking.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vodafone.iot.tracking.model.SIMCard;

@Repository
public interface SIMCardRepository extends JpaRepository<SIMCard, Long>{

}
