package com.booking.engine.dto.response;

import com.booking.engine.entity.enums.BookingStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record BookingResponse(
        Long id,
        UserResponse user,
        ResourceResponse resource,
        LocalDateTime startTime,
        LocalDateTime endTime,
        BigDecimal totalPrice,
        BookingStatus status,
        LocalDateTime createdAt
) {
}
