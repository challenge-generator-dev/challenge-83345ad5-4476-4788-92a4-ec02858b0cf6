package com.example.orders.infrastructure.persistence;

import com.example.orders.domain.Order;
import com.example.orders.domain.OrderRepository;
import com.example.orders.domain.OrderStatus;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class OrderJpaRepository implements OrderRepository {
    // TODO(reto): Implementar los métodos del puerto OrderRepository usando JPA
    @Override
    public List<Order> findAll() {
        return List.of();
    }

    @Override
    public List<Order> findByStatus(OrderStatus status) {
        return List.of();
    }

    @Override
    public Optional<Order> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Order save(Order order) {
        return null;
    }
}