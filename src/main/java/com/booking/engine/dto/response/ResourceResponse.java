package com.booking.engine.dto.response;

import com.booking.engine.entity.enums.ResourceStatus;
import com.booking.engine.entity.enums.ResourceType;

import java.math.BigDecimal;
import java.util.Map;

public record ResourceResponse(
        Long id,
        String name,
        ResourceType type,
        BigDecimal pricePerHour,
        Integer capacity,
        ResourceStatus status,
        Map<String, Object> attributes,
        Long businessId
){
}
