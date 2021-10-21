package com.upgradehub.loja.service;

import com.upgradehub.loja.model.Product;
import com.upgradehub.loja.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


}
