package com.komo.learnflyway.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "product_detail")
@Data
@EntityListeners(AuditingEntityListener.class)
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "exp_date")
    @NotNull
    private LocalDate expDate;

    @Column(name = "created_date")
    @CreatedDate
    private Long createdDate;

    @NotEmpty
    private String other;

}
