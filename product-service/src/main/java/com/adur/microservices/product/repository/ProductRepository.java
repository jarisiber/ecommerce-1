package com.adur.microservices.product.repository;

import com.adur.microservices.product.model.Product;
import com.mongodb.client.MongoDatabase;
import org.springframework.data.mongodb.repository.MongoRepository;

/*
 * Created 16/09/2024 - 19:18
 * @author Jarisiber
 * +62 813 8522 9903
 */
public interface ProductRepository extends MongoRepository<Product, String> {
}
