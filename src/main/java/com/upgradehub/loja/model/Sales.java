package com.upgradehub.loja.model;

import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "sales")
@Builder
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private LocalDate localDate;

    @ManyToOne
    @JoinColumn(name = "id_client")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "sales-products",
            joinColumns = @JoinColumn(name = "id_sales", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_product", referencedColumnName = "id"))
    List<Product> products = new ArrayList<Product>();


    public Sales(Long id, List<Product> products, LocalDate localDate) {
        Id = id;
        this.products = products;
        this.localDate = localDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }
}