package com.upgradehub.loja.controller;

import com.upgradehub.loja.model.Product;
import com.upgradehub.loja.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;


}
