package com.upgradehub.loja.service;

import com.upgradehub.loja.controller.SalesRQ;
import com.upgradehub.loja.exception.ClientNotFound;
import com.upgradehub.loja.model.Sales;
import com.upgradehub.loja.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class SalesService {
    @Autowired
    private SalesRepository salesRepository;


    public Sales addSale(SalesRQ sale) {
        Sales newsale = Sales.builder().products(sale.getProductList()).localDate(LocalDate.now()).client(sale.getClient()).build();
        salesRepository.save(newsale);
        return newsale;}

    public Sales finByClientName(String name) {

        return salesRepository.getSalesByClientName(name).orElseThrow(() -> new ClientNotFound("There are no sales for this client"));
    }
}
