package com.upgradehub.loja.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private List<Product> productList;

    private LocalDate localDate;

    @ManyToMany
    private Product product;

    public Sales(Long id, List<Product> productList, LocalDate localDate) {
        Id = id;
        this.productList = productList;
        this.localDate = localDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}
