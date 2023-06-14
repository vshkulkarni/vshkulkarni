package com.order.app.service;


import com.order.app.models.order.Order;

public interface OrderService {
    Order createOrder(Order order);
}
