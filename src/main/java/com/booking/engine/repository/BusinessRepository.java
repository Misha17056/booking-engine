package com.booking.engine.repository;

import com.booking.engine.entity.Business;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepository extends JpaRepository<Business,Integer> {
}
