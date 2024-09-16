package com.adur.microservices.product.dto;

import java.math.BigDecimal;

/*
 * Created 16/09/2024 - 21:56
 * @author Jarisiber
 * +62 813 8522 9903
 */
public record ProductResponse(String id, String name, String description,
                              BigDecimal price) {
}
