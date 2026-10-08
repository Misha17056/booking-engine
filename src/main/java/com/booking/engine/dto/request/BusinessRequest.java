package com.booking.engine.dto.request;

import jakarta.validation.constraints.NotBlank;

public record BusinessRequest(
        @NotBlank(message = "Business name is required")
        String name,
        String description
) {
}
