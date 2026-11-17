package com.example.orders.application;

import com.example.orders.domain.Order;
import com.example.orders.domain.OrderRepository;
import com.example.orders.domain.OrderStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders() {
        // TODO(reto): Implementar la lógica para obtener todas las órdenes
        return List.of();
    }

    public List<Order> getOrdersByStatus(OrderStatus status) {
        // TODO(reto): Implementar la lógica para filtrar órdenes por estado
        return List.of();
    }
}