package com.adur.microservices.product.dto;

import java.math.BigDecimal;

/*
 * Created 16/09/2024 - 21:45
 * @author Jarisiber
 * +62 813 8522 9903
 */
public record ProductRequest(String id, String name, String description,
                             String skuCode, BigDecimal price) {
}
