package com.adur.microservices.order.service;

import com.adur.microservices.order.dto.OrderRequest;
import com.adur.microservices.order.model.Order;
import com.adur.microservices.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/*
 * Created 16/09/2024 - 22:56
 * @author Jarisiber
 * +62 813 8522 9903
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest) {
    // map OrderRequest to Order object
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        order.setPrice(orderRequest.price());
        order.setSkuCode(orderRequest.skuCode());
        order.setQuantity(orderRequest.quantity());
        orderRepository.save(order);
    // save order to OrderRepository

    }
}
