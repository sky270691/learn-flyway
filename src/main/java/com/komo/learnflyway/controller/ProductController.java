package com.komo.learnflyway.controller;

import com.komo.learnflyway.entity.Product;
import com.komo.learnflyway.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public ResponseEntity<?> getAllProducts(){

        List<Product> productList = productRepository.findAll();
        return ResponseEntity.ok(productList);
    }

}
