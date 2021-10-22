package com.upgradehub.loja.service;

import com.upgradehub.loja.exception.ProductNotFound;
import com.upgradehub.loja.model.Product;
import com.upgradehub.loja.repository.ProductRepository;
import com.upgradehub.loja.request.NewProductRQ;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //Find all
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    //Find by Id
    public Product findById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFound("Product doesn't exists."));
    }

    //Save product
    public Product addProduct(NewProductRQ product){
        Product newProduct = Product.builder().name(product.getName()).price(product.getPrice()).build();
        productRepository.save(newProduct);
        return newProduct;
    }

    //Update product
    public Product updatePrice(Long id, Long Price) {
        Product product = productRepository.findById(id).orElseThrow(() -> new ProductNotFound("Product doesn't exists."));
        product.setPrice(Price);
        return productRepository.save(product);
    }

    //Delete by Id
    public void deleteById(Long productId) {
        productRepository.deleteById(productId);
    }
}
