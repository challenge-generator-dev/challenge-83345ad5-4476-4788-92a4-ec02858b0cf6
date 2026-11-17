package com.example.orders.infrastructure.web;

import com.example.orders.application.OrderService;
import com.example.orders.application.dto.OrderResponseDto;
import com.example.orders.domain.OrderStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<OrderResponseDto>> getAllOrders(
            @RequestParam(required = false) OrderStatus status) {
        // TODO(reto): Implementar la lógica para obtener órdenes
        // Si status es null, retornar todas las órdenes
        // Si status tiene valor, filtrar por ese estado
        // Usar OrderResponseDto para la respuesta
        return null;
    }
}