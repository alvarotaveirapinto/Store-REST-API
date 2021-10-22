package com.upgradehub.loja.controller;

import com.upgradehub.loja.model.Client;
import com.upgradehub.loja.model.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SalesRQ {
    private List<Product> productList;
    private Client client;
}

