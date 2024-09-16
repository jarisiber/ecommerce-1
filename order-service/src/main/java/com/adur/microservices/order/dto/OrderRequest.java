package com.adur.microservices.order.dto;

import java.math.BigDecimal;

/*
 * Created 16/09/2024 - 22:58
 * @author Jarisiber
 * +62 813 8522 9903
 */
public record OrderRequest(Long id, String orderNumber, String skuCode,
                           BigDecimal price, Integer quantity) {
}
