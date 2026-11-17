package com.example.orders.domain;

import java.util.List;
import java.util.Optional;

public interface OrderRepository {
    List<Order> findAll();
    List<Order> findByStatus(OrderStatus status);
    Optional<Order> findById(Long id);
    Order save(Order order);
}