package com.komo.learnflyway.service;

import com.komo.learnflyway.entity.Product;
import com.komo.learnflyway.entity.ProductDetail;
import com.komo.learnflyway.repository.ProductDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ProductServiceImpl implements ProductService {

    private final ProductDetailRepository productDetailRepository;

    @Override
    public void createProductDetail(ProductDetail productDetail) {

        productDetailRepository.save(productDetail);

    }

}
