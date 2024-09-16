package com.adur.microservices.product.controller;

import com.adur.microservices.product.dto.ProductRequest;
import com.adur.microservices.product.dto.ProductResponse;
import com.adur.microservices.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
 * Created 16/09/2024 - 19:19
 * @author Jarisiber
 * +62 813 8522 9903
 */
@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse createProduct(@RequestBody ProductRequest productRequest) {
        return productService.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }
}
