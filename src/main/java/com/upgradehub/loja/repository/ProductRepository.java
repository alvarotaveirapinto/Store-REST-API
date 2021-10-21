package com.upgradehub.loja.repository;

import com.upgradehub.loja.model.Product;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public interface ProductRepository extends JpaRepository<Product, Long> {
}
