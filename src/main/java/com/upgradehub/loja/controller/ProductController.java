package com.upgradehub.loja.controller;

import com.upgradehub.loja.model.Product;
import com.upgradehub.loja.request.NewProductRQ;
//import com.upgradehub.loja.request.UpdateProductRQ;
import com.upgradehub.loja.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //Get all
    @GetMapping(value = "/product")
    public List<Product> getProductList() {
        return productService.findAll();
    }

//    //Get by id
//    @GetMapping(value = "/product/{id}")
//    public Product getProduct(@PathVariable(value = "id") Long productId) {
//        return productService.findById(productId);
//    }

    //Create product
    @PostMapping("/product")
    public Product addProduct(@RequestBody NewProductRQ newProduct) {
            return productService.addProduct(newProduct);
    }

//    //Update
//    @PutMapping("/product/{id}/price")
//    public ResponseEntity updatePrice(@PathVariable Long id, @RequestBody UpdateProductRQ request) {
//        final Product updatedProduct = productService.updatePrice(id, request.getPrice());
//        return ResponseEntity.created(URI.create("/product/" + id + "/price")).body("Updated Price");
//    }

    //Delete by id
    @DeleteMapping(path = "/product/{id}")
    public void deleteProduct(@PathVariable(value = "id") Long productId) {
        productService.deleteById(productId);
    }

}
