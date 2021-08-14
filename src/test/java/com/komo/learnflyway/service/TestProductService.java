package com.komo.learnflyway.service;

import com.komo.learnflyway.entity.ProductDetail;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;
import java.time.Month;

@SpringBootTest
@ActiveProfiles("testing")
public class TestProductService {

    @Autowired
    ProductService productService;

    @Test
    void addProductDetailTest() throws Exception{


        ProductDetail pd = new ProductDetail();
        pd.setOther("blablablabla");
        pd.setExpDate(LocalDate.of(2021, Month.FEBRUARY,21));

        productService.createProductDetail(pd);
    }

}
