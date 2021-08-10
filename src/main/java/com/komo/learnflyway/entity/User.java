package com.komo.learnflyway.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @OneToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    @JoinColumn(name = "user_id")
    private List<Product> productList;

}
