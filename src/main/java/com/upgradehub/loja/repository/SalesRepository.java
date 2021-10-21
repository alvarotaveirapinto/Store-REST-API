package com.upgradehub.loja.repository;

import com.upgradehub.loja.model.Sales;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@Primary
public interface SalesRepository extends JpaRepository<Sales, Long> {
    Optional<Sales> getSalesByClient(String name);
}
