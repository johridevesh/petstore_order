package com.petstore.project.service;

import com.petstore.project.model.Order;
import com.petstore.project.model.OrderResponse;
import java.util.List;

public interface OrderService {

    /**
     * List all orders
     *
     * @return A list of OrderResponse
     */
    List<OrderResponse> listAllOrders();

    /**
     * Delete an order by ID
     *
     * @param id the ID of the order to delete
     */
    void deleteOrderById(Integer id);

    /**
     * Get an order by ID
     *
     * @param id the ID of the order
     * @return the OrderResponse
     */
    OrderResponse getOrderById(Integer id);

    /**
     * Update an order
     *
     * @param id the ID of the order to update
     * @param order the order details to update
     * @return the updated OrderResponse
     */
    OrderResponse updateOrder(Integer id, Order order);

    /**
     * Create a new order
     *
     * @param order the order details
     * @return the created OrderResponse
     */
    OrderResponse createOrder(Order order);
}
