package com.booking.engine.repository;

import com.booking.engine.entity.Resource;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<Resource,Integer> {
}
