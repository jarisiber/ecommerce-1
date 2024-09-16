package com.adur.microservices.product.service;

import com.adur.microservices.product.dto.ProductRequest;
import com.adur.microservices.product.dto.ProductResponse;
import com.adur.microservices.product.model.Product;
import com.adur.microservices.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 * Created 16/09/2024 - 21:46
 * @author Jarisiber
 * +62 813 8522 9903
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

 private final ProductRepository productRepository;

 public ProductResponse createProduct(ProductRequest productRequest) {
  Product product = Product.builder()
          .name(productRequest.name())
          .description(productRequest.description())
          .skuCode(productRequest.skuCode())
          .price(productRequest.price())
          .build();
  productRepository.save(product);
  log.info("Product created successfully");
  return new ProductResponse(product.getId(), product.getName(), product.getDescription(),
          product.getPrice());
 }

 public List<ProductResponse> getAllProducts() {
  return productRepository.findAll()
          .stream()
          .map(product -> new ProductResponse(product.getId(), product.getName(), product.getDescription(),
                  product.getPrice()))
          .toList();
 }
}