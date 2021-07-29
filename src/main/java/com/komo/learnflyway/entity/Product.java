package com.komo.learnflyway.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity @Getter @Setter
@Data
public class Product {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Size(min = 3, max = 255)
    @NotNull @NotBlank
    private String name;

    @Column(name = "created_date")
    @NotNull @NotBlank
    private LocalDateTime createdDate;

    @OneToOne
    @JoinColumn(name = "product_detail_id")
    private ProductDetail productDetail;

}
