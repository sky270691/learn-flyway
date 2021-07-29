package com.komo.learnflyway.repository;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TestProductRepository {

    @Autowired
    ProductRepository productRepository;

    @Test
    void testFetchProductFromDb() throws Exception{

        assertTrue(productRepository.existsById(1L));

    }

}
