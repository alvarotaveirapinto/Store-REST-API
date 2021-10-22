package com.upgradehub.loja.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private long price;

    @ManyToMany(mappedBy = "products")
    private List<Sales> salesList;
}