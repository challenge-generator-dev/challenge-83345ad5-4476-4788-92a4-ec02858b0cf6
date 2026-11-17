package com.example.orders.application.dto;

import com.example.orders.domain.OrderStatus;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public record OrderResponseDto(
    Long id,
    String customerId,
    OrderStatus status,
    BigDecimal totalAmount,
    LocalDateTime createdAt
) {}