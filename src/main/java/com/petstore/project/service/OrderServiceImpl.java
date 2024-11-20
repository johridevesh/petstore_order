package com.petstore.project.service;

import com.petstore.project.entity.OrderEntity;
import com.petstore.project.model.Order;
import com.petstore.project.model.OrderResponse;
import com.petstore.project.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<OrderResponse> listAllOrders() {
        return orderRepository.findAll().stream()
                .map(this::convertEntityToModel)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteOrderById(Integer id) {
        orderRepository.deleteById(id);
    }

    @Override
    public OrderResponse getOrderById(Integer id) {
        return orderRepository.findById(id)
                .map(this::convertEntityToModel)
                .orElse(null);
    }

    @Override
    public OrderResponse updateOrder(Integer id, Order order) {
        OrderEntity orderEntity = convertModelToEntity(order);
        orderEntity.setId(id);
        OrderEntity updatedEntity = orderRepository.save(orderEntity);
        return convertEntityToModel(updatedEntity);
    }

    @Override
    public OrderResponse createOrder(Order order) {
        OrderEntity orderEntity = convertModelToEntity(order);
        OrderEntity savedEntity = orderRepository.save(orderEntity);
        return convertEntityToModel(savedEntity);
    }

    private OrderResponse convertEntityToModel(OrderEntity entity) {
        return new OrderResponse()
                .id(entity.getId())
                .customerId(entity.getCustomerId())
                .orderDate(entity.getOrderDate())
                .status(entity.getStatus())
                .totalAmount(entity.getTotalAmount());
    }

    private OrderEntity convertModelToEntity(Order order) {
        OrderEntity entity = new OrderEntity();
        entity.setId(order.getId());
        entity.setCustomerId(order.getCustomerId());
        entity.setOrderDate(order.getOrderDate());
        entity.setStatus(order.getStatus());
        entity.setTotalAmount(order.getTotalAmount());
        return entity;
    }
}