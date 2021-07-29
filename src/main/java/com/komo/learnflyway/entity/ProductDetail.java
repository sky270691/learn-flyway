package com.komo.learnflyway.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "product_detail")
@Data
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull @NotBlank
    private Long id;

    @Column(name = "exp_date")
    @NotNull @NotBlank
    private LocalDate expDate;

}
