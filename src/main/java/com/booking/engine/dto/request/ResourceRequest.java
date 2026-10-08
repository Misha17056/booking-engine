package com.booking.engine.dto.request;

import com.booking.engine.entity.enums.ResourceStatus;
import com.booking.engine.entity.enums.ResourceType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.Map;

public record ResourceRequest(
        @NotBlank(message = "Resource name is required")
        String name,

        @NotNull(message = "Resource type is required")
        ResourceType type,

        @NotNull(message = "Price per hour is required")
        @Positive(message = "Price per hour must be positive")
        BigDecimal pricePerHour,

        @NotNull(message = "Capacity is required")
        @Positive(message = "Capacity must be positive")
        Integer capacity,

        @NotNull(message = "Status is required")
        ResourceStatus status,

        Map<String, Object> attributes,

        @NotNull(message = "Business ID is required")
        Long businessId



) {
}
