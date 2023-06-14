package com.order.app.security.services;


import com.order.app.models.order.Order;

public interface OrderService {
    Order createOrder(Order order);
}
