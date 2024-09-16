package com.adur.microservices.order.repository;

import com.adur.microservices.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Created 16/09/2024 - 22:55
 * @author Jarisiber
 * +62 813 8522 9903
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
