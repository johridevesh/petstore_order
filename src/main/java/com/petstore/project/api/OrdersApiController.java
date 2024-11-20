package com.petstore.project.api;

import com.petstore.project.model.Order;
import com.petstore.project.model.OrderResponse;
import com.petstore.project.service.OrderService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@Validated
@Tag(name = "orders", description = "the orders API")
@RestController
@RequestMapping("/orders")
public class OrdersApiController implements OrdersApi {

    @Autowired
    private OrderService orderService;

    @Override
    public ResponseEntity<List<OrderResponse>> ordersGet() throws Exception {
        List<OrderResponse> orders = orderService.listAllOrders();
        return new ResponseEntity<>(orders, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> ordersIdDelete(@PathVariable("id") Integer id) throws Exception {
        orderService.deleteOrderById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<OrderResponse> ordersIdGet(@PathVariable("id") Integer id) throws Exception {
        OrderResponse order = orderService.getOrderById(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<OrderResponse> ordersIdPut(@PathVariable("id") Integer id, @Valid @RequestBody(required = false) Order order) throws Exception {
        OrderResponse updatedOrder = orderService.updateOrder(id, order);
        return new ResponseEntity<>(updatedOrder, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<OrderResponse> ordersPost(@Valid @RequestBody(required = false) Order order) throws Exception {
        OrderResponse createdOrder = orderService.createOrder(order);
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }
}